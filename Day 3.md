# Day 3

12. Keyword
13. OOP
14. Exception


## 12. Keyword
### 12.1 Data type keyword
1.  **boolean**: boolean data type represents only one bit of information either true or false, but the size of the boolean data type is virtual machine-dependent. The default value is false.
2.  **byte**: The byte data type is an 8-bit signed two’s complement integer. The value ranges from -128 to 127. The default value is 0.
3.  **short**: The short data type is a 16-bit signed two’s complement integer. The value ranges from -32,768 to 32,7677. The default value is 0.
4.  **int**: It is a 32-bit signed two’s complement integer. The value ranges from -2,147,483,648 to 2,147,483,647. The default value is 0. ***Note***: In Java SE 8 and later, we can use the int data type to represent an unsigned 32-bit integer, which has a value in the range [0, 2^32-1]. Use the Integer class to use the int data type as an unsigned integer. 
5.  **long**: The long data type is a 64-bit two’s complement integer. The value ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. ***Note***: Note: In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. The Long class also contains methods like comparing Unsigned, divide Unsigned, etc to support arithmetic operations for unsigned long. 
6.  **float**: The float data type is a single-precision 32-bit IEEE 754 floating-point. Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers.
7.  **double**: The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the default choice.
8.  **char**: The char data type is a single 16-bit Unicode character. 

### 12.2 Flow control keyword
Control flow or flow of control is the order in which instructions, statements and function calls being executed or evaluated when a program is running. We can classify the types of control flow statements as follows:

- Decision Making Statements
- Loop Statements
- Jump Statements

#### 12.2.1 Decision Making ####
We generally use decision-making keywords when we have to decide which block of the code will be executed.
There are three types of decision-making statements:

- if statement
- if-else statement
- The switch statement

**if** statement is the most basic decision-making statement in the java programming language. There are two possible values of the condition, i.e. true and false.
The code block after the if statement will execute only if the value of the condition statement is true. If the value of the condition statement is false, the code block will not be executed.

**if-else** statement is somewhat similar to the if statement, we are just adding an extra block of the code after the if statement.
If the value of the condition statement is true, the if block will be executed, else the else block will be executed.

**Switch** statement contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched. The switch statement is easier to use instead of if-else-if statements. It also enhances the readability of the program. **Note**: 1) The case variables can be int, short, byte, char, or enumeration. 2) Cases cannot be duplicate. 3) **Break** statement terminates the switch block when the condition is satisfied. It is optional, if not used, next case is executed.

#### 12.2.2 Loop ####
In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true. However, loop statements are used to execute the set of instructions in a repeated order. The execution of the set of instructions depends upon a particular condition.

In Java, we have three types of loops that execute similarly. However, there are differences in their syntax and condition checking time:
- for loop
- while loop
- do-while loop

**for** enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. We use the for loop only when we exactly know the number of times, we want to execute the block of code.

**while** loop is also used to iterate over the number of statements multiple times. However, if we don't know the number of iterations in advance, it is recommended to use a while loop. Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop. It is also known as the entry-controlled loop since the condition is checked at the start of the loop. If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed.

**do-while** loop checks the condition at the end of the loop after executing the loop statements. When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop. It is also known as the exit-controlled loop since the condition is not checked in advance. The syntax of the do-while loop is given below.

#### 12.2.3 Jump ####
Jump statements are used to transfer the control of the program to the specific statements. In other words, jump statements transfer the execution control to the other part of the program. There are two types of jump statements in Java, i.e., break and continue.

**break** statement is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement. However, it breaks only the inner loop in the case of the nested loop. 
The break statement cannot be used independently in the Java program, i.e., it can only be written inside the loop or switch statement.

**continue** statement doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately.

**default**: The default access modifier is accessible within the package only.

**return**: The return keyword finished the execution of a method, and can be used to return a value from a method.

### 12.3 Modifier keyword
#### 12.3.1 Access modifier keyword
As the name suggests access modifiers in Java helps to restrict the scope of a class, constructor, variable, method, or data member. There are four types of access modifiers available in java: 

- Default – No keyword required
- Private
- Protected
- Public

**Default**: When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. 
The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier are accessible only within the same package.

**Private**: The private access modifier is specified using the keyword private. The methods or data members declared as private are accessible only within the class in which they are declared. Any other class of the same package will not be able to access these members. Top-level classes or interfaces can not be declared as private because private means “only visible within the enclosing class”; protected means “only visible within the enclosing class and any subclasses”

**protected**: The protected access modifier is specified using the keyword protected.
The methods or data members declared as protected are accessible within the same package or subclasses in different packages.

**public**: The public access modifier is specified using the keyword public. The public access modifier has the widest scope among all other access modifiers.
Classes, methods, or data members that are declared as public are accessible from everywhere in the program. There is no restriction on the scope of public data members.

