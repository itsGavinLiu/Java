### 1.	Explain polymorphism.

Polymorphism is the ability of a programming language to present the same interface for several different underlying data types. Polymorphism is the ability of different objects to respond in a unique way to the same message.

### 2.	What is overloading?

Overloading occurs when two or more methods in one class have the same method name but different parameters.

### 3.	What is overriding?

Overriding occurs when two methods have the same method name and parameters. One of the methods is in the parent class, and the other is in the child class. Overriding allows a child class to provide the specific implementation of a method that is already present in its parent class.

### 4.	What does the final mean in this method:  public void doSomething(final Car aCar){}

It means that we can only assign this value once and cannot be modified.

### 5.	Suppose in question 4, the Car class has a method setColor(Color color){…}, inside doSomething method, Can we call aCar.setColor(red);?

Yes we can as long as the setColor() method is not static. 

### 6.	Can we declare a static variable inside a method?

You cannot declare variable as static inside a method. Inside method all variables are local variables that has no existence outside this method that’s why they cannot be static.

### 7.	What is the difference between interface and abstract class?

Abstract classes can have constants, members, method stubs (methods without a body) and defined methods, whereas interfaces can only have constants and methods stubs.

### 8.	Can an abstract class be defined without any abstract methods?

Yes, we can declare an abstract class with no abstract methods in Java. An abstract class means that hiding the implementation and showing the function definition to the user.


### 9.	Since there is no way to create an object of abstract class, what’s the point of constructors of abstract class?

The main purpose of the constructor is to initialize the newly created object. In abstract class, we have an instance variable, abstract methods, and non-abstract methods. We need to initialize the non-abstract methods and instance variables, therefore abstract classes have a constructor.

### 10.	What is a native method?

Native methods are Java methods that start in a language other than Java. Native methods can access system-specific functions and APIs that are not available directly in Java. The use of native methods limits the portability of an application, because it involves system-specific code.

### 11.	What is marker interface?

A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object. A marker interface is also called a tagging interface.

### 12.	Why to override equals and hashCode methods?

Why to override equals: the default implementation is not enough to satisfy business needs, especially if we’re talking about a huge application that considers two objects as equal when some business fact happens. It needs to be overridden if we want to check the objects based on the property. 
Why to override hashcode method: if two objects are equal according to the equals(Object) method, then calling the hashcode() method on each of the two objects must produce the same integer result.

### 13.	What’s the difference between int and Integer?

A int is a data type that stores 32 bit signed two's compliment integer. On other hand Integer is a wrapper class which wraps a primitive type int into an object. int helps in storing integer value into memory. Integer helps in converting int into object and to convert an object into int as per requirement.

### 14.	What is serialization?

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Its main purpose is to save the state of an object in order to be able to recreate it when needed. The reverse process is called deserialization.

### 15.	Create List and Map. 
List A contains 1,2,3,4,10(integer). Map B contains ("a","1") ("b","2") ("c","10")   (key = string, value = string) 
Question: get a list which contains all the elements in list A, but not in map B.

https://github.com/itsGavinLiu/JavaBatch/blob/main/HW/GetAList.java


### 16. 16.	Implement a group of classes that have common behavior/state as Shape
Create Circle, Rectangle and Square for now as later on we may need more shapes. They should have the ability to calculate the area. They should be able to compare using area. Please write a program to demonstrate the classes and comparison.  You can use either abstract or interface. Comparator or Comparable interface.

https://github.com/itsGavinLiu/JavaBatch/blob/main/HW/ShapeArea.java

