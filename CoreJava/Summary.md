# Core Java Summary
## 1. Syntax
## 1.1 Keywords

| Keyword | Usage |
|--|--------------|
| `private` | <ul><li>`private` keyword is an **access modifier** that can be applied to class members such as fields, methods, and inner classes.</li> <li> When a member is marked as private, it means that it can ***only be accessed from within the same class where it is declared***. Other classes cannot access or modify private members directly.</li></ul> |
| public | <ul><li> `public` keyword is an **access modifier** that can be applied to class members such as fields, methods, and inner classes.</li><li>When a member is marked as `public`, it means that it can be ***accessed and used by any other code in the same project***, regardless of whether the code is located in the same package or a different package.</li></ul> |
| protected | <ul><li> `protected` keyword is an **access modifier** that can be applied to class members such as fields, methods, and inner classes.</li><li> When a member is marked as `protected`, it means that it can be ***accessed by any other code in the same package, as well as by subclasses of the class where the member is declared***, regardless of whether the subclass is located in the same package or a different package. </li></ul> |
| abstract | <ul><li> `abstract` keyword is used to create abstract classes and abstract methods.</li> <li>An abstract class is a class that cannot be instantiated directly, but can be subclassed. It is used as a template for creating concrete subclasses that implement its abstract methods and override its non-abstract methods. Abstract classes can contain abstract and non-abstract methods, as well as fields, constructors, and inner classes.</li> <li>An abstract method is a method that has no implementation in the abstract class and is marked with the abstract keyword. Abstract methods are used to define a method signature (name, return type, parameters) that concrete subclasses must implement. Concrete subclasses must provide an implementation for all abstract methods inherited from their abstract superclass.</li></ul> |
| extends | <ul><li> `extends` keyword is used to create a subclass that inherits properties (fields and methods) from a superclass. This is used in the declaration of the subclass, followed by the name of the superclass that the subclass is inheriting from.</li><li>The subclass can access and use the `public` and `protected` members (fields and methods) of the superclass, as well as override or add new members. </li></ul>|
| implements | <ul><li> `implements` keyword is used to declare that a class implements one or more interfaces. </li> <li>Using implements can be useful for defining a contract for behavior that can be implemented by different classes. Interfaces provide a way to decouple the definition of behavior from its implementation, which can make code more flexible and reusable.</li> </ul> |
| final | <ul><li> `final` keyword is used to declare a variable, method, or class that cannot be changed or overridden. </li> <li>A final variable is a constant whose value cannot be changed once it has been initialized. A final variable must be initialized when it is declared, and can only be assigned a value once. </li> <li> A final method is a method that cannot be overridden by a subclass. This is useful when you want to prevent a subclass from changing the behavior of a method that is critical to the functioning of the superclass.</li>  <li>A final class is a class that cannot be subclassed. This is useful when you want to prevent other classes from inheriting from your class and changing its behavior.</li> </ul> |
| try catch finally | <ul><li>`try-catch-finally` block is used to handle exceptions, which are unexpected events that can occur during the execution of a program. </li> <li>The `try` block contains the code that might throw an exception. If an exception is thrown, the code within the try block is immediately exited.</li> <li>The `catch` block catches the thrown exception and handles it appropriately. It contains the code that is executed when an exception of the specified type is thrown.</li> <li>The `finally` block contains the code that is executed regardless of whether an exception is thrown or caught. It is typically used to release resources, such as files or database connections, that were acquired within the `try` block.</li> </ul>|
| static | <ul><li>The `static` keyword is used to create class-level variables and methods that are shared by all instances of a class. When a member of a class is declared as static, it belongs to the class and not to any specific instance of the class. This means that you can access a static member without creating an object of the class.</li> <ul> |
| throw | |
| throws | |
| volatile | |
| synchronized | |
| this | |
| super | |
| break | |
| continue | access |
| switch case default | |
| instance of | |
| transient | |
| for while if else | |
