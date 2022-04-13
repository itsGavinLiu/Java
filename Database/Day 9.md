# Day 9
12. Lock
13. Distribution Transaction


## 12. Lock
Locking is a mechanism used by the SQL Server Database Engine to synchronize access by multiple users to the same piece of data at the same time.

Before a transaction acquires a dependency on the current state of a piece of data, such as by reading or modifying the data, it must protect itself from the effects of another transaction modifying the same data. The transaction does this by requesting a lock on the piece of data. Locks have different modes, such as shared or exclusive. The lock mode defines the level of dependency the transaction has on the data. No transaction can be granted a lock that would conflict with the mode of a lock already granted on that data to another transaction. If a transaction requests a lock mode that conflicts with a lock that has already been granted on the same data, the instance of the SQL Server Database Engine will pause the requesting transaction until the first lock is released.

### 12.1 Binary Lock
A binary lock is a variable capable of holding only 2 possible values, i.e., a 1 (depicting a locked state) or a 0 (depicting an unlocked state). This lock is usually associated with every data item in the database ( maybe at table level, row level or even the entire database level). 

### 12.2 Shared locks
Shared (S) locks allow concurrent transactions to read (SELECT) a resource under pessimistic concurrency control. No other transactions can modify the data while shared (S) locks exist on the resource. Shared (S) locks on a resource are released as soon as the read operation completes, unless the transaction isolation level is set to repeatable read or higher, or a locking hint is used to retain the shared (S) locks for the duration of the transaction.

### 12.3 Exclusive locks
Exclusive (X) locks prevent access to a resource by concurrent transactions. With an exclusive (X) lock, no other transactions can modify data; read operations can take place only with the use of the NOLOCK hint or read uncommitted isolation level.

### 12.4 Types of concurrency
When many people attempt to modify data in a database at the same time, a system of controls must be implemented so that modifications made by one person do not adversely affect those of another person. This is called concurrency control.

Concurrency control theory has two classifications for the methods of instituting concurrency control:

- Pessimistic concurrency control

A system of locks prevents users from modifying data in a way that affects other users. After a user performs an action that causes a lock to be applied, other users cannot perform actions that would conflict with the lock until the owner releases it. This is called pessimistic control because it is mainly used in environments where there is high contention for data, where the cost of protecting data with locks is less than the cost of rolling back transactions if concurrency conflicts occur.

- Optimistic concurrency control

In optimistic concurrency control, users do not lock data when they read it. When a user updates data, the system checks to see if another user changed the data after it was read. If another user updated the data, an error is raised. Typically, the user receiving the error rolls back the transaction and starts over. This is called optimistic because it is mainly used in environments where there is low contention for data, and where the cost of occasionally rolling back a transaction is lower than the cost of locking data when read.

## 13. Distribution Transaction
At the application, a distributed transaction is managed much the same as a local transaction. At the end of the transaction, the application requests the transaction to be either committed or rolled back. A distributed commit must be managed differently by the transaction manager to minimize the risk that a network failure may result in some resource managers successfully committing while others roll back the transaction. This is achieved by managing the commit process in two phases (the prepare phase and the commit phase), which is known as a two-phase commit (2PC).

### 13.1 2PC

- Prepare phase

When the transaction manager receives a commit request, it sends a prepare command to all of the resource managers involved in the transaction. Each resource manager then does everything required to make the transaction durable, and all buffers holding log images for the transaction are flushed to disk. As each resource manager completes the prepare phase, it returns success or failure of the prepare to the transaction manager. SQL Server 2014 (12.x) introduced delayed transaction durability. Delayed durable transactions commit before log images for the transaction are flushed to disk. 

- Commit phase

If the transaction manager receives successful prepares from all of the resource managers, it sends commit commands to each resource manager. The resource managers can then complete the commit. If all of the resource managers report a successful commit, the transaction manager then sends a success notification to the application. If any resource manager reported a failure to prepare, the transaction manager sends a rollback command to each resource manager and indicates the failure of the commit to the application.

SQL Server Database Engine applications can manage distributed transactions either through Transact-SQL or the database API. 

### 13.2 Saga
The Saga pattern, on the other hand, works with units of work that can be undone. There is no commitment protocol included.

The original paper discusses updates to single node database where such work is processed but the notion can be further applied to distributed transactions too.
A Saga consists of a sequence of operations, each could work with a resource. Changes made by the operation on the particular resource are visible to the outer world immediately. We can see it as a just group of operations (a.k.a local transactions) which are executed one by one group by the Saga.

A Saga guarantees that either all operations succeed or all the work is undone by compensating actions. The compensating actions are not generically provided by a coordinator framework, instead, they have undone actions defined in business logic by the application programmer.

