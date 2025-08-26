# What is the difference between `interface`, `abstract class`, and `sealed class` in Kotlin?

## ✅ Summary

These are three different tools in Kotlin for defining class hierarchies — each with its own use case:

- `interface` defines **a contract** without implementation (though it can have default methods).
- `abstract class` can hold **state and logic**, but cannot be instantiated directly.
- `sealed class` restricts the class hierarchy — all subclasses must be declared in the same file.

---

## 📘 Detailed Explanation

| Feature              | `interface`                          | `abstract class`                         | `sealed class`                              |
|----------------------|--------------------------------------|-------------------------------------------|---------------------------------------------|
| Can have state?      | ❌ No                                | ✅ Yes                                    | ✅ Yes                                       |
| Can have logic?      | ✅ (default methods)                 | ✅ Yes                                    | ✅ Yes                                       |
| Can be instantiated? | ❌ No                                | ❌ No                                     | ❌ No                                        |
| Use case             | Defining contracts, multiple inherit | Shared base logic                        | Modeling fixed hierarchies (e.g., states)   |
| Inheritance          | A class can implement multiple       | A class can only extend one              | A class can only extend one sealed class    |

---

## 💡 When to use

- **Use `interface`** when you only care about behavior, and need multiple inheritance (e.g., `Clickable`, `Draggable`)
- **Use `abstract class`** when you want to define some base functionality or state (e.g., `BaseViewModel`)
- **Use `sealed class`** when the set of possible subclasses is known and limited (e.g., `Result.Success`, `Result.Failure`)

---

## 💻 Code Example

```kotlin
// Interface: defines a contract
interface Animal {
    fun speak()
}

// Abstract class: provides base logic
abstract class Pet(val name: String) {
    abstract fun makeSound()
    fun greet() = println("Hello from $name")
}

// Sealed class: models a fixed set of outcomes
sealed class NetworkResult {
    data class Success(val data: String) : NetworkResult()
    data class Error(val exception: Exception) : NetworkResult()
}

```
### Output
val result: NetworkResult = NetworkResult.Success("Data Loaded")

when (result) {
    is NetworkResult.Success -> println("Data: ${result.data}")
    is NetworkResult.Error -> println("Error: ${result.exception.message}")
}


Data: Data Loaded

