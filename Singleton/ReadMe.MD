# Singleton Design Pattern
Creation design pattern used for object creation
Commonly use three different ways to implement

## Project Description
This project is a simple demonstration of the Singleton design pattern in Java.
It contains a `Logger` class that is implemented as a singleton. This ensures that there is only one instance of the `Logger` throughout the application.
The `SingletonDemo` class demonstrates the usage of the `Logger` singleton.

The path to the logger class is `src/Logger.java`.

### How to Run
1. Compile the java files:
   ```bash
   javac src/Logger.java src/SingletonDemo.java
   ```
2. Run the demo:
   ```bash
   java -cp src SingletonDemo
   ```

### Expected Output
The program will print `true` to indicate that both logger instances are the same, followed by a log message with a timestamp.
```
true
[YYYY-MM-DD HH:MM:SS] No any errors in this file
```

## Singleton Implementation
The `Logger.java` file contains two implementations of the Singleton pattern. The currently active implementation is **Lazy Initialization (Thread-unsafe)**. The recommended thread-safe implementation **On-demand Initialization** is commented out.

### On-demand Initialization (Thread-safe) - Recommended
This method uses a static inner class to create the instance of the `Logger` class. The instance is created only when the `getLogger()` method is called for the first time. This implementation is thread-safe without requiring explicit synchronization.

```java
//    private static class LoggerHolder {
//        public static Logger INSTANCE = new Logger();
//    }
//
//    public static Logger getLogger() {
//        return LoggerHolder.INSTANCE;
//    }
```
This is a widely used and recommended approach for implementing singletons in Java.

### Lazy Initialization (Thread-unsafe) - Active
In this method, the instance is created only when the `getLogger()` method is called for the first time.
```java
private static Logger logger;

public static Logger getLogger() {
    return logger = logger == null ? new Logger() : logger;
}
```
**Note:** This implementation is not thread-safe. If multiple threads call `getLogger()` simultaneously when `logger` is null, it can lead to multiple instances of the `Logger` class being created.