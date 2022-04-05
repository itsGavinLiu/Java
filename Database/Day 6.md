# Day 6
1. Relational Database


## 1. Relational Database
A relational database is a collection of data items with pre-defined relationships between them. These items are organized as a set of tables with columns and rows. Tables are used to hold information about the objects to be represented in the database.

### 1.1 Database vs DBMS
- A collection of related pieces of data, whose purpose is to solve the data management needs of an institution is called a Database.

- Database Management Systems (DBMS), on the other hand, are very complex software which save the data on the secondary storage devices and which are used to manipulate databases.


|Category|Database	|DBMS|
|---|---|---|
|Storage	|Besides computers, databases can even be maintained in physical ledgers, books or papers.	|In a database management system (DBMS), all the records are maintained only on a computer.|
|Data Retrieval	|The retrieval of information from the databases can be done manually, through queries or by using programs (C, C++, Java etc.).	|We can retrieve the data from the database management system through queries written in SQL.|
|Speed	|As databases can be handled manually or via computers, when SQL is not used to retrieve information, it can be very slow.	|As a computer system is involved in a database management system, the retrieval of information is very quick.|
|Access	|The databases are not designed for a large number of people who can access data at the same time, rather it is designed for a very small number of people (preferably few people) who access data at different times.	|The database management system is designed for a large number of people who can access the data at the same time.|
|Data Manipulation	|In case of the databases, very less information can be modified at a time.	|In the database management system (DBMS), a lot of information can be changed at one time (as it can have many users using it at the same time).|
|Backup and Recovery	|The databases do not ensure that the data will be available after failure arises.	|The database management system (DBMS) ensures that the data will always be available even after system failures.|


### 1.2 File System vs DBMS

|Basis	|File System	|DBMS|
|---|---|---|
|Structure	|The file system is software that manages and organizes the files in a storage medium within a computer.	|DBMS is software for managing the database. |
|Data Redundancy	|Redundant data can be present in a file system.|	In DBMS there is no redundant data.|
|Backup and Recovery	|It doesn’t provide backup and recovery of data if it is lost.	|It provides backup and recovery of data even if it is lost.|
|Query processing	|There is no efficient query processing in the file system.	|Efficient query processing is there in DBMS.|
|Consistency	|There is less data consistency in the file system.	|There is more data consistency because of the process of normalization.|
|Complexity	|It is less complex as compared to DBMS.	|It has more complexity in handling as compared to the file system.|
|Security Constraints	|File systems provide less security in comparison to DBMS.	|DBMS has more security mechanisms as compared to file systems.|
|Cost	|It is less expensive than DBMS.|	It has a comparatively higher cost than a file system.|
|Data Independence	|There is no data independence.|	In DBMS data independence exists.|
|User Access	|Only one user can access data at a time.	|Multiple users can access data at a time.|


### 1.3 Degree and Cardinality of a relation
The degree of a relationship is the number of entity types that participate(associate) in a relationship. By seeing an E-R diagram, we can simply tell the degree of a relationship i.e the number of an entity type that is connected to a relationship is the degree of that relationship.

We have the following degree of relationships:
- Unary: both the participating entity type are the same. Degree = 1
- Binary: exactly two entity type participates. Degree = 2.
- Ternary: exactly three entity type participates. Degree = 3.
- N-ary: when ‘n’ number of entities are participating. Degree = n.

### 1.4 Participation Constraints

### 1.5 Database Normalization

#### 1.5.1 1NF

#### 1.5.2 2NF

#### 1.5.3 3NF

### 1.6 Document Data Store

