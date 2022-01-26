# Spring Boot Course
 This project consists in an API connected to a PostgreSQL database. In the application the client can add, update, remove or get a list of students.
 
## Layers of the application:
![image](https://user-images.githubusercontent.com/62676057/151173429-9ae39381-76cf-41d2-a4e2-4df022dc18f0.png)

## Entity
The chosen entity was a simple student, and the ```age``` is a transient attribute that calculates its value based on the date of birth

![image](https://user-images.githubusercontent.com/62676057/151173992-1c8ac506-8b86-4d3c-b10f-5127e323089d.png)


## What has been covered in this course 
- How Anotations work (and its benefits for a cleaner too).
- I've learned how Hibernate manage the connection to a database in a very simple way using classes to map the fields on the table and how it can update information using the class methods
- I've learned about Transient fields in Java
