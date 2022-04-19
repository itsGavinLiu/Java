# Day 10
1. JDBC

## 1. JDBC

**JDBC or Java Database Connectivity** is a Java API to connect and execute the query with the database. 
- It provides the language with java database connectivity standards. 
- It is used to write programs required to access databases. JDBC, along with the database driver, can access databases and spreadsheets. 

### 1.1 Components
- JDBC API: It provides various methods and interfaces for easy communication with the database. 
- JDBC Driver manager: It loads a database-specific driver in an application to establish a connection with a database. 
- JDBC Test suite: It is used to test the operation(such as insertion, deletion, updation) being performed by JDBC Drivers.
- JDBC-ODBC Bridge Drivers: It connects database drivers to the database. This bridge translates the JDBC method call to the ODBC function call.

### 1.2 Architecture 
![image](https://user-images.githubusercontent.com/40971097/164017019-ba09af05-fa35-4cf7-abc0-550cbcd40167.png)

A JDBC program comprises the following steps
- allocate a connection object, for connecting to the database
- allocate a statement object, based on the connection
- write sql query, execute query
- process the query result
- close the statement and connection object to free up the resources

### 1.3 Statement vs PreparedStatement vs CallableStatement
Once a connection is obtained we can interact with the database. The JDBC Statement, CallableStatement, and PreparedStatement interfaces define the methods and properties that enable you to send SQL or PL/SQL commands and receive data from your database.

|Interfaces	|Recommended Use|
|---|---|
|Statement	|Use this for general-purpose access to your database. Useful when you are using static SQL statements at runtime. The Statement interface cannot accept parameters.|
|PreparedStatement	|Use this when you plan to use the SQL statements many times. The PreparedStatement interface accepts input parameters at runtime.|
|CallableStatement	|Use this when you want to access the database stored procedures. The CallableStatement interface can also accept runtime input parameters.|

#### 1.3.1 Statement
**Creating Statement Object**

Before you can use a Statement object to execute a SQL statement, you need to create one using the Connection object's `createStatement()` method, as in the following example
```java
Statement stmt = null;
try {
   stmt = conn.createStatement( );
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   . . .
}
```

**Closing Statement Object**
Just as you close a Connection object to save database resources, for the same reason you should also close the Statement object.

A simple call to the close() method will do the job. If you close the Connection object first, it will close the Statement object as well. However, you should always explicitly close the Statement object to ensure proper cleanup.

```java
Statement stmt = null;
try {
   stmt = conn.createStatement( );
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   stmt.close();
}
```

#### 1.3.2 PreparedStatement
The PreparedStatement interface extends the Statement interface, which gives you added functionality with a couple of advantages over a generic Statement object.

This statement gives you the flexibility of supplying arguments dynamically.

**Creating PreparedStatement Object**

```java
PreparedStatement pstmt = null;
try {
   String SQL = "Update Employees SET age = ? WHERE id = ?";
   pstmt = conn.prepareStatement(SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   . . .
}
```

**Closing PreparedStatement Object**

A simple call to the close() method will do the job. If you close the Connection object first, it will close the PreparedStatement object as well. However, you should always explicitly close the PreparedStatement object to ensure proper cleanup.

```java
PreparedStatement pstmt = null;
try {
   String SQL = "Update Employees SET age = ? WHERE id = ?";
   pstmt = conn.prepareStatement(SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   pstmt.close();
}
```

#### 1.3.3 CallableStatement

Just as a Connection object creates the Statement and PreparedStatement objects, it also creates the CallableStatement object, which would be used to execute a call to a database stored procedure.
**Creating CallableStatement Object**

Suppose, you need to execute the following Oracle stored procedure 

```SQL
CREATE OR REPLACE PROCEDURE getEmpName 
   (EMP_ID IN NUMBER, EMP_FIRST OUT VARCHAR) AS
BEGIN
   SELECT first INTO EMP_FIRST
   FROM Employees
   WHERE ID = EMP_ID;
END;
```

The following code snippet shows how to employ the Connection.prepareCall() method to instantiate a CallableStatement object based on the preceding stored procedure

```java
CallableStatement cstmt = null;
try {
   String SQL = "{call getEmpName (?, ?)}";
   cstmt = conn.prepareCall (SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   . . .
}
```

**Closing CallableStatement Object**


A simple call to the close() method will do the job. If you close the Connection object first, it will close the CallableStatement object as well. However, you should always explicitly close the CallableStatement object to ensure proper cleanup.

```java
CallableStatement cstmt = null;
try {
   String SQL = "{call getEmpName (?, ?)}";
   cstmt = conn.prepareCall (SQL);
   . . .
}
catch (SQLException e) {
   . . .
}
finally {
   cstmt.close();
}
```
