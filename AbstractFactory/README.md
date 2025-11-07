# Abstract Factory Design Pattern Example in Java

![Java](https://img.shields.io/badge/Java-8+-blue?logo=java)

This project is a classic demonstration of the **Abstract Factory** design pattern, implemented in Java. It illustrates how to create families of related objects without specifying their concrete classes, using a practical example of a UI toolkit that supports multiple themes (Light and Dark).

## What the Abstract Factory Pattern Does

The Abstract Factory pattern is a creational pattern that provides an interface for creating **families of related or dependent objects** without specifying their concrete classes. It is often called a "factory of factories."

The pattern works by:
1.  **Defining an Abstract Factory Interface**: This interface declares a set of methods for creating each of the different types of objects in the product family (e.g., `createButton()`, `createCheckbox()`).
2.  **Creating Concrete Factory Classes**: For each product family (or "theme"), a concrete factory class implements the abstract factory interface. This concrete factory is responsible for creating the specific products that belong to its family (e.g., `LightThemeFactory` creates `LightButton` and `LightCheckBox`).
3.  **Decoupling the Client**: The client code interacts only with the abstract factory and abstract product interfaces. This means the client doesn't need to know anything about the concrete classes, allowing you to change the entire product family without modifying the client code.

## When to Use the Abstract Factory Pattern

You should consider using the Abstract Factory pattern in the following scenarios:

-   **When your system needs to be independent of how its products are created**: The client only needs to know the abstract interface. The choice of which concrete factory (and thus which product family) to use can be configured once at runtime.

-   **When you have multiple families of related products that must be used together**: This is the key use case. If you have a set of objects that are designed to work together (like UI components of a specific theme), this pattern enforces that consistency. You can't accidentally mix a `LightButton` with a `DarkCheckBox`.

-   **When you want to provide a library of products and only reveal their interfaces**: The pattern hides the concrete product implementations from the client, promoting a clean separation of concerns and a more maintainable codebase.

-   **When you need to switch between different product families easily**: By changing the concrete factory instance used by the client, you can change the entire behavior and appearance of the application.

## Project Structure

-   **Abstract Factory (`ThemeFactory.java`)**: The interface for creating a family of UI elements.
-   **Concrete Factories (`LightThemeFactory.java`, `DarkThemeFactory.java`)**: Implementations for creating light and dark themed UI elements.
-   **Abstract Products (`Button.java`, `CheckBox.java`)**: Interfaces for the UI elements.
-   **Concrete Products (`LightButton.java`, `DarkButton.java`, etc.)**: Concrete implementations of the UI elements for each theme.
-   **Client (`AbstractFactoryDemo.java`, `Application.java`)**: Uses a factory to create products without knowing the concrete types.

## Prerequisites

-   Java Development Kit (JDK) 8 or newer.

## How to Run

1.  **Navigate to the `AbstractFactory` directory.**
2.  **Compile the source files:**
    ```sh
    javac -d out src/*.java
    ```
3.  **Run the demo:**
    ```sh
    java -cp out AbstractFactoryDemo
    ```

## Expected Output

```
Dark Button paint
Dark CheckBox check
```