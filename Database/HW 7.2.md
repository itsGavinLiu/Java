# 1. view vs stored procedure
- Stored Procedure : Stored procedures are precompiled database queries that improve the security, efficiency and usability of database client/server applications. 
Developers specify a stored procedure in terms of input and output variables. 
They then compile the code on the database platform and make it available to aplication developers for use in other environments, such as web applications. 
All of the major database platforms, including Oracle, SQL Server and MySQL support stored procedures. 
The major benefits of this technology are the substantial performance gains from precompiled execution, 
the reduction of client/server traffic, development efficiency gains from code reuse and abstraction and the security controls inherent in granting users permissions on specific stored procedures instead of the underlying database tables.
 

- Views: Database views allow you to create "virtual tables" that are generated on the fly when they are accessed. 
A view is stored on the database server as an SQL statement that pulls data from one or more tables and (optionally) performs transformations on that data. 
Users may then query the view just as they would any real database table. 
Views are often used to alleviate security concerns by providing users with access to a certain view of a database table without providing access to the underlying table itself.


![1649390778(1)](https://user-images.githubusercontent.com/40971097/162360550-dc321bba-d3d9-429c-b86b-47d68a547888.png)


# 2. view vs material view

<p align="center"> <img src="https://user-images.githubusercontent.com/40971097/162360722-5d9204a0-bd11-4a72-8d95-e50aadbfef13.png" width="600" height="700" />

