# Design Patterns in Java

Welcome to the **Design Patterns in Java** repository! This repository is dedicated to the study and implementation of design patterns using Java as the programming language.

## Purpose

The main purpose of this repository is to provide clear and practical examples of various design patterns. Design patterns are essential in software development as they offer proven solutions to common design problems, improving code readability, reusability, and maintainability.

## Structure

The repository is organized into different directories, each representing a specific design pattern. Each directory contains:

- **A detailed README.md** explaining the design pattern, its intent, structure, and examples of where it can be used.
- **Java implementation** of the design pattern.
- **Test cases** demonstrating how to use the pattern in real-world scenarios.

## Design Patterns Covered

### Creational Patterns
- **Singleton**
- **Factory Method**
- **Abstract Factory**
- **Builder**
- **Prototype**

### Structural Patterns
- **Adapter**
- **Composite**
- **Decorator**
- **Facade**
- **Flyweight**
- **Proxy**

### Behavioral Patterns
- **Chain of Responsibility**
- **Command**
- **Interpreter**
- **Iterator**
- **Mediator**
- **Memento**
- **Observer**
- **State**
- **Strategy**
- **Template Method**
- **Visitor**

## Getting Started

To get started with the examples, clone the repository and navigate to the directory of the design pattern you are interested in. Each pattern’s directory contains a README.md with detailed information and instructions on how to run the examples.

### Prerequisites

- **Java Development Kit (JDK)**: Make sure you have JDK installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- **Maven**: This project uses Maven for dependency management and building. You can download Maven from [here](https://maven.apache.org/download.cgi).

### Running the Examples

1. Clone the repository:
   ```bash
   git clone https://github.com/italomanzine/DesignPatterns.git

2. Navigate to the directory of the design pattern you want to explore:
    ```bash
    cd DesignPatterns/Creational/Singleton

3. Compile and run the Java files:
    ```bash
    mvn clean install
    mvn exec:java -Dexec.mainClass="com.yourpackage.MainClass"

### Contributing
Contributions are welcome! If you have improvements or new patterns to add, feel free to fork the repository, make your changes, and submit a pull request.