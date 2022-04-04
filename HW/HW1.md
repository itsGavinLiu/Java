### 1.	What is JDK? JRE? JVM?

JDK (Java Development Kit) is a cross-platformed software development environment that offers a collection of tools and libraries necessary for developing Java-based software applications and applets. It is a core package used in Java, along with the JVM (Java Virtual Machine), an interpreter/loader (Java), a compiler (javac), an archiver (jar) and many more.

JRE (Java Runtime Environment) , is a software layer that runs on top of a computer’s operating system software and provides the class libraries and other resources that a specific Java program needs to run.

JVM (Java virtual machine) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode. The JVM is detailed by a specification that formally describes what is required in a JVM implementation. Having a specification ensures interoperability of Java programs across different implementations so that program authors using the Java Development Kit (JDK) need not worry about idiosyncrasies of the underlying hardware platform.

### 2.	What is java compiler?
A Java compiler is a program that takes the text file work of a developer and compiles it into a platform-independent Java file. Java compilers include the Java Programming Language Compiler (javac), the GNU Compiler for Java (GCJ), the Eclipse Compiler for Java (ECJ) and Jikes.

### 3.	Why is java platform independent?
Java is platform-independent because it uses a virtual machine. The Java programming language and all APIs are compiled into bytecodes. Bytecodes are effectively platform independent. The virtual machine takes care of the differences between the bytecodes for the different platforms. The run-time requirements for Java are therefore very small. The Java virtual machine takes care of all hardware-related issues, so that no code has to be compiled for different hardware.

### 4.	What is IDE? Why is it important for developers?
An integrated development environment (IDE) is software for building applications that combines common developer tools into a single graphical user interface (GUI).

An IDE allows developers to start programming new applications quickly because multiple utilities don’t need to be manually configured and integrated as part of the setup process. Developers also don’t need to spend hours individually learning how to use different tools when every utility is represented in the same workbench.

### 5.	Is java case sensitive?
Java is a case-sensitive language

### 6.	What do the following key words do?
`static`, `final`, `public`, `private`, `void`, `null`, `package`, `Class`, `new`

`static`: share the same variable or method of a given class. When a member is static, it can be accessed before any objects of its class are created, and without reference to any object.

`final`: When a variable is final, its value can’t be modified; When a class is final, it cannot be extended (inherited); When a method is final, this method cannot be overridden.

`public`: an access modifier used for classes, attributes, methods and constructors, making them accessible by any other class

`private`: an access modifier used for attributes, methods and constructors, making them only accessible within the declared class

`void`: specifies that a method should not have a return value

`null`: a variable doesn't refer to any object / type

`package`: a container that group related classes & interfaces

`class`: a template used to create objects & to define object data types / methods

`new`: used to create an instance of the class


### 7.	What is primitive type and reference type?

- primitive type: these types serve as the building blocks of data manipulation in Java. Such types serve only one purpose — containing pure, simple values of a kind. There are byte, short, int, long, float, double, char, boolean. 

- reference type: it contains the address (or reference) of dynamically created objects. It refers to objects. It is not pre-defined. It is created by the programmer if required. The reference types hold the references of objects. All reference types are a subclass of type java.lang.Object. It provides access to the objects stored in the memory.



### 8.	Is parameter passed by value or reference?

Java only supports pass by value. Always copies arguments, even though when copying a reference to an object, the parameter in the called function will point to the same object and changes to that object will be see in the caller.

### 9.	What is the output: System.out.println(1 > 0 : “A”:”B”);

A

### 10.	How to define constants in java?

static final datatype identifier_name = constant;

The static modifier causes the variable to be available without an instance of it’s defining class being loaded. The final modifier makes the variable unchangeable

### 11.	What is String? Is it primitive type?

String is not a primitive data type. Java.lang package provides the String class therefore, it is an object type.

### 12.	How to check if a String is representing a number?

Built-in methods:
•	Integer.parseInt(String)
•	Float.parseFloat(String)
•	Double.parseDouble(String)
•	Long.parseLong(String)
•	new BigInteger(String)


### 13.	Write a program to implement the following activity diagram:

