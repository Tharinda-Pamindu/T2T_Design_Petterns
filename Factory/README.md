# Simple Factory Pattern Example in Java

![Java](https://img.shields.io/badge/Java-8+-blue?logo=java)

This project provides a straightforward demonstration of the **Simple Factory** pattern in Java. It shows how to centralize the creation of objects that share a common interface, decoupling the client from concrete implementation details.

## What the Simple Factory Pattern Does

The Simple Factory pattern is a creational pattern that provides a single class with a creation method to hide the instantiation logic from the client. While not one of the original 23 "Gang of Four" design patterns, it's a very common and practical first step towards looser coupling.

The pattern works by:
1.  **Defining a Product Interface**: A common interface is shared by all objects that the factory can create (e.g., `Shape`).
2.  **Creating Concrete Products**: These are the distinct classes that implement the product interface (e.g., `Circle`, `Square`).
3.  **Implementing the Factory**: A single factory class has a method that takes a parameter (e.g., an enum). Based on this parameter, it decides which concrete product to instantiate and return.

This encapsulates the object creation logic (`new Circle()`, etc.) inside the factory, simplifying the client code and centralizing control.

## When to Use the Simple Factory Pattern

The Simple Factory pattern is a good choice in the following situations:

-   **When object creation is simple, but you want to decouple the client from concrete classes**: It provides a basic level of abstraction, allowing you to change the classes being created without changing the client code.

-   **To centralize creation logic**: When you have object creation logic scattered across your application, moving it into a single factory makes the code cleaner, easier to maintain, and easier to understand.

-   **As a simpler alternative to Factory Method or Abstract Factory**: If your object creation process is not complex and you don't need to allow subclasses to change the type of objects being created, a Simple Factory is often sufficient.

## Project Structure

-   **Product Interface (`Shape.java`)**: The common interface for all products.
-   **Concrete Products (`Circle.java`, `Rectangle.java`, `Square.java`)**: The concrete classes that the factory can create.
-   **Factory (`ShapeFactory.java`)**: The class that contains the method for creating `Shape` objects.
-   **Client (`FactoryDemo.java`)**: The class that uses the factory to get objects.

## Prerequisites

-   Java Development Kit (JDK) 8 or newer.

## How to Run

1.  **Navigate to the `Factory` directory.**
2.  **Compile the source files:**
    ```sh
    javac -d out src/*.java
    ```
3.  **Run the demo:**
    ```sh
    java -cp out FactoryDemo
    ```

## Expected Output

```
Square drawing
Circle drawing
Rectangle drawing
```
