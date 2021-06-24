# ProductsInventoryManagementSystem.
This application helps to maintain the inventory of Products. User with Admin rights can add, update, modify and delete the items from inventory and normal user can only view the inventory. User Soap Web services for designing the server-side which helps to authorize the user and performing an operation according to roles. Used Java, JAX-RS, JAX-B, XML, HTML, JSP, Bootstrap, Servlets, JDBC, MYSQL server, and Maven.

---------------------------  Soap Web Service -----------------------

1. Create a database:
	CREATE SCHEMA `testdb`;	
2. Create two tables in the database.
	CREATE TABLE `testdb`.`usermaster` (
	  `Id` INT NOT NULL,
	  `Username` VARCHAR(45) NOT NULL,
	  `Password` VARCHAR(45) NOT NULL,
	  `Email` VARCHAR(45) NOT NULL,
	  `UserRole` VARCHAR(45) NOT NULL,
	  PRIMARY KEY (`Id`));
	
	CREATE TABLE `testdb`.`itemsmaster` (
	  `Id` INT NOT NULL,
	  `Name` VARCHAR(45) NOT NULL,
	  `Price` DECIMAL(6,2) NOT NULL,
	  `Quantity` INT NOT NULL,
	  PRIMARY KEY (`Id`));

3. Create a Maven Web Application (yourName_Test1_HumberID)
4. Create a Web Service (UserService)
5. UserService methods:
	1. InsertUser (UserMaster)
	2. ValidateUser (UserMaster)	



6. Create another Web Service (InventoryService)
7. InventoryService methods	
	1. InsertItem(ItemMaster)
	2. GetAllItems()
  
  --------------------------  Client Side ---------------------------
  
1. Create a Web Application 
2. Add index.jsp
3. Add Register.jsp
4. Add AdminDashboard.jsp
5. Add Dashboard.jsp  
6. Create AuthServlet and implement Authentication
•	If valid user credentials than redirect to AdminDashboard or Dashboard depending on the UserRole (Admin, User)	
7. If not valid user redirect to registration page and implement user registration.
•	After successful registration redirect to Login page	
8. In AdminDashboard add two functionalities.
•	Add new item.
•	View all items.	
9. In User dashboard implement one functionality.
•	View all items.