#### 12.3.2 No-Access modifier keyword
Non-access modifiers provide information about the characteristics of a class, method, or variable to the JVM. Seven types of Non-Access modifiers are present in Java. They are:

- static
- final
- abstract
- synchronized
- volatile
- transient
- native

**static** keyword means that the entity to which it is applied is available outside any particular instance of the class. That means the static methods or the attributes are a part of the class and not an object. The memory is allocated to such an attribute or method at the time of class loading. The use of a static modifier makes the program more efficient by saving memory. A static field exists across all the class instances, and without creating an object of the class, they can be called.

**final** keyword indicates that the specific class cannot be extended or a method cannot be overridden.

**abstract** keyword is used to declare a class as partially implemented means an object cannot be created directly from that class. Any subclass needs to be either implement all the methods of the abstract class, or it should also need to be an abstract class. The abstract keyword cannot be used with static, final, or private keywords because they prevent overriding, and we need to override methods in the case of an abstract class.

**synchronized** keyword prevents a block of code from executing by multiple threads at once. It is very important for some critical operations.

**volatile** keyword is used to make the class thread-safe. That means if a variable is declared as volatile, then that can be modified by multiple threads at the same time without any issues. The volatile keyword is only applicable to a variable. A volatile keyword reduces the chance of memory inconsistency. The value of a volatile variable is always read from the main memory and not from the local thread cache, and it helps to improve thread performance.

**transient** keyword may be applied to member variables of a class to indicate that the member variable should not be serialized when the containing class instance is serialized. Serialization is the process of converting an object into a byte stream. When we do not want to serialize the value of a variable, then we declare it as transient. 

**native** keyword may be applied to a method to indicate that the method is implemented in a language other than Java. Using this java application can call code written in C, C++, or assembler language. A shared code library or DLL is required in this case.

### 12.4 Exception Handling
**What is an Exception?**

An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception such as the name and description of the exception and the state of the program when the exception occurred.

Java provides five keywords that are used to handle the exception. 

**try** keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

**catch** keyword is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

**finally** block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.

**throw** keyword is used within a method body, or any block of code, and is used to explicitly throw a single exception. The throw keyword can be useful for throwing exceptions based on certain conditions within a code block and for throwing custom exceptions.

**throws** keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

### 12.5 Class Related Keyword
**class** keyword is the most common keyword which is used to declare a new Java class. A class is a container that contains the block of code that includes field, method, constructor, etc. A class is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

**package** keyword creates a package. A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories: Built-in Packages (packages from the Java API) and User-defined Packages (create your own packages)

**import** is a Java keyword. It declares a Java class to use in the code below the import statement. Once a Java class is declared, then the class name can be used in the code without specifying the package the class belongs to. Use the '*' character to declare all the classes belonging to the package.

**extends** keyword is used to indicate that the class which is being defined is derived from the base class using inheritance. So basically, extends keyword is used to extend the functionality of the parent class to the subclass. In Java, multiple inheritances are not allowed due to ambiguity.

**implements** keyword is used to implement an interface. An interface is a special type of class which implements a complete abstraction and only contains abstract methods. To access the interface methods, the interface must be “implemented” by another class with the implements keyword and the methods need to be implemented in the class which is inheriting the properties of the interface. Since an interface is not having the implementation of the methods, a class can implement any number of interfaces at a time.

**interface** in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.

### 12.6 Object Related Keyword
**new** operator is used in Java to create new objects. It can also be used to create an array object. Declaration − A variable declaration with a variable name with an object type. Instantiation − The 'new' keyword is used to create the object.

**instanceof** keyword checks whether an object is an instance of a specific class or an interface. The instanceof keyword compares the instance with type. The return value is either true or false.

**super** keyword refers to superclass (parent) objects. It is used to call superclass methods, and to access the superclass constructor.
The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

**this** keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

### 12.7 Supplements

#### 12.7.1 Final
When a variable is declared with final keyword, its value can’t be modified. This also means that you must initialize a final variable,  otherwise, the compiler will throw a compile-time error. However, in the case of a reference final variable, the internal state of the object pointed by that reference variable can be changed. Note that this is not re-assigning. This property of final is called non-transitivity.

Example
```java
class GFG {
    public static void main(String[] args)
    {
        // Final reference variable
        final StringBuilder sb = new StringBuilder("Geeks");
 
        // Printing the element in StringBuilder object
        System.out.println(sb);
 
        // changing internal state of object reference by
        //  final reference variable sb
        sb.append("ForGeeks");
 
        // Again printing the element in StringBuilder
        // object after appending above element in it
        System.out.println(sb);
    }
}
```

