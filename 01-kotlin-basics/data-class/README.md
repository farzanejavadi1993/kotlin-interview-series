# What is a data class in Kotlin and when should you use it?

## ✅ Summary
A `data class` is a concise way to create classes that are meant to hold data.  
Kotlin automatically generates useful functions like `equals()`, `hashCode()`, `toString()`, and `copy()`.

## 📘 Detailed Explanation

- You declare a data class using the `data` keyword.
- At minimum, it must have at least **one primary constructor parameter**.
- It’s great for modeling plain data holders like DTOs, view models, and UI states.

## 💡 Use Cases

- Representing data from API responses
- Modeling UI state (e.g., `UserUiState`)
- Passing simple structured data between components

## 💻 Example

```kotlin
data class User(
    val id: Int,
    val name: String,
    val email: String
)

val user = User(1, "Farzaneh", "farzane.javadi1993@gmail.com")

println(user) // toString()
println(user.copy(name = "New Name")) // copy()
```
## Output

User(id=1, name=Farzaneh, email=farzane.javadi1993@gmail.com)
User(id=1, name=New Name, email=farzane.javadi1993@gmail.com)

