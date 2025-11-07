# Singleton Design Pattern Example in Java

![Java](https://img.shields.io/badge/Java-8+-blue?logo=java)

This project demonstrates the **Singleton** design pattern in Java. It ensures that the `Logger` class has only one instance and provides a global point of access to it.

## What the Singleton Pattern Does

The Singleton pattern is a creational design pattern that guarantees a class has **only one instance** and provides a single, global point of access to that instance. This is useful for managing shared resources throughout an application.

It is implemented by:
1.  Making the class constructor `private` to prevent other classes from directly instantiating it.
2.  Creating a private static instance of the class itself.
3.  Providing a public static method that acts as the global access point. The first time this method is called, it creates the single instance; on all subsequent calls, it returns the same, already-created instance.

## When to Use the Singleton Pattern

The Singleton pattern should be used when you must ensure that only one instance of a class exists for the entire application. This is common for shared resources, such as:

-   **Logging**: A single logger instance to handle all application logs.
-   **Configuration Management**: A single object to hold and provide access to application configuration settings.
-   **Database Connection Pools**: A single manager for handling a pool of database connections.
-   **Hardware Interface Access**: A single object to manage access to a shared hardware resource like a printer or a serial port.

## Project Structure

-   **Singleton (`Logger.java`)**: The class that is restricted to a single instance. It features a private constructor and a static `getLogger()` method.
-   **Client (`SingletonDemo.java`)**: The class that uses the static method to get the single `Logger` instance and verify its uniqueness.

## Prerequisites

-   Java Development Kit (JDK) 8 or newer.

## How to Run

1.  **Navigate to the `Singleton` directory.**
2.  **Compile the source files:**
    ```sh
    javac -d out src/*.java
    ```
3.  **Run the demo:**
    ```sh
    java -cp out SingletonDemo
    ```

## Expected Output

The program will demonstrate that both `logger` and `logger2` variables point to the exact same object instance, and then use that instance to log a message.

```
true
[YYYY-MM-DD HH:MM:SS] No any errors in this file
```
*(Note: The timestamp will reflect the current date and time.)*

### A Note on Thread Safety

The current implementation in `Logger.java` uses a **lazy, non-thread-safe initialization**. In a multi-threaded environment, this could accidentally result in multiple instances being created, which violates the pattern.

For production applications, a thread-safe approach is crucial. The **Initialization-on-demand holder idiom**, which is already included but commented out in your `Logger.java` file, is the recommended way to implement a lazy, thread-safe Singleton in modern Java.
