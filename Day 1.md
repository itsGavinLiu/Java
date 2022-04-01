# Day 1

0. Preparation
1. Maven
2. Git
3. Eight Basic Data Types
4. String & StringBuilder & StringBuffer
5. String/Integer Constant pool
6. equals() and hashCode()


## Introduction of Maven

### What is Maven?
Maven is a popular open-source build tool developed by the Apache Group to build, publish, and deploy several projects at once for better project management. The tool provides allows developers to build and document the lifecycle framework. 
Maven is written in Java and is used to build projects written in C#, Scala, Ruby, etc. Based on the Project Object Model (POM), this tool has made the lives of Java developers easier while developing reports, checks build and testing automation setups. 
### Objective
Maven’s purpose is to provide developers with:
- A comprehensive, maintainable, reusable, and simple model for projects.
- A set of tools and plug-ins that can interact with the declarative model.
### Project Object Model (POM)
Maven is so useful thanks to the Project Object Model (POM), which is an XML file that has all the information regarding project and configuration details. The POM has the description of the project, details regarding the versioning, and configuration management of the project. The XML file is located in the project home directory. When you execute a task, Maven searches for the POM in the current directory.
### The Need for Maven
Maven is chiefly used for Java-based projects, helping to download dependencies, which refers to the libraries or JAR files. The tool helps get the right 
JAR files for each project as there may be different versions of separate packages. After Maven, downloading dependencies doesn’t require visiting the official websites of different software. You can visit mvnrepository to find libraries in different languages. The tool also helps to create the right project structure in struts, servlets, etc., which is essential for execution.
### What is a Maven Repository?
Maven repositories refer to the directories of packaged JAR files that contain metadata. The metadata refers to the POM files relevant to each project. This metadata is what allows Maven to download dependencies.

There are three types of repositories:
- **Local Repository**: Local repository refers to the machine of the developer where all the project material is saved. The local repository contains all the dependency jars.
- **Central Repository**: Central repository refers to the Maven community that comes into action when there is a need for dependencies, and those dependencies cannot be found in the local repository. Maven downloads the dependencies from here in the local repository whenever needed.
- **Remote Repository**: The remote repository refers to the repository present on a server that is used when Maven needs to download dependencies. Whenever anything is required from the remote repository, it is first downloaded to the local repository, and then it is used.
### Maven Build Lifecycle
There are three built-in build lifecycles: default, clean and site. The default lifecycle handles your project deployment, the clean lifecycle handles project cleaning, while the site lifecycle handles the creation of your project's web site.
For example, the default lifecycle comprises of the following phases:

- *Validate*: validate the project is correct and all necessary information is available
- *Compile*: compile the source code of the project
- *Test*: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
- *Package*: take the compiled code and package it in its distributable format, such as a JAR.
- *Verify*: run any checks on results of integration tests to ensure quality criteria are met
- *Install*: install the package into the local repository, for use as a dependency in other projects locally
- *Deploy*: done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

## Eight Basic Datatypes
### 8 primitive data types
1.  **boolean**: boolean data type represents only one bit of information either true or false, but the size of the boolean data type is virtual machine-dependent. The default value is false.
2.  **byte**: The byte data type is an 8-bit signed two’s complement integer. The value ranges from -128 to 127. The default value is 0.
3.  **short**: The short data type is a 16-bit signed two’s complement integer. The value ranges from -32,768 to 32,7677. The default value is 0.
4.  **int**: It is a 32-bit signed two’s complement integer. The value ranges from -2,147,483,648 to 2,147,483,647. The default value is 0. ***Note***: In Java SE 8 and later, we can use the int data type to represent an unsigned 32-bit integer, which has a value in the range [0, 2^32-1]. Use the Integer class to use the int data type as an unsigned integer. 
5.  **long**: The long data type is a 64-bit two’s complement integer. The value ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. ***Note***: Note: In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. The Long class also contains methods like comparing Unsigned, divide Unsigned, etc to support arithmetic operations for unsigned long. 
6.  **float**: The float data type is a single-precision 32-bit IEEE 754 floating-point. Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers.
7.  **double**: The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the default choice.
8.  **char**: The char data type is a single 16-bit Unicode character. 

### Wrapper Classes
A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).

### Autoboxing & Unboxing
- Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
- Unboxing: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. 

Example of Autoboxing
```Java
class BoxingExample {  
    public static void main(String[] args) {  
        int a=50;  
        
        Integer a2=new Integer(a);//Boxing  
  
        Integer a3=5;//Boxing  
          
        System.out.println(a2+" "+a3);  
    }   
}  
```

Example of Unboxing
```Java
class UnboxingExample {  
    public static void main(String[] args) {  
        Integer i=new Integer(50);  
    
        int a=i;  
	          
        System.out.println(a);  
    }   
}  
```


## String & StringBuilder & StringBuffer
In java, objects of String are immutable which means a constant and cannot be changed once created. 

**Note**
- If a string is going to remain constant throughout the program, then use the String class object because a String object is immutable.
- If a string can change (for example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
- If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous, so you have thread-safety.
If you don’t want thread-safety than you can also go with StringBuilder class as it is not synchronized.

Example of String & StringBuilder & StringBuffer
```java
class Main {
	 
    public static void concat1(String s1)
    {
        s1 = s1 + " happy!";
    }
 
    public static void concat2(StringBuilder s2)
    {
        s2.append(" hungry!");
    }
 
    public static void concat3(StringBuffer s3)
    {
        s3.append(" learning Java!");
    }
 
    public static void main(String[] args)
    {

        String s1 = "I am";
        concat1(s1);
        System.out.println("String: " + s1);
 
        StringBuilder s2 = new StringBuilder("I am"); 
        concat2(s2);
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("I am");
        concat3(s3);
        System.out.println("StringBuffer: " + s3);
    }
}
```

## String Constant Pool 
String is a sequence of characters. One of the most important characteristics of a string in Java is that they are immutable. This immutability is achieved through the use of a special string constant pool in the heap.

A string constant pool is a separate place in the heap memory where the values of all the strings which are defined in the program are stored. When we declare a string, an object of type String is created in the stack, while an instance with the value of the string is created in the heap. On standard assignment of a value to a string variable, the variable is allocated stack, while the value is stored in the heap in the string constant pool. 

let’s take an example with multiple string variables having the same value. 
```
String str1 = "Hello";
String str2 = "Hello";
```
In this case, both the string objects get created in the stack, but only one instance of the value “Hello” is created in the heap. The string constant pool is a small cache that resides within the heap. Java stores all the values inside the string constant pool on direct allocation. This way, if a similar value needs to be accessed again, a new string object created in the stack can reference it directly with the help of a pointer. In other words, the string constant pool exists mainly to reduce memory usage and improve the re-use of existing instances in memory.

One way to skip this memory allocation is to use the **new** keyword while creating a new string object. The ‘new’ keyword forces a new instance to always be created regardless of whether the same value was used previously or not. Using ‘new’ forces the instance to be created in the heap ***outside*** the string constant pool.

Example of String Constant pool
```java
class Main {
    public static void main(String[] args)
    {
    	 String s1 = "HELLO";
         String s2 = "HELLO";
         String s3 =  new String("HELLO");
  
         System.out.println(s1 == s2); // true
         System.out.println(s1 == s3); // false
         System.out.println(s1.equals(s2)); // true
         System.out.println(s1.equals(s3)); // true
    }
}

```

**Note**

== checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.


##  == and .equals()
- The main difference between the .equals() method and == operator is that one is a method, and the other is the operator.
- We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
- If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent class that has overridden this method. 

### equals() and hashCode() methods


