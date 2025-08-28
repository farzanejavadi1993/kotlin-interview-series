### 💡 Question
What is a companion object in Kotlin?

### ✅ Answer
A **companion object** is a singleton object declared inside a class using the `companion` keyword. It allows you to define members that behave like static members in Java — but with more power.

- You can access its properties and methods via the class name.
- It can access private members of the class.
- You can also name the companion object (optional).

Great for things like factory methods or constants.