When a class is declared with final keyword, it is called a final class. A final class cannot be extended(inherited). 
Therefore, we can use `final` to create an immutable class.
- The class must be declared as **final** so that child classes can’t be created.
- Data members in the class must be declared **private** so that direct access is not allowed.
- Data members in the class must be declared as **final** so that we can’t change the value of it after object creation.
- A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
- Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)

Example
```java
final class MyImmutableClass {
    private final int id;
    private final String name;
    private final List<Integer> list;

    private final List<C> list2;

    public MyImmutableClass(int id, String name, List<Integer> list, List<C> list2) {
        this.id = id;
        this.name = name;
        this.list = list;
        this.list2 = list2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getList() {
        List<Integer> res = new ArrayList<>();
        for (Integer num: list) {
            res.add(num);
        }
        return res;
//        return list;
    }

    public List<C> getList2() {
        List<C> res = new ArrayList<>(list2);
        return res;
    }
}
```

When a method is declared with final keyword, it is called a final method. A final method cannot be overridden. 

|Key	|final	|finally	|finalize|
| ------------- | ------------- | ------------- | ------------- |
|Definition|	final is the keyword and access modifier which is used to apply restrictions on a class, method or variable. |finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.	|finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.|
|Applicable to|	Final keyword is used with the classes, methods and variables.	|Finally block is always related to the try and catch block in exception handling.	|finalize() method is used with the objects.|
|Functionality|	(1) Once declared, final variable becomes constant and cannot be modified. (2) final method cannot be overridden by sub class. (3) final class cannot be inherited.	|(1) finally block runs the important code even if exception occurs or not. (2) finally block cleans up all the resources used in try block	|finalize method performs the cleaning activities with respect to the object before its destruction.|
|Execution|	Final method is executed only when we call it.	|Finally block is executed as soon as the try-catch block is executed. It's execution is not dependant on the exception.|finalize method is executed just before the object is destroyed.|


#### 12.7.2 static
The static keyword in Java is used to share the same variable or method of a given class. 

**static block**: If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded. 
```java
class Test
{
    // static variable
    static int a = 10;
    static int b;
      
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
  
    public static void main(String[] args)
    {
       System.out.println("from main");
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
    }
}
```

**static member**: When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. 

```java
class Test
{
    // static method
    static void m1()
    {
        System.out.println("from m1");
    }
  
    public static void main(String[] args)
    {
          // calling m1 without creating
          // any object of class Test
           m1();
    }
}
```

**static variable**: When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.

Important points for static variables:
- We can create static variables at the class level only.
- static block and static variables are executed in the order they are present in a program.

**static methods**:  The most common example of a static method is the main( ) method. Any static member can be accessed before any objects of its class are created, and without reference to any object. Methods declared as static have several restrictions: 

- They can only directly call other static methods.
- They can only directly access static data.
- They cannot refer to this or super in any way.

**static Classes**: A class can be made static only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare nested classes as static. Such types of classes are called Nested static classes. 


## 13. OOP
Object-Oriented Programming or OOPs refers to languages that uses objects in programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.

### 13.1 Method Declaration
#### 13.1.1 Access Modifier
Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers. 
- `public`: accessible in all class in your application.
- `protected`: accessible within the package in which it is defined and in its subclass(es)(including subclasses declared outside the package)
- `private`: accessible only within the class in which it is defined.
- `default` (declared/defined without using any modifier): accessible within same class and package within which its class is defined.

#### 13.1.2 The return type
The data type of the value returned by the method or void if does not return a value.

#### 13.1.3 Method Name
The rules for field names apply to method names as well, but the convention is a little different.

#### 13.1.4 Parameter list
Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().

#### 13.1.5 Exception list
The exceptions you expect by the method can throw, you can specify these exception(s).

#### 13.1.6 Method body
It is enclosed between braces. The code you need to be executed to perform your intended operations.

### 13.2 Message Passing
Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent.

### 13.3 Four Pillars of OOPs
#### 13.3.1 Abstraction
Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

#### 13.3.2 Encapsulation
It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield. 

#### 13.3.3 Inheritance
Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class. 

Important terminologies:
- Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
- Sub Class: The class that inherits the other class is known as subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
- Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

#### 13.3.4 Polymorphism

It refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently. This is done by Java with the help of the signature and declaration of these entities. 

**overloading**
Overloading is the ability to define more than one method with the same name in a class. , but different signatures where the signature can differ by the number of input parameters or type of input parameters or both. Overloading is related to compile-time (or static) polymorphism.

```java
public class Sum {
  
    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y)
    {
        return (x + y);
    }
  
    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
  
    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }

    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
```
**Note** 
- We can have two ore more static methods with same name, but differences in input parameters. 
- We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same).
-  we can overload `main()` in Java.

**overriding**
Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. Method overriding is one of the way by which java achieve Run Time Polymorphism.The version of a method that is executed will be determined by the object that is used to invoke it. 
