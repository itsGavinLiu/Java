# Day 7
2. No-Relational Database
3. CAP Theorem
4. Sharing and Replication


## 2. No-Relational Database
A NoSQL originally referring to non SQL or non relational is a database that provides a mechanism for storage and retrieval of data. 
 
Types of NoSQL databases
Over time, four major types of NoSQL databases emerged: document databases, key-value databases, wide-column stores, and graph databases.

- Document databases store data in documents similar to JSON (JavaScript Object Notation) objects. Each document contains pairs of fields and values. The values can typically be a variety of types including things like strings, numbers, booleans, arrays, or objects.
- Key-value databases are a simpler type of database where each item contains keys and values.
- Wide-column stores store data in tables, rows, and dynamic columns.
- Graph databases store data in nodes and edges. Nodes typically store information about people, places, and things, while edges store information about the relationships between the nodes. 
  
### 2.1 Document Data Store
A document database (also known as a document-oriented database or a document store) is a database that stores information in documents.

Examples of document data store: MongoDB, couchDB, etc.

Document databases offer a variety of advantages, including:

- An intuitive data model that is fast and easy for developers to work with.
- A flexible schema that allows for the data model to evolve as application needs change.
- The ability to horizontally scale out.

Document databases have the following key features:

- Document model: Data is stored in documents. 
- Flexible schema: Document databases have a flexible schema, meaning that not all documents in a collection need to have the same fields.
- Distributed and resilient: Document databases are distributed, which allows for horizontal scaling (typically cheaper than vertical scaling) and data distribution. Document databases provide resiliency through replication.
- Querying through an API or query language: Document databases have an API or query language that allows developers to execute the CRUD operations on the database.

Comparison

A document for a user named Tom. All of the information about Tom is stored in a single document.
```json
{
     "_id": 1,
     "first_name": "Tom",
     "email": "tom@example.com",
     "cell": "765-555-5555",
     "likes": [
        "fashion",
        "spas",
        "shopping"
     ],
     "businesses": [
        {
           "name": "Entertainment 1080",
           "partner": "Jean",
           "status": "Bankrupt",
           "date_founded": {
              "$date": "2012-05-19T04:00:00Z"
           }
        },
        {
           "name": "Swag for Tweens",
           "date_founded": {
              "$date": "2012-11-01T04:00:00Z"
           }
        }
     ]
  }
```

Let's store that same information in a relational database. We'll begin by creating a table that stores the basic information about the user.
![1649286323(1)](https://user-images.githubusercontent.com/40971097/162087329-2d4e94f7-f4f7-4c3f-8faa-e4d3a0dd55aa.png)

A user can like many things (meaning there is a one-to-many relationship between a user and likes), so we will create a new table named "Likes" to store a user’s likes.
The Likes table will have a foreign key that references the ID column in the Users table.

![1649286375(1)](https://user-images.githubusercontent.com/40971097/162087439-ebfb2fa5-ce20-4226-a202-76a05bb53beb.png)

Similarly, a user can run many businesses, so we will create a new table named "Businesses" to store business information. 
The Businesses table will have a foreign key that references the ID column in the Users table.

![1649286420(1)](https://user-images.githubusercontent.com/40971097/162087515-41befbfe-73bb-4730-aed0-0dae6227a401.png)

By comparison, data about a user could be stored in a single document in a document database or three tables in a relational database. 
When a developer wants to retrieve or update information about a user in the document database, they can write one query with zero joins.


### 2.2 Columnart Data Store
Columnar databases store data by columns rather than by rows. 
The data storage format in these solutions makes them faster and more efficient for instant analytical queries.

With Columnar Databases, one can quickly access the most relevant elements from the Database, unlike in traditional row-wise storage. 
This increases the speed of a query even if a database contains millions of records.

Examples of columnar data stores: cassandra, Hbase

The benefits of using a Columnar Database are as follows:

- Multipurpose: Columnar databases are ideal for big data applications because they excel at rapidly loading new data.
- Compressible data: Data that can be highly compressed in a Columnar Database. Columnar operations such as MIN, MAX, SUM, COUNT, and AVG can be performed quickly thanks to the compression.
- Self-indexing: It uses less disc space than an RDBMS with the same data.
- Speed and efficiency: Columnar databases perform analytical queries more quickly than other database methodologies (using joins).

### 2.3 Key/Value Data Store
- A key-value database (sometimes called a key-value store) uses a simple key-value method to store data. 
- These databases contain a simple string (the key) that is always unique and an arbitrary large data field (the value). 
- It implements a hash table to store unique keys along with the pointers to the corresponding data values.
- A value can be stored as an integer, a string, JSON, or an array—with a key used to reference that value.
- Values cannot be queried or searched upon. Only the key can be queried.

Examples of key/values data stores: redis, riak

### 2.4 Graph Database
A graph database stores nodes and relationships instead of tables, or documents.  In a graph database, there are no JOINs or lookups. 
Relationships are stored natively alongside the data elements (the nodes) in a much more flexible format. 
Everything about the system is optimized for traversing through data quickly.

Examples: Neo4j, GraphDB

## 3. CAP Theorem

The CAP Theorem is comprised of three components (hence its name) as they relate to distributed data stores:

- Consistency. All reads receive the most recent write or an error.
- Availability. All reads contain data, but it might not be the most recent.
- Partition tolerance. The system continues to operate despite network failures.

Database with `CP`: MongoDB, Hbase, BigTable, Redis 
Database with `AP`: Dynamo, Cassandra, SimpleDB, CouchDB

Only two of the following properties can be guaranteed at once.

## 4. Sharding and Replication

### 4.1 Replication
With multiple copies of data on different database servers, replication provides a level of fault tolerance against the loss of a single database server.

A replica set is a group of mongod instances that maintain the same data set. A replica set contains several data bearing nodes and optionally one arbiter node. Of the data bearing nodes, one and only one member is deemed the primary node, while the other nodes are deemed secondary nodes.

When a primary does not communicate with the other members of the set for more than the configured electionTimeoutMillis period (10 seconds by default), an eligible secondary calls for an election to nominate itself as the new primary. The cluster attempts to complete the election of a new primary and resume normal operations.

- Redundancy: Replication provides redundancy and increases data availability. With multiple copies of data on different database servers, replication provides a level of fault tolerance against the loss of a single database server.

- Failover: The replica set cannot process write operations until the election completes successfully. The replica set can continue to serve read queries if such queries are configured to run on secondaries while the primary is offline.

### 4.2 Sharding
A method for distributing data across multiple machines. 

There are two methods for addressing system growth: vertical and horizontal scaling.

- Vertical Scaling involves increasing the capacity of a single server, such as using a more powerful CPU, adding more RAM, or increasing the amount of storage space.

- Horizontal Scaling involves dividing the system dataset and load over multiple servers, adding additional servers to increase capacity as required. MongoDB supports horizontal scaling through sharding.



  
