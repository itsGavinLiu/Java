# Day 11
2. Hibernate

## 2. Hibernate

### 2.1 ORM
Object-Relational Mapping (**ORM**), is a programming technique for converting data between relational databases and object oriented programming languages such as Java, C#, etc.

An ORM system has the following advantages over plain JDBC:
- Let’s business code access objects rather than DB tables.
- Hides details of SQL queries from OO logic.
- Based on JDBC 'under the hood.'
- No need to deal with the database implementation.
- Entities based on business concepts rather than database structure.
- Transaction management and automatic key generation.
- Fast development of application.


### 2.2 Hibernate Framework
Hibernate is an Object-Relational Mapping (ORM) solution for JAVA. 
![image](https://user-images.githubusercontent.com/40971097/164111353-8a85ca57-665f-4f75-a68a-4a7d48b7f7af.png)

#### 2.2.1 Configuration Object
The Configuration object is the first Hibernate object you create in any Hibernate application. It is usually created only once during application initialization. It represents a configuration or properties file required by the Hibernate.

The Configuration object provides two keys components −
- Database Connection − This is handled through one or more configuration files supported by Hibernate. These files are hibernate.properties and hibernate.cfg.xml.
- Class Mapping Setup − This component creates the connection between the Java classes and database tables.

#### 2.2.2 SessionFactory Object
Configuration object is used to create a SessionFactory object which in turn configures Hibernate for the application using the supplied configuration file and allows for a Session object to be instantiated. The SessionFactory is a thread safe object and used by all the threads of an application.

The SessionFactory is a heavyweight object; it is usually created during application start up and kept for later use. You would need one SessionFactory object per database using a separate configuration file. So, if you are using multiple databases, then you would have to create multiple SessionFactory objects.

#### 2.2.3 Session Object
A Session is used to get a physical connection with a database. The Session object is lightweight and designed to be instantiated each time an interaction is needed with the database. Persistent objects are saved and retrieved through a Session object.

The session objects should not be kept open for a long time because they are not usually thread safe and they should be created and destroyed them as needed.

#### 2.2.4 Transaction Object
A Transaction represents a unit of work with the database and most of the RDBMS supports transaction functionality. Transactions in Hibernate are handled by an underlying transaction manager and transaction (from JDBC or JTA).

This is an optional object and Hibernate applications may choose not to use this interface, instead managing transactions in their own application code.

#### 2.2.5 Query Object
Query objects use SQL or Hibernate Query Language (HQL) string to retrieve data from the database and create objects. A Query instance is used to bind query parameters, limit the number of results returned by the query, and finally to execute the query.

#### 2.2.6 Criteria Object
Criteria objects are used to create and execute object oriented criteria queries to retrieve objects.

### 2.3 Connect with Database and Setup Hibernate


### 2.4 Mapping Examples
- [Hibernate one to many mapping annotation example](https://howtodoinjava.com/hibernate/hibernate-one-to-many-mapping/)
- [Hibernate many to many mapping annotation example](https://howtodoinjava.com/hibernate/hibernate-many-to-many-mapping/)
- [Hibernate One to One Mapping Annotation Example](https://howtodoinjava.com/hibernate/hibernate-one-to-one-mapping/)
