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

When a table is unindexed, the order of the rows will likely not be discernible by the query as optimized in any way, and your query will therefore have to search through the rows linearly. In other words, the queries will have to search through every row to find the rows matching the conditions. As you can imagine, this can take a long time. Looking through every single row is not very efficient.

