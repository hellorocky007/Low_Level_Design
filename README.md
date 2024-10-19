Introduction
The Factory Method design pattern is a creational design pattern that defines an interface for creating objects but lets subclasses decide which class to instantiate. It helps promote loose coupling and scalability by deferring the object instantiation to subclasses.

This project demonstrates the implementation of the Factory Method in Java, focusing on low-level design principles.

Why Use Factory Method
Decoupling: The Factory Method pattern decouples the client code from the concrete classes used to instantiate objects, making the system more modular and maintainable.
Scalability: New types of objects can be introduced without modifying existing code.
Responsibility Delegation: Object creation is encapsulated, allowing you to focus on using objects without worrying about their creation logic.
Use Cases
When the exact type of object to be created is not known until runtime.
When you want to provide flexibility in creating objects without altering client code.
When creating objects involves complex processes or rules.
How It Works
The Product defines a common interface for all types of objects that can be created.
ConcreteProduct classes implement this interface.
The Factory (Creator) declares the factory method and may provide some default behavior.
ConcreteFactory (Concrete Creator) subclasses override the factory method to specify which ConcreteProduct will be created.
