# Day 2
7. Collections
8. Comparable vs Comparator 
9. JVM
10. Garbage Collector

## 7. Collections
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. In Java, a separate framework named the “Collection Framework” has been defined in JDK 1.2 which holds all the collection classes and interface in it. 

The Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.

### 7.1 Need for a Separate Collection Framework
Before the Collection Framework(or before JDK 1.2) was introduced, the standard methods for grouping Java objects (or collections) were Arrays or Vectors, or Hashtables. All of these collections had no common interface. Therefore, though the main aim of all the collections is the same, the implementation of all these collections was defined independently and had no correlation among them. And also, it is very difficult for the users to remember all the different methods, syntax, and constructors present in every collection class. 

### 7.2 Hierarchy of the Collection Framework
The utility package, (java.util) contains all the classes and interfaces that are required by the collection framework. The collection framework contains an interface named an iterable interface which provides the iterator to iterate through all the collections. This interface is extended by the main collection interface which acts as a root for the collection framework. All the collections extend this collection interface thereby extending the properties of the iterator and the methods of this interface. 

Key Concepts:
- Class: A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
- Interface: Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). Interfaces specify what a class must do and not how. It is the blueprint of the class.

The following figure illustrates the hierarchy of the collection framework. 

![image](https://user-images.githubusercontent.com/40971097/161408657-c8b67319-930f-4594-87d2-ad6fbd4d365f.png)

![image](https://user-images.githubusercontent.com/40971097/161408663-5b9b1093-75bc-4b79-a65b-3a754c917f32.png)



### 7.3 Methods of the Collection Interface
- `size()` - returns the current number of elements in the collection
- `isEmpty()` - returns true if there's no element in the collection, otherwise false
- `contains()` - returns true if the collection contains an element passed as a parameter
- `add()` - adds a new element to the collection; returns true if the collection changed (element was added), otherwise false
- `remove()` - removes element from the collection; returns true if collection changed (the element existed and has been removed), otherwise false
- `clear()` - clears the collection contents

### 7.4 Interfaces that extend the Collections Interface

#### 7.4.1 Iterable Interface 
This is the root interface for the entire collection framework. The collection interface extends the iterable interface. Therefore, inherently, all the interfaces and classes implement this interface. The main functionality of this interface is to provide an iterator for the collections. Therefore, this interface contains only one abstract method which is the iterator.

#### 7.4.2 Collection Interface
This interface extends the iterable interface and is implemented by all the classes in the collection framework. This interface contains all the basic methods which every collection has like adding the data into the collection, removing the data, clearing the data, etc. All these methods are implemented in this interface because these methods are implemented by all the classes irrespective of their style of implementation. And also, having these methods in this interface ensures that the names of the methods are universal for all the collections. Therefore, in short, we can say that this interface builds a foundation on which the collection classes are implemented.

#### 7.4.3 List Interface
This is a child interface of the collection interface. This interface is dedicated to the data of the list type in which we can store all the ordered collection of the objects. This also allows duplicate data to be present in it. This list interface is implemented by various classes like ArrayList, Vector, Stack, etc. Since all the subclasses implement the list, we can instantiate a list object with any of these classes. For example, 
```java
List <T>al = new ArrayList<>(); 
List <T>ll = new LinkedList<>(); 
List <T>v = new Vector<>(); 
# T is the type of the object 
```

The classes which implement the List interface are as follows:

- `ArrayList` - ArrayList provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. Java ArrayList allows us to randomly access the list. ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases. 

- `LinkedList` - LinkedList class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. 

- `Vector` - A vector provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. This is identical to ArrayList in terms of implementation. However, the primary difference between a vector and an ArrayList is that a Vector is synchronized and an ArrayList is non-synchronized. 

- `Stack` - Stack class models and implements the Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek. The class can also be referred to as the subclass of Vector. 

#### 7.4.4  Queue Interface
As the name suggests, a queue interface maintains the FIFO(First In First Out) order similar to a real-world queue line. This interface is dedicated to storing all the elements where the order of the elements matter. There are various classes like PriorityQueue, ArrayDeque, etc. Since all these subclasses implement the queue, we can instantiate a queue object with any of these classes. For example, 
```java
Queue <T>pq = new PriorityQueue<>(); 
Queue <T>ad = new ArrayDeque<>(); 
# T is the type of the object.  
```

The most frequently used implementation of the queue interface is the PriorityQueue. 
 
- `PriorityQueue` - A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority and this class is used in these cases. The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used. Let’s understand the priority queue with an example:

#### 7.4.5  Deque Interface
This is a very slight variation of the queue data structure. Deque, also known as a double-ended queue, is a data structure where we can add and remove the elements from both ends of the queue. This interface extends the queue interface. The class which implements this interface is ArrayDeque. Since ArrayDeque class implements the Deque interface, we can instantiate a deque object with this class. For example, 
 
```java
Deque<T>ad = new ArrayDeque<>(); 
# T is the type of the object.  
```

The class which implements the deque interface is ArrayDeque. 

- `ArrayDeque` - ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. Array deques have no capacity restrictions and they grow as necessary to support usage.

#### 7.4.6  Set Interface

A set is an unordered collection of objects in which duplicate values cannot be stored. This collection is used when we wish to avoid the duplication of the objects and wish to store only the unique objects. This set interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet, etc. Since all the subclasses implement the set, we can instantiate a set object with any of these classes. For example,
```java
Set<T>hs = new HashSet<>(); 
Set<T>lhs = new LinkedHashSet<>(); 
Set<T>ts = new TreeSet<>(); 
# T is the type of the object.  
```

The following are the classes that implement the Set interface:

- `HashSet` - The HashSet class is an inherent implementation of the hash table data structure. The objects that we insert into the HashSet do not guarantee to be inserted in the same order. The objects are inserted based on their hashcode. This class also allows the insertion of NULL elements. 

- `LinkedHashSet` - A LinkedHashSet is very similar to a HashSet. The difference is that this uses a doubly linked list to store the data and retains the ordering of the elements. 


#### 7.4.7  SortedSet Interface
This interface is very similar to the set interface. The only difference is that this interface has extra methods that maintain the ordering of the elements. The sorted set interface extends the set interface and is used to handle the data which needs to be sorted. The class which implements this interface is TreeSet. Since this class implements the SortedSet, we can instantiate a SortedSet object with this class. For example,
```java
SortedSet<T>ts = new TreeSet<>(); 
# T is the type of the object.  
```
The class which implements the sorted set interface is TreeSet. 
 
- `TreeSet` - The TreeSet class uses a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided. This must be consistent with equals if it is to correctly implement the Set interface. It can also be ordered by a Comparator provided at set creation time, depending on which constructor is used.


#### 7.4.8  Map Interface
A map is a data structure that supports the key-value pair mapping for the data. This interface doesn’t support duplicate keys because the same key cannot have multiple mappings. A map is useful if there is data and we wish to perform operations on the basis of the key. This map interface is implemented by various classes like HashMap, TreeMap, etc. Since all the subclasses implement the map, we can instantiate a map object with any of these classes. For example,
 
```java
Map<T>hm = new HashMap<>(); 
Map<T>tm = new TreeMap<>();
# T is the type of the object. 
```
The frequently used implementation of a Map interface is a HashMap. 
 
- `HashMap` - HashMap provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value in a HashMap, we must know its key. HashMap uses a technique called Hashing. Hashing is a technique of converting a large String to a small String that represents the same String so that the indexing and search operations are faster. HashSet also uses HashMap internally.


## 8. Comparable vs Comparator

Java provides two interfaces to sort objects using data members of the class: Comparable and Comparator.

- Comparable is meant for objects with natural ordering which means the object itself must know how it is to be ordered. For example Roll Numbers of students. Whereas, Comparator interface sorting is done through a separate class.
- Logically, Comparable interface compares “this” reference with the object specified and Comparator in Java compares two different class objects provided.
- If any class implements Comparable interface in Java then collection of that object either List or Array can be sorted automatically by using Collections.sort() or Arrays.sort() method and objects will be sorted based on there natural order defined by CompareTo method.
- A basic differentiating feature is that using comparable we can use only one comparison. Whereas, we can write more than one custom comparators as you want for a given type, all using different interpretations of what sorting means. Like in the comparable example we could just sort by only one attribute, i.e., year but in the comparator, we were able to use different attributes like rating, name, and year as well.


## 9. JVM
JVM(Java Virtual Machine) acts as a run-time engine to run Java applications. JVM is the one that actually calls the main method present in a java code. JVM is a part of JRE(Java Runtime Environment).

Java applications are called WORA (Write Once Run Anywhere). This means a programmer can develop Java code on one system and can expect it to run on any other Java-enabled system without any adjustment. This is all possible because of JVM.

When we compile a .java file, .class files(contains byte-code) with the same class names present in .java file are generated by the Java compiler. This .class file goes into various steps when we run it. These steps together describe the whole JVM. 
![image](https://user-images.githubusercontent.com/40971097/161411679-ff1ecd15-4d67-4b04-bcab-4c91b26de523.png)

### 9.1 Class Loader Subsystem

It is mainly responsible for three activities. 

- Loading
- Linking
- Initialization

#### 9.1.1 Loading 
The Class loader reads the “.class” file, generate the corresponding binary data and save it in the method area.

After loading the “.class” file, JVM creates an object of type Class to represent this file in the heap memory. Please note that this object is of type Class predefined in java.lang package. These Class object can be used by the programmer for getting class level information like the name of the class, parent name, methods and variable information etc. To get this object reference we can use getClass() method of Object class.
***Note***: For every loaded “.class” file, only one object of the class is created. 

#### 9.1.2 Linking
Performs verification, preparation, and (optionally) resolution. 
 
- Verification: It ensures the correctness of the .class file i.e. it checks whether this file is properly formatted and generated by a valid compiler or not. If verification fails, we get run-time exception java.lang.VerifyError. This activity is done by the component ByteCodeVerifier. Once this activity is completed then the class file is ready for compilation.
- Preparation: JVM allocates memory for class variables and initializing the memory to default values.
- Resolution: It is the process of replacing symbolic references from the type with direct references. It is done by searching into the method area to locate the referenced entity.

#### 9.1.3 Initialization
In this phase, all static variables are assigned with their values defined in the code and static block(if any). This is executed from top to bottom in a class and from parent to child in the class hierarchy. 

### 9.2 JVM Memory

- Method area: In the method area, all class level information like class name, immediate parent class name, methods and variables information etc. are stored, including static variables. There is only one method area per JVM, and it is a shared resource.
- Heap area: Information of all objects is stored in the heap area. There is also one Heap Area per JVM. It is also a shared resource.
- Stack area: For every thread, JVM creates one run-time stack which is stored here. Every block of this stack is called activation record/stack frame which stores methods calls. All local variables of that method are stored in their corresponding frame. After a thread terminates, its run-time stack will be destroyed by JVM. It is not a shared resource.
- PC Registers: Store address of current execution instruction of a thread. Obviously, each thread has separate PC Registers.
- Native method stacks: For every thread, a separate native stack is created. It stores native method information. 

![image](https://user-images.githubusercontent.com/40971097/161411866-9fe70b0d-9e92-4d49-ba87-96de9f62efc4.png)

### 9.3 Execution Engine 

Execution engine executes the “.class” (bytecode). It reads the byte-code line by line, uses data and information present in various memory area and executes instructions. It can be classified into three parts:

- Interpreter: It interprets the bytecode line by line and then executes. The disadvantage here is that when one method is called multiple times, every time interpretation is required.
- Just-In-Time Compiler(JIT) : It is used to increase the efficiency of an interpreter. It compiles the entire bytecode and changes it to native code so whenever the interpreter sees repeated method calls, JIT provides direct native code for that part so re-interpretation is not required, thus efficiency is improved.
- Garbage Collector: It destroys un-referenced objects. 

### 9.4 Java Native Interface (JNI) : 

It is an interface that interacts with the Native Method Libraries and provides the native libraries(C, C++) required for the execution. It enables JVM to call C/C++ libraries and to be called by C/C++ libraries which may be specific to hardware.

### 9.5 Native Method Libraries : 

It is a collection of the Native Libraries(C, C++) which are required by the Execution Engine.


## 10. Garbage Collector 

Garbage collection (GC), as its name implies, is a means of freeing space occupied by waste materials, or garbage, and avoid memory leaks. Through performing the GC mechanism, available memory can be effectively used. Moreover, through this process, objects that are dead or unused for a long time in the memory heap will be deleted and the memory space used by these objects will be reclaimed.

### 10.1 Key Concepts
#### 10.1.1 Unreachable objects
An object is said to be unreachable if it doesn’t contain any reference to it. Also, note that objects which are part of the island of isolation are also unreachable. 

#### 10.1.2 Eligibility for garbage collection
Even though the programmer is not responsible for destroying useless objects but it is highly recommended to make an object unreachable(thus eligible for GC) if it is no longer required.
There are generally four ways to make an object eligible for garbage collection.
- Nullifying the reference variable
- Re-assigning the reference variable
- An object created inside the method
- Island of Isolation

#### 10.1.3 Finalization
Just before destroying an object, Garbage Collector calls `finalize()` method on the object to perform cleanup activities. Once finalize() method completes, Garbage Collector destroys that object.

`finalize()` method is present in Object class with the following prototype.
```java
protected void finalize() throws Throwable
```
Based on our requirement, we can override `finalize()` method for performing our cleanup activities like closing connection from the database. 

- The `finalize()` method is called by Garbage Collector, not JVM. However, Garbage Collector is one of the modules of JVM.
- Object class `finalize()` method has an empty implementation. Thus, it is recommended to override the `finalize()` method to dispose of system resources or perform other cleanups.
- The `finalize()` method is never invoked more than once for any object.
- If an uncaught exception is thrown by the `finalize()` method, the exception is ignored, and the finalization of that object terminates.

Example:  count the number of employees working in the company(excluding interns) using garbage collector.
```java
// Correct code to count number
// of employees excluding interns.

class Employee {

	private int ID;
	private String name;
	private int age;
	private static int nextId = 1;

	// it is made static because it
	// is keep common among all and
	// shared by all objects
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
		this.ID = nextId++;
	}
	public void show()
	{
		System.out.println("Id=" + ID + "\nName=" + name
						+ "\nAge=" + age);
	}
	public void showNextId()
	{
		System.out.println("Next employee id will be="
						+ nextId);
	}
	protected void finalize()
	{
		--nextId;
		// In this case,
		// gc will call finalize()
		// for 2 times for 2 objects.
	}
}

public class UseEmployee {
	public static void main(String[] args)
	{
		Employee E = new Employee("GFG1", 56);
		Employee F = new Employee("GFG2", 45);
		Employee G = new Employee("GFG3", 25);
		E.show();
		F.show();
		G.show();
		E.showNextId();
		F.showNextId();
		G.showNextId();

		{
			// It is sub block to keep
			// all those interns.
			Employee X = new Employee("GFG4", 23);
			Employee Y = new Employee("GFG5", 21);
			X.show();
			Y.show();
			X.showNextId();
			Y.showNextId();
			X = Y = null;
			System.gc();
			System.runFinalization();
		}
		E.showNextId();
	}
}

```

### 10.2 Mark-and-Sweep: Garbage Collection Algorithm

There are many garbage collection algorithms that run in the background, of which one of them is mark and sweep. Any garbage collection algorithm must perform 2 basic operations. One, it should be able to detect all the unreachable objects and secondly, it must reclaim the heap space used by the garbage objects and make the space available again to the program. The above operations are performed by Mark and Sweep Algorithm in two phases as listed and described further as follows: 

- Mark phase
- Sweep phase

#### 10.2.1 Mark Phase
When an object is created, its mark bit is set to 0(false). In the Mark phase, we set the marked bit for all the reachable objects (or the objects which a user can refer to) to 1(true). Now to perform this operation we simply need to do a graph traversal, a depth-first search approach would work for us. Here we can consider every object as a node and then all the nodes (objects) that are reachable from this node (object) are visited and it goes on till we have visited all the reachable nodes.

Algorithm
```java
Mark(root):
    if !markedBit(root):
        markedBit(root) = true
        for node in root:
            Mark(node)
```

#### 10.2.2 Sweep Phase
As the name suggests it “sweeps” the unreachable objects i.e. it clears the heap memory for all the unreachable objects. All those objects whose marked value is set to false are cleared from the heap memory, for all other objects (reachable objects) the marked bit is set to true. 
Now the mark value for all the reachable objects is set to false since we will run the algorithm (if required) and again we will go through the mark phase to mark all the reachable objects. 

Algorithm
```java
Sweep():
    for obj in heap:
        if markedBit(obj):
            markedBit(obj) = false
        else:
            heap.release(obj)
```
The mark-and-sweep algorithm is called a tracing garbage collector because it traces out the entire collection of objects that are directly or indirectly accessible by the program. 


Advantages of Mark and Sweep Algorithm are as follows: 

- It handles the case with cyclic references, even in the case of a cycle, this algorithm never ends up in an infinite loop.
- There are no additional overheads incurred during the execution of the algorithm.

Disadvantages of the Mark and Sweep Algorithm are as follows:

- The main disadvantage of the mark-and-sweep approach is the fact that that normal program execution is suspended while the garbage collection algorithm runs.
- Another disadvantage is that, after the Mark and Sweep Algorithm is run several times on a program, reachable objects end up being separated by many, small unused memory regions. Look at the below figure for a better understanding. 


## 10.3 Garbage Implementation


