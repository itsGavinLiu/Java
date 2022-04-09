## Transaction
A transaction is a logical, atomic unit of work that contains one or more SQL statements.

A transaction groups SQL statements so that they are either all committed, which means they are applied to the database, or all rolled back, 
which means they are undone from the database.

All types of database access operation which are held between the beginning and end transaction statements are considered as a single logical transaction in DBMS. 
During the transaction the database is inconsistent. Only once the database is committed the state is changed from one consistent state to another.


## Deadlock Prevention And Avoidance
### Deadlock Prevention

- #### Eliminate Mutual Exclusion 
It is not possible to dis-satisfy the mutual exclusion because some resources, such as the tape drive and printer, are inherently non-shareable. 

- #### Eliminate Hold and wait 

  - Allocate all required resources to the process before the start of its execution, this way hold and wait condition is eliminated but it will lead to low device utilization. for example, if a process requires printer at a later time and we have allocated printer before the start of its execution printer will remain blocked till it has completed its execution. 
 
  - The process will make a new request for resources after releasing the current set of resources. This solution may lead to starvation.

- #### Eliminate No Preemption 
  - Preempt resources from the process when resources required by other high priority processes. 

- #### Eliminate Circular Wait 
  - Each resource will be assigned with a numerical number. A process can request the resources increasing/decreasing. order of numbering. 

### Deadlock Avoidance 
Deadlock avoidance can be done with **Banker’s Algorithm**. 

Bankers’s Algorithm is resource allocation and deadlock avoidance algorithm which test all the request made by processes for resources, it checks for the safe state, if after granting request system remains in the safe state it allows the request and if there is no safe state it doesn’t allow the request made by the process. 

Inputs to Banker’s Algorithm: 
 
- Max need of resources by each process. 
- Currently, allocated resources by each process. 
- Max free available resources in the system.

The request will only be granted under the below condition: 

- If the request made by the process is less than equal to max need to that process. 
- If the request made by the process is less than equal to the freely available resource in the system.

## Livelock
Livelock occurs when two or more processes continually repeat the same interaction in response to changes in the other processes without doing any useful work. These processes are not in the waiting state, and they are running concurrently. 
This is different from a deadlock because in a deadlock all processes are in the waiting state. 

### What leads to Livelocks? 

The occurrence of livelocks can occur in the most surprising ways. The total number of allowed processes in some systems is determined by the number of entries in the process table. 
Thus process table slots can be referred to as Finite Resources. If a fork fails because of the table being full, waiting a random time and trying again would be a reasonable approach for the program doing the fork. 
Consider a UNIX system having 100 process slots. Ten programs are running, each of which has to create 12 (sub)processes. After each process has created 9 processes, the 10 original processes and the 90 new processes have exhausted the table. 
Each of the 10 original processes now sits in an endless loop forking and failing – which is aptly the situation of a deadlock. The probability of this happening is very little but it could happen. 

### Difference between deadlock and livelock
In concurrent computing, a deadlock is a state in which each member of a group of actions, is waiting for some other member to release a lock

A livelock is similar to a deadlock, except that the states of the processes involved in the livelock constantly change with regard to one another, none progressing. Livelock is a special case of resource starvation; the general definition only states that a specific process is not progressing.

A real-world example of livelock occurs when two people meet in a narrow corridor, and each tries to be polite by moving aside to let the other pass, but they end up swaying from side to side without making any progress because they both repeatedly move the same way at the same time.

Livelock is a risk with some algorithms that detect and recover from deadlock. If more than one process takes action, the deadlock detection algorithm can be repeatedly triggered. 
This can be avoided by ensuring that only one process (chosen randomly or by priority) takes action.
