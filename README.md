# Assignment #4 — Facade Design Pattern

**Course:** Software Design Patterns  
**Topic:** Programming Language Compiler  
**Language:** Java  
**Design Pattern:** Facade (Structural)

## 1. Project Description

This project demonstrates the **Facade Design Pattern** using a simplified programming language compiler.

A compiler consists of multiple components that perform different tasks, such as lexical analysis, parsing, semantic analysis, optimization, and code generation.

Instead of requiring the client to interact with each component individually, the `ProgrammingLanguageFacade` provides a single `compile()` method that coordinates the entire process.

## 2. Project Structure

The project contains the following classes:

- `IPart` — Interface shared by all subsystem components.
- `Lexer` — Represents lexical analysis.
- `Passer` — Represents the parsing stage.
- `SemanticAnalyzer` — Represents semantic analysis.
- `Optimizer` — Represents code optimization.
- `CodeGenerator` — Represents code generation.
- `ProgrammingLanguageFacade` — Coordinates all five components.
- `Main` — Client that interacts only with the Facade.

## 3. How the Facade Pattern Works

The Facade pattern provides a simplified interface to a group of subsystem classes.

In this project, the client only needs to execute:

```java
ProgrammingLanguageFacade facade = new ProgrammingLanguageFacade();
facade.compile();
```

The Facade internally calls the subsystem components in the following order:

1. **Lexer** — Lexical analysis.
2. **Passer** — Parsing.
3. **SemanticAnalyzer** — Semantic analysis.
4. **Optimizer** — Code optimization.
5. **CodeGenerator** — Code generation.

Each subsystem currently simulates its work by printing a message rather than performing actual compilation.

The Facade hides the coordination process from the client, reducing complexity and dependencies.

## 4. Clean Code Principles

### 1. Single Responsibility Principle (SRP)

Each subsystem class has one clearly defined responsibility. For example, `Lexer` represents lexical analysis, while `Optimizer` represents code optimization.

The Facade is responsible only for coordinating these components.

### 2. Meaningful Names

Classes such as `Lexer`, `SemanticAnalyzer`, `CodeGenerator`, and `ProgrammingLanguageFacade` describe their intended responsibilities.

The method `compile()` also clearly communicates the purpose of the Facade.

### 3. Encapsulation

The subsystem objects are stored in private fields inside `ProgrammingLanguageFacade`.

The client does not need to access these objects or understand their execution order.

### 4. Reduced Client Dependencies

The `Main` class depends only on `ProgrammingLanguageFacade`.

Without the Facade, the client would need to create and call five different subsystem objects manually.

Using the Facade simplifies the client code and separates it from subsystem coordination.

### 5. Interface-Based Design

All subsystem classes implement the `IPart` interface, which defines the `work()` method.

This provides a consistent way for the Facade to interact with different components.

It also allows components to be replaced with alternative implementations more easily.

## 5. Expected Output

```text
Compilation starts
Lexer works
Passer does work
Analyzer does work
Optimizer does work
Code generator does work
Compilation ends
```

## 6. Advantages of the Facade Pattern

- Simplifies interactions with multiple subsystem classes.
- Reduces dependencies between the client and subsystems.
- Centralizes subsystem coordination.
- Improves code readability.
- Makes the system easier to maintain when the compilation workflow changes.

## 7. Disadvantages of the Facade Pattern

- The Facade may become a **God Class** if too many responsibilities are added.
- Changes to the subsystem workflow may require modifications to the Facade.
- An overly simplified API may not provide enough flexibility for advanced operations.

## 8. Conclusion

This project demonstrates the basic structure of the Facade Design Pattern through a programming language compiler simulation.

The `ProgrammingLanguageFacade` provides one simplified method, `compile()`, which coordinates five subsystem classes.

The client interacts only with the Facade, while the individual subsystem classes remain independent of it.

The implementation illustrates how the Facade pattern can reduce client complexity and organize interactions between multiple components.
