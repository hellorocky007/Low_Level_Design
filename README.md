Factory Method Design Pattern in Java
Introduction
The Factory Method design pattern is a creational pattern that provides an interface for creating objects, allowing subclasses to decide which class to instantiate. It promotes loose coupling and enhances scalability by delegating object instantiation to subclasses, ensuring the client is not tied to specific classes.

This project showcases the implementation of the Factory Method pattern in Java, focusing on core low-level design principles.

Why Use Factory Method?
Decoupling: The pattern decouples the client code from the concrete classes used to create objects, making the system more modular and maintainable.
Scalability: New types of objects can be easily introduced without modifying existing code, enhancing flexibility.
Responsibility Delegation: Object creation is encapsulated, allowing you to focus on using objects rather than how they are instantiated.
Use Cases
When the exact type of object to be created is unknown until runtime.
When you need flexibility in creating objects without altering client code.
When the creation process of an object involves complex rules or logic.
How It Works
Product Interface: Defines a common interface for all types of objects that can be created.
Concrete Product Classes: These classes implement the product interface, representing the objects that will be created.
Factory (Creator): Declares the factory method, which can include some default behavior for object creation.
Concrete Factories (Concrete Creators): Subclasses that override the factory method to create specific ConcreteProduct objects.
