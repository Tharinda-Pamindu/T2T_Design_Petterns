# Prototype Design Pattern Example in Java

![Java](https://img.shields.io/badge/Java-8+-blue?logo=java)

This project demonstrates the **Prototype** design pattern in Java. It shows how to create new objects by copying an existing object (a "prototype"), rather than creating them from scratch using a constructor.

## What the Prototype Pattern Does

The Prototype pattern is a creational design pattern that lets you create new objects by copying an existing object, known as the prototype. This avoids the cost of creating an object from scratch and decouples the client from the concrete classes of the objects it needs to create.

The pattern works by:
1.  **Defining a Prototype Interface**: This is typically the `Cloneable` interface in Java, which indicates that an object can be copied.
2.  **Implementing the Cloning Logic**: The prototype class overrides the `clone()` method to provide the logic for creating a copy of itself.
3.  **Creating New Objects by Cloning**: The client creates a new object by asking the prototype to clone itself, rather than calling a constructor with `new`.

A key concept in this pattern is the difference between a **shallow copy** and a **deep copy**.
-   A **Shallow Copy** (as used in this example) copies the fields of an object. If a field is a primitive type, its value is copied. If it's an object reference, only the reference is copied, not the object it points to.
-   A **Deep Copy** copies everything. It creates a new instance of the object and also creates new instances of any objects it references.

## When to Use the Prototype Pattern

You should consider using the Prototype pattern in the following scenarios:

-   **When the cost of creating a new object is expensive**: If an object requires significant resources or time to create (e.g., it needs data from a database or a network call), it's often more efficient to clone an existing, fully initialized instance.

-   **When you want to avoid a large number of subclasses**: If you have a set of classes that only differ in their initial state, you can create a set of configured prototype objects and clone them instead of creating a separate subclass for every possible configuration.

-   **When your code should not depend on the concrete class of the object you need to create**: The client can work with any object that implements the prototype interface, making the system more flexible.

## Project Structure

-   **Prototype (`Document.java`)**: The class that can be cloned. It implements `Cloneable` and provides a concrete `clone()` method.
-   **Client (`PrototypeDemo.java`)**: The class that uses a prototype object to create a new object by calling its `clone()` method.

## Prerequisites

-   Java Development Kit (JDK) 8 or newer.

## How to Run

1.  **Navigate to the `Prototype` directory.**
2.  **Compile the source files:**
    ```sh
    javac -d out src/*.java
    ```
3.  **Run the demo:**
    ```sh
    java -cp out PrototypeDemo
    ```

## Expected Output

The output demonstrates that `d2` is a new object (`d1 == d2` is false) but has the exact same state as `d1` (`d1.equals(d2)` is true).

```
Document{title='Tittle for D1', content='Content for D1'}
Document{title='Tittle for D1', content='Content for D1'}
true
false
```

### A Note on Shallow vs. Deep Copy

This example uses a shallow copy (`super.clone()`), which is safe because the `Document` class only contains immutable `String` objects.

If `Document` contained mutable fields (e.g., a `List<String>` or another custom object), a shallow copy would be dangerous. Both the original and the clone would share the same internal mutable object, and a change in one would affect the other. In that case, you would need to perform a **deep copy** by manually creating new instances of the mutable fields within the `clone()` method.
