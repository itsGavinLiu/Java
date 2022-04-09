## SAGA 
A saga pattern is a sequence of local transactions where each transaction updates data within a single service. The first transaction in a saga is initiated by an external request corresponding to the system operation, 
and then each subsequent step is triggered by the completion of the previous one.

There are a couple of different ways to implement a saga transaction, but the two most popular are:

- Events/Choreography: When there is no central coordination, each service produces and listen to other service’s events and decides if an action should be taken or not.
- Command/Orchestration: when a coordinator service is responsible for centralizing the saga’s decision making and sequencing business logic

### Choreography
Choreography is a way to coordinate sagas where participants exchange events without a centralized point of control. 
With choreography, each local transaction publishes domain events that trigger local transactions in other services.
![image](https://user-images.githubusercontent.com/40971097/162554770-28d576ab-f1bd-411f-8ee6-8c58ab545954.png)

#### Benefits
- Good for simple workflows that require few participants and don't need a coordination logic.
- Doesn't require additional service implementation and maintenance.
- Doesn't introduce a single point of failure, since the responsibilities are distributed across the saga participants.
#### Drawbacks
- Workflow can become confusing when adding new steps, as it's difficult to track which saga participants listen to which commands.
- There's a risk of cyclic dependency between saga participants because they have to consume each other's commands.
- Integration testing is difficult because all services must be running to simulate a transaction.

### Orchestration
Orchestration is a way to coordinate sagas where a centralized controller tells the saga participants what local transactions to execute. 
The saga orchestrator handles all the transactions and tells the participants which operation to perform based on events. 
The orchestrator executes saga requests, stores and interprets the states of each task, and handles failure recovery with compensating transactions.

![image](https://user-images.githubusercontent.com/40971097/162554802-94ec660e-86eb-4e83-a392-f2ddd79edba9.png)

#### Benefits
- Good for complex workflows involving many participants or new participants added over time.
- Suitable when there is control over every participant in the process, and control over the flow of activities.
- Doesn't introduce cyclical dependencies, because the orchestrator unilaterally depends on the saga participants.
- Saga participants don't need to know about commands for other participants. Clear separation of concerns simplifies business logic.

#### Drawbacks
- Additional design complexity requires an implementation of a coordination logic.
- There's an additional point of failure, because the orchestrator manages the complete workflow.


## Two-phase commit (2PC)
Two-phase commit is a well known pattern in database systems. This pattern can also be used for microservices to implement distributed transactions. In a two-phase commit, there is a controlling node that houses most of the logic and participating nodes (microservices) on which the actions are performed. It works in two phases:

- Prepare phase (Phase 1): The controlling node asks all of the participating nodes if they are ready to commit. The participating nodes respond with yes or no.
- Commit phase (Phase 2): If all of the nodes replied in the affirmative, then the controlling node asks them to commit. Even if one node replies in the negative, the controlling node asks them to roll back.

### Limitations
Although 2PC is useful a means to implement a distributed transaction, it has the following shortcomings:

- The onus of the transaction is on the coordinator node, and it can become the single point of failure
- All other services need to wait until the slowest service finishes its confirmation. Thus, the overall performance of the transaction is bound by the slowest service
- The two-phase commit protocol is slow by design due to the chattiness and dependency on the coordinator. Thus, it can lead to scalability and performance issues in a microservice-based architecture involving multiple services
- Two-phase commit protocol is not supported in NoSQL databases. Thus, in a microservice architecture where one or more services use NoSQL databases, a two-phase commit cannot be applied
