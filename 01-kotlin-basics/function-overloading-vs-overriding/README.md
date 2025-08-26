# What is function overloading in Kotlin and how is it different from overriding?

## ✅ Summary

Function **overloading** means defining multiple functions with the same name but different parameters in the same scope.  
Function **overriding** means redefining a function from a superclass in a subclass using `override`.

## 📘 Detailed Explanation

- **Overloading** happens at compile time (based on different signatures).
- **Overriding** happens at runtime (based on dynamic dispatch).
- You use `override` keyword when implementing a function from a base class or interface.

## 💡 Use Cases

- **Overloading:** when you want the same method name to work with different parameter types.
- **Overriding:** when you want to change behavior of inherited functions.

## 💻 Example

### Overloading:

```kotlin
fun greet() {
    println("Hello!")
}

fun greet(name: String) {
    println("Hello, $name!")
}
```
### Overloading:

```kotlin
open class Animal {
    open fun speak() {
        println("Generic animal sound")
    }
}

class Dog : Animal() {
    override fun speak() {
        println("Woof!")
    }
}
```
## Output
Hello!
Hello, Alice!
Generic animal sound
Woof!

