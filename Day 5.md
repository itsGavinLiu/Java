# Day 5
19. Multi-threading

## 19. Multi-threading 
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a **thread**. So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms : 
- Extending the Thread class 
- Implementing the Runnable Interface

### 19.1 Thread creation by extending the Thread class
We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.

```java
class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }
    }
}
```

### 19.2 Thread creation by implementing the Runnable Interface
We create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object. 
```java
class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}
```

### 19.3 Thread Class vs Runnable Interface 
|Thread	|Runnable|
|---|---|
|Thread is a class. It is used to create a thread |Runnable is a functional interface which is used to create a thread |
|It has multiple methods including start() and run() |It has only abstract method run()|
|Each thread creates a unique object and gets associated with it|Multiple threads share the same objects.|
|More memory required |Less memory required |
|Multiple Inheritance is not allowed in java hence after a class extends Thread class, it can not extend any other class |If a class is implementing the runnable interface then your class can extend another class.|
