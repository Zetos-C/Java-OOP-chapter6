# 6. Exercises on Polymorphism, Abstract Classes and Interfaces
#### 6.1 Ex: Abstract Superclass Shape and Its Concrete Subclasses
#### 6.2 Ex: GeometricObject Interface and its Implementation Classes Circle and Rectangle
#### 6.3 Ex: Movable Interface and its Implementation MovablePoint Class
#### 6.4 Ex: Movable Interface and its Implementation Classes MovablePoint and MovableCircle
#### 6.5 Ex: Interfaces Resizable and GeometricObject
#### 6.6 Ex: Abstract Superclass Animal and its Implementation Subclasses
#### 6.7 Ex: Another View of Abstract Superclass Animal and its Implementation Subclasses
#### 6.8 Ex: Interface Movable and its implementation subclasses MovablePoint and MovableCircle
| Feature                  | Abstract Class                                          | Interface                                                |
|--------------------------|---------------------------------------------------------|----------------------------------------------------------|
| Instantiation            | Cannot be directly instantiated; needs to be subclassed | Cannot be directly instantiated; needs to be implemented |
| Method Implementation   | Can have abstract and concrete methods                  | Can only have method signatures until Java 8             |
| Inheritance              | Supports single inheritance                              | Supports multiple inheritance                            |
| Purpose                  | Provides a common base for related classes               | Defines a contract for classes to implement             |
| Method Visibility        | Methods can have various access modifiers               | Methods are implicitly public and abstract              |
| Fields                   | Can have fields, constructors, and non-abstract methods | Cannot have fields or constructors                       |
| Default Method           | Does not support default method until Java 8            | Supports default and static methods since Java 8          |
| Implementation           | Uses `extends` keyword for subclassing                  | Uses `implements` keyword for implementation             |
| Example                  | `abstract class Shape { int x, y; ... }`               | `interface Drawable { /* No fields */ ... }`             |

    
