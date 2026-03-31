
# OOPS

- What: programming paradigm based on concept of object.
- 
- Models real world entities based on 4 concepts: 
  - Encapsulation: wrapping data+methods into single unit called Class.
  - Inheritance: code reuse in subclass from superclass.
  - Polymorphism: methods can behave differently depending on object.
  - Abstraction: hides complex implementation.

- Why : Code reusability (inheritance) -> DRY principle dont repeat yourself
- reduce code complexity

- How: Classes (blueprint) and Objects (instance of a class containing data and methods)
- constructors are used to create or initialize the objects
- 


data = attributes
methods = functions


## Four Main Principles of OOP:

    Encapsulation: Encapsulation is the concept of wrapping data (attributes) and methods (functions) into a single unit called a class. It hides the internal state of the object from the outside world and only exposes what is necessary. This helps in protecting the data and preventing unintended interference.

    Inheritance: Inheritance allows a new class (subclass) to inherit properties and methods from an existing class (superclass). It promotes code reuse and establishes a hierarchy between classes.

    Polymorphism: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It also means that methods can behave differently based on the object that invokes them. This is achieved through method overriding (in subclasses) and method overloading (in the same class).

    Abstraction: Abstraction hides complex implementation details and shows only the necessary features of an object. It simplifies interactions with objects by providing a clear and simplified interface.



Abstraction: Focuses on what it does than how it does like dashboard.
  - Abstract class = template only cannot objectify (all vehicles can move, but doesn't define how they move)
  - interface = contract for implementing all its methods.
  - diamond problem - concrete class can extend only one class

Encapsulation: protects the items inside the class
- require methods to interact with objects (getter setter)
- creating a class definition itself implements encapsulation

Inheritance: process of extending one class to acquire properties and behaviour in another class
- this , super keyword is used to access

Polymorphism: object behave differently based on context
- Compile time polymorphism: method overloading: many methods with same name diff arguments.
  - binding happens during compile time
- run time polymorphism: method overriding: redefining the parent method in subclass.
  - creating object of subclass type will call the method of same name in subclass.




# control flow statements

- decision making 
- - if
- - if else 
- - switch 
- Loops
- - for
- - while 
- - do while


## Access modifiers
- public: can access from anywhere, called outside the class


## Other keywords
- Class: used to declare a class, starts with uppercase, same filename.
- static: belongs to class itself and need not objectify the class to call this
- void: doesn't return any value.
- main: spl method, where java prog starts
- String[] args: array of string objects used to pass commandline arguments to program. even without any arguments array is still created and passed.



## Datatypes
- int: 12 54
- double: 45.67   67.232
- char: F D
- boolean: true false







