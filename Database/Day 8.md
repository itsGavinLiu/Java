# Day 8
7. SQL vs NoSQL
8. Index
9. SQL/Application Tuning
10. Transaction
11. Concurrency 


## 7. SQL vs NoSQL
|SQL	|NoSQL|
|---|---|
|RELATIONAL DATABASE MANAGEMENT SYSTEM (RDBMS)	|Non-relational or distributed database system.|
|These databases have fixed or static or predefined schema	|They have dynamic schema|
|These databases are not suited for hierarchical data storage.	|These databases are best suited for hierarchical data storage.|
|These databases are best suited for complex queries	|These databases are not so good for complex queries|
|Vertically Scalable	|Horizontally scalable|
|Follows ACID property	|Follows CAP(consistency, availability, partition tolerance)|

## 8. Index
Indexing is the way to get an unordered table into an order that will maximize the query’s efficiency while searching.

Types of Database Indexing:
- Clustered Indexing
- Non-Clustered Indexing

### 8.1 Clustered Indexing
In clustered indexing, one single file can store more than two data records. The system keeps the actual data in clustered indexing rather than the pointers. Searching is cost-efficient with clustered indexing as it stores all the related data in the same place.

A clustering index uses ordered data files to define itself. Also, joining multiple database tables is very common with this type of indexing.

### 8.2 Non-Clustered Indexing
Non-clustered indexing refers to a type of indexing where the order of the index rows is not the same as how the original data is physically stored. Instead, a non-clustered index points to the data storage in the database.

## 9. SQL/Application Tuning

SQL tuning is the iterative process of improving SQL statement performance to meet specific, measurable, and achievable goals.

SQL tuning implies fixing problems in deployed applications. In contrast, application design sets the security and performance goals before deploying an application.

- Using execution plan to identify the cause of slowness (Execution plan is a tool to find out which cause slowness)
- Try to reduce joins, remove unused join and join conditions
- Use the index to improve the performance when we have to use join
- Using Union ALL instead of Union 
- view or stored procedure to improve performance
- select exact fields instead of *

Application tuning
- check the db query - do the sql tuning
- DB connection usage  -> connection pool. Similar with Java thread pool
- do JVM tuning -> Jstack, JMap, JConsole
- server side: CPU, Memory usage by using commands like top, ps
- code review 
- check networking, firewall, load balancer


## 10. Transaction
A transaction is an action, or a series of actions, carried out by a single user or an application program

ACID
- Atomicity
 - all transactions are atomic
 - can’t be executed partially
 - commit or rollback
- Consistency
 - transactions take the database from one consistent state to another state
- Isolation
 - a transaction is not visible to other transactions until it completes
- Durability
 - once a transaction has completed, its changes are made permanent

## 11. Concurrency
Three potential problems:
- dirty read: read uncommitted data from another transaction
- non-repeatable read: read committed data from an update query form another transaction
- phantom read: read committed data from an insert or delete query from another

Based on these phenomena, The SQL standard defines four isolation levels:

- Read Uncommitted – Read Uncommitted is the lowest isolation level. In this level, one transaction may read not yet committed changes made by other transactions, thereby allowing dirty reads. At this level, transactions are not isolated from each other.
- Read Committed – This isolation level guarantees that any data read is committed at the moment it is read. Thus it does not allow dirty read. The transaction holds a read or write lock on the current row, and thus prevents other transactions from reading, updating, or deleting it.
- Repeatable Read – This is the most restrictive isolation level. The transaction holds read locks on all rows it references and writes locks on referenced rows for update and delete actions. Since other transactions cannot read, update or delete these rows, consequently it avoids non-repeatable read.
- Serializable – This is the highest isolation level. A serializable execution is guaranteed to be serializable. Serializable execution is defined to be an execution of operations in which concurrently executing transactions appears to be serially executing.

