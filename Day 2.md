# Day 2
7. Collections
8. Comparable vs Comparator 
9. JVM
10. Class Loader
11. Garbage Collector

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

![image](https://user-images.githubusercontent.com/40971097/161405348-e7e1531d-d100-4658-a77c-53c3742b5a2a.png)

#### 7.2.1 Methods of the Collection Interface
- `size()` - returns the current number of elements in the collection
- `isEmpty()` - returns true if there's no element in the collection, otherwise false
- `contains()` - returns true if the collection contains an element passed as a parameter
- `add()` - adds a new element to the collection; returns true if the collection changed (element was added), otherwise false
- `remove()` - removes element from the collection; returns true if collection changed (the element existed and has been removed), otherwise false
- `clear()` - clears the collection contents
