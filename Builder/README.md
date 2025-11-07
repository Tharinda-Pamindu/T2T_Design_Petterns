# Builder Design Pattern Example in Java

![Java](https://img.shields.io/badge/Java-8+-blue?logo=java)

This project is a demonstration of the **Builder** design pattern in Java. It shows how to construct a complex object (`Computer`) step-by-step, providing a flexible and highly readable alternative to constructors with many parameters.

## What the Builder Pattern Does

The Builder pattern is a creational design pattern that **separates the construction of a complex object from its representation**.

At its core, the pattern does the following:

1.  **Extracts Object Construction Logic**: It moves the logic for constructing a complex object out of the object's class itself and into a separate `Builder` class.
2.  **Enables Step-by-Step Construction**: It provides a series of methods for setting the object's attributes one by one. This allows for a detailed, multi-step construction process.
3.  **Provides a Fluent Interface**: The builder's methods typically return the builder instance (`this`), which allows for method chaining (e.g., `.setCPU(...).setRAM(...)`). This makes the client code highly readable and intuitive.
4.  **Produces the Final Object**: A final `build()` method is called on the builder to assemble and return the fully constructed object.

## When to Use the Builder Pattern

You should consider using the Builder pattern in the following scenarios:

-   **To avoid the "Telescoping Constructor" anti-pattern**: When a class has a constructor with a large number of optional parameters, you end up with a confusing list of overloaded constructors. The Builder pattern solves this by providing descriptive methods for setting each parameter.

-   **When you need to create different representations of an object**: The same construction process can be used to build objects with different configurations. For example, you can use the same `Computer.Builder` to create a basic office PC (with minimal RAM and no graphics card) or a high-end gaming PC.

-   **To build immutable objects**: The Builder pattern is an ideal way to create immutable objects. The builder gathers all the necessary attributes and passes them to a private constructor just once. Since there are no public setters on the final object, its state cannot be changed after it's created.

-   **When the object construction process is complex**: If creating an object requires multiple steps, validation, or a specific order of operations, this logic can be hidden from the client inside the `Builder` class.

## Project Structure

-   **Product (`Computer.java`)**: The complex object that is being built.
-   **Builder (`Computer.Builder`)**: A static nested class that knows how to construct the `Product`.
-   **Client (`BuilderDemo.java`)**: The class that uses the `Builder` to construct a `Product` object.

## Prerequisites

-   Java Development Kit (JDK) 8 or newer.

## How to Run

1.  **Navigate to the `Builder` directory.**
2.  **Compile the source files:**
    ```sh
    javac -d out src/*.java
    ```
3.  **Run the demo:**
    ```sh
    java -cp out BuilderDemo
    ```

## Expected Output

```
Computer{cpu='i9', ram=32, storage=1000.0, graphicCard='RTX 4080'}
```