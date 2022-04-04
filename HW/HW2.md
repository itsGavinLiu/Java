### 1.	Why we need packages in java?

A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. 

### 2.	What is the default imported package?

Java compiler imports java. lang package internally by default. It provides the fundamental classes that are necessary to design a basic Java program.

### 3.	What is Class? What is Object?

A class describes the contents of the objects that belong to it: it describes an aggregate of data fields (called instance variables) and defines the operations (called methods). 
An object is an element (or instance) of a class; objects have the behaviors of their class.

### 4.	Why we need constructor?

A constructor is a special method of a class that initializes new objects or instances of the class. Without a constructor, you can't create instances of the class. Imagine that you could create a class that represents files, but without constructors, you couldn't create any files based on the class.

### 5.	What is the default value of local variable? What is the default value of instance variable?

The default value of the local variable is NULL in JAVA, no primitive values or object references. 
For boolean type, the default value is false, for float and double types default values are 0.0 and for remaining primitive types default value is 0.

### 6.	What is garbage collection?

Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

### 7.	The protected data can be accessed by subclasses or same package. True or false?

True. Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses in other package or any class within the package of the protected members' class.

### 8.	What is immutable class?

Immutable class means once the object of the class is created its fields cannot be modified or changed. In Java, all the wrapper classes like Boolean, Short, Integer, Long, Float, Double, Byte, Char, and String classes are immutable classes.

### 9.	What’s the difference between “==” and equals method?

•	The main difference is that .equals() is a method, and == is the operator.
•	We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.

### 10.	What is wrapper class?

A Wrapper class is a class which contains the primitive data types (int, char, short, byte, etc). In other words, wrapper classes provide a way to use primitive data types (int, char, short, byte, etc) as objects. These wrapper classes come under java. util package.

### 11.	What is autoboxing?

Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.

### 12.	StringBuilder is threadsafe but slower than StringBuffer, true or false?

False. StringBuffer is threadsafe whereas StringBuilder is not.

### 13.	Constructor can be inherited, true or false?

False. Constructors cannot be inherited in Java. In inheritance sub class inherits the members of a super class except constructors. In other words, constructors cannot be inherited in Java therefore, there is no need to write final before constructors.

### 14.	How to call a super class’s constructor?

Use of super() to access superclass constructor


### 15.	Which class is the super class of all classes?

Object class is the root or superclass of the class hierarchy, which is present in java. lang package. All predefined classes and user-defined classes are the subclasses from Object class.

### 16.	Create a program to count how many files/folders are there inside one folder.
•	the count method should take a parameter called Criteria like this: count(Criteria criteria){}
•	For Criteria class, multiple conditions should be included such as: folder path, includeSubFolder or not, the extension of the file be counted and so on. 
•	Optional: Take the input from keyboard.
•	Take care of the invalid inputs. Exception handling.
•	Get proper result displayed.
”There are XXX file(s) and XXX folder(s) inside folder XXX with extension XXX.” or something user friendly.

