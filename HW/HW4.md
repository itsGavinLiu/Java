### 1. What’s the difference between final, finally? What is finalize()?
•	The final keyword can be used with class method and variable. A final class cannot be inherited, a final method cannot be overridden and a final variable cannot be reassigned.

•	The finally keyword is used to create a block of code that follows a try block. A finally block of code always executes, whether or not an exception has occurred. Using a finally block allows you to run any cleanup-type statements that you just wish to execute, despite what happens within the protected code.

•	The finalize() method is used just before object is destroyed and can be called just prior to object creation.

### 2. What’s the difference between throw and throws?
The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

### 3. What are the two types of exceptions?
- Checked exceptions are checked at compile-time. It means if a method is throwing a checked exception then it should handle the exception using try-catch block or it should declare the exception using throws keyword, otherwise the program will give a compilation error.
- Unchecked exceptions are not checked at compile time. It means if your program is throwing an unchecked exception and even if you didn’t handle/declare that exception, the program won’t give a compilation error. Most of the times this exception occurs due to the bad data provided by user during the user-program interaction. It is up to the programmer to judge the conditions in advance, that can cause such exceptions and handle them appropriately. All Unchecked exceptions are direct sub classes of RuntimeException class.

### 4. What is error in java?
In Java, an error is a subclass of Throwable that tells that something serious problem is existing and a reasonable Java application should not try to catch that error. Generally, it has been noticed that most of the occurring errors are abnormal conditions and cannot be resolved by normal conditions.

### 5. Exception is object, true or false?
True

### 6. Can a finally block exist with a try block but without a catch?
Yes

### 7. From java 1.7, give an example of the try-resource feature.
We can declare multiple resources just fine in a try-with-resources block by separating them with a semicolon:
![image](https://user-images.githubusercontent.com/40971097/161479164-e117f44b-a252-4ff6-afdb-d7c55cc286ca.png)

### 8. What will happen to the Exception object after exception handling?
The Exception object will be garbage collected in the next garbage collection.

### 9. Can we use String as a condition in switch(str){} clause?
It is recommended to use String values in a switch statement if the data you are dealing with is also Strings. The expression in the switch cases must not be null else, a NullPointerException is thrown (Run-time). Comparison of Strings in switch statement is case sensitive.

### 10. What’s the difference between ArrayList, LinkedList and vector?
Main difference is their implementation which causes different performance for different operations.  ArrayList is implemented as a resizable array. as more elements are added to ArrayList, its size is increased dynamically. Its elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array. LinkedList is implemented as a double linked list. its performance on add and remove is better than ArrayList, but worse on get and set methods. vector is similar with arraylist, but it is synchronized. ArrayList is a better choice if your program is thread-safe. vector and arraylist require space as more elements are added. vector each time doubles its array size, while arraylist grow 50% of its size each time. LinkedList, however, also implements queue interface which adds more methods than ArrayList and vector, such as offer(), peek(), poll(), etc.  

### 11. What’s the difference between hashTable and hashMap?
•	HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.

•	HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.

•	HashMap is generally preferred over HashTable if thread synchronization is not needed.

### 12. What is static import?
It allows members (fields and methods) which have been scoped within their container class as public static, to be used in Java code without specifying the class in which the field has been defined. The feature provides a typesafe mechanism to include constants into code without having to reference the class that originally defined the field.

### 13. What is static block?
In a Java class, a static block is a set of instructions that is run only once when a class is loaded into memory. A static block is also called a static initialization block. This is because it is an option for initializing or setting up the class at run-time.

### 14. Explain the keywords:
`default(java 1.8)`, To declare the member be accessible within enclosing package
`break`, terminates the loop immediately, and the control of the program moves to the next statement following the loop.
`continue`, end the current iteration in a for loop (or a while loop), and continues to the next iteration.
`synchronized`, allow only one thread access/execute at a time
`strictfp`, restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable.
`transient`, marks a member variable not to be serialized when it is persisted to streams of bytes.
`volatile`, tells the compiler that the value of a variable must never be cached as its value may change outside of the scope of the program itself.
`instanceOf`, used to test whether the object is an instance of the specified type (class or subclass or interface).

### 15. Create a program including two threads – thread read and thread write.
Input file ->Thread read -> Calculate -> buffered area
Buffered area -> Thread write -> output file
Detailed description is in assignment4.txt file.
Sample input.txt file.
Attached files are input.txt and a more detailed description file.

https://github.com/itsGavinLiu/JavaBatch/blob/main/HW/TwoThread.java
