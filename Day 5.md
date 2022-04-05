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

### 19.3 implementing the Callable Interface
One feature lacking in  Runnable is that we cannot make a thread return result when it terminates, i.e. when run() completes. For supporting this feature, the Callable interface is present in Java.

When the call() method completes, answer must be stored in an object known to the main thread, so that the main thread can know about the result that the thread returned. How will the program store and obtain this result later? For this, a Future object can be used.

Observe that Callable and Future do two different things – Callable is similar to Runnable, in that it encapsulates a task that is meant to run on another thread, whereas a Future is used to store a result obtained from a different thread. 

A FutureTask can be created by providing its constructor with a Callable. Then the FutureTask object is provided to the constructor of Thread to create the Thread object. Thus, indirectly, the thread is created with a Callable. For further emphasis, note that there is no way to create the thread directly with a Callable.

Example
```java
public class ThreadCreationDemo {

   public static void main(String[] args) throws ExecutionException, InterruptedException {
       Thread t1 = new CustomizedThread();
       t1.start();

       Thread t2 = new Thread(new RunnanleThread());
       t2.start();

       FutureTask ft = new FutureTask(new CallableThread());
       Thread t3 = new Thread(ft);
       t3.start();
       System.out.println(ft.get());

       Thread t4 = new Thread(
               () -> {
                   System.out.println("from runnable, by using lambda expression");
               }
       );
       t4.start();
   }
}


class CustomizedThread extends Thread {
   public void run() {
       System.out.println("extends thread class, the currerent thread is " + Thread.currentThread().getName());
   }
}

class RunnanleThread implements Runnable {

   @Override
   public void run() {
       System.out.println("from runable, the currerent thread is " + Thread.currentThread().getName());
   }
}

class CallableThread implements Callable {

   @Override
   public Integer call() throws Exception {
       System.out.println("from callable, the currerent thread is " + Thread.currentThread().getName());
       return 200;
   }
}
```

### 19.4 Thread Pool
A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem of thread cycle overhead and resource thrashing. Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, making the application more responsive.

To use thread pools, we first create a object of ExecutorService and pass a set of tasks to it. `ThreadPoolExecutor` class allows to set the core and maximum pool size.The runnables that are run by a particular thread are executed sequentially.

#### 19.4.1 ThreadPoolExecutor
The ThreadPoolExecutor is an extensible thread pool implementation with lots of parameters and hooks for fine-tuning.

The main configuration parameters are corePoolSize, maximumPoolSize and keepAliveTime.

The corePoolSize parameter is the number of core threads that will be instantiated and kept in the pool. When a new task comes in, if all core threads are busy and the internal queue is full, the pool is allowed to grow up to maximumPoolSize.

The keepAliveTime parameter is the interval of time for which the excessive threads (instantiated in excess of the corePoolSize) are allowed to exist in the idle state. 


### 19.5 Thread Class vs Runnable Interface 
|Thread	|Runnable|
|---|---|
|Thread is a class. It is used to create a thread |Runnable is a functional interface which is used to create a thread |
|It has multiple methods including start() and run() |It has only abstract method run()|
|Each thread creates a unique object and gets associated with it|Multiple threads share the same objects.|
|More memory required |Less memory required |
|Multiple Inheritance is not allowed in java hence after a class extends Thread class, it can not extend any other class |If a class is implementing the runnable interface then your class can extend another class.|

### 19.6 Lifecycle and States of a Thread in Java
The diagram shown below represents various states of a thread at any instant in time.
![image](https://user-images.githubusercontent.com/40971097/161669163-32abcd58-2f16-494c-a0d3-44e98f0c8f59.png)

#### 19.6.1 New
A NEW Thread (or a Born Thread) is a thread that's been created but not yet started. It remains in this state until we start it using the start() method.

#### 19.6.2 Runnable
When we've created a new thread and called the start() method on that, it's moved from NEW to RUNNABLE state. Threads in this state are either running or ready to run, but they're waiting for resource allocation from the system. Executing in JVM.

#### 19.6.3 Blocked
A thread is in the BLOCKED state when it's currently not eligible to run. It enters this state when it is waiting for a monitor lock and is trying to access a section of code that is locked by some other thread (wait for a monitor lock to enter synchronized block or method).

#### 19.6.4 Waiting
A thread is in WAITING state when it's waiting for some other thread to perform a particular action. According to JavaDocs, any thread can enter this state by calling any one of the following three methods:

- object.wait() with no timeout
- thread.join() with no timeout
- LockSupport.park()

#### 19.6.5 Timed Waiting
A thread is in TIMED_WAITING state when it's waiting for another thread to perform a particular action within a stipulated amount of time.
According to JavaDocs, there are five ways to put a thread on TIMED_WAITING state:

- thread.sleep(long millis)
- wait(int timeout) or wait(int timeout, int nanos)
- thread.join(long millis)
- LockSupport.parkNanos
- LockSupport.parkUntil

#### 19.6.6 Terminated
This is the state of a dead thread. It's in the TERMINATED state when it has either finished execution or was terminated abnormally.


### 19.7 OutOfMemoryError
A `java.lang.OutOfMemoryError` is a runtime error in Java which occurs when the Java Virtual Machine (JVM) is unable to allocate an object due to insufficient space in the Java heap. The Java Garbage Collector (GC) cannot free up the space required for a new object, which causes a `java.lang.OutOfMemoryError`. This error can also be thrown when the native memory is insufficient to support the loading of a Java class.

Example of `java.lang.OutOfMemoryError`
```java
public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[1000 * 1000 * 1000];
    }
}
```
And it thorws
```java
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    at OutOfMemoryErrorExample.main(OutOfMemoryErrorExample.java:8)
```

### 19.8 Lock
