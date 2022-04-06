# Day 4
15. Generics
16. IO Stream
17. Serialization and Deserialization
18. Java 8 Features

## 15. Generics
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. 

Type Parameters:
- T – Type
- E – Element
- K – Key
- N – Number
- V – Value


Programs that use Generics has got many benefits over non-generic code:

1. Code Reuse: We can write a method/class/interface once and use it for any type we want.

2. Type Safety: Generics make errors to appear compile time than at run time

## 16. IO Stream
In Java, streams are the sequence of data that are read from the source and written to the destination. An input stream is used to read data from the source. And, an output stream is used to write data to the destination.

Types of Streams:
- Byte stream is used to read and write a single byte (8 bits) of data. All byte stream classes are derived from base abstract classes called `InputStream` and `OutputStream`.
- Character stream is used to read and write a single character of data. All the character stream classes are derived from base abstract classes `Reader` and `Writer`.

## 17. Serialization and Deserialization

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

To make a Java object serializable we implement the `java.io.Serializable` interface.
The `ObjectOutputStream` class contains `writeObject()` method for serializing an Object.
```java
public final void writeObject(Object obj)
                       throws IOException
```

The `ObjectInputStream` class contains `readObject()` method for deserializing an object.
```java
public final Object readObject()
                  throws IOException,
               ClassNotFoundException
```

## 18. Java 8 Features

### 18.1 lambda
Lambda expressions basically express instances of functional interfaces. lambda expressions implement the only abstract function and therefore implement functional interfaces.

- Enable to treat functionality as a method argument, or code as data.
- A function that can be created without belonging to any class.
- A lambda expression can be passed around as if it was an object and executed on demand.


### 18.2 Functional Interfaces
A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional interfaces. 

Some Built-in Java Functional Interfaces

- Runnable –> This interface only contains the run() method.
- Comparable –> This interface only contains the compareTo() method.
- ActionListener –> This interface only contains the actionPerformed() method.
- Callable –> This interface only contains the call() method.

Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations. These are:

- Consumer
- Predicate
- Function 
- Supplier

### 18.3 Optional
`java.util package`can help in writing a neat code without using too many null checks. By using Optional, we can specify alternate values to return or alternate code to run. 

Optional is a container object which may or may not contain a non-null value. You must import java.util package to use this class. If a value is present, isPresent() will return true and get() will return the value. Additional methods that depend on the presence or absence of a contained value are provided, such as orElse() which returns a default value if the value is not present, and ifPresent() which executes a block of code if the value is present. This is a value-based class, i.e their instances are : 

- Final and immutable (though may contain references to mutable objects).
- Considered equal solely based on equals(), not based on reference equality(==).
- Do not have accessible constructors.

### 18.4 Stream API
Java streams are designed in such a way that most of the stream operations (called intermediate operations) return a Stream. This helps to create a chain of stream operations. This is called stream pipe-lining.

Java streams also support the aggregate or terminal operations on the elements. The aggregate operations are operations that allow us to express common manipulations on stream elements quickly and clearly, for example, finding the max or min element, finding the first element matching giving criteria, and so on.
Not that a stream maintains the same ordering of the elements as the ordering in the stream source.
