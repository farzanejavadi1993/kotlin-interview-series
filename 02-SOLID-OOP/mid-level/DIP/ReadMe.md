# 🔄 Dependency Inversion Principle in Kotlin

---

## 📘 Definition

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

DIP is about reducing tight coupling by relying on **interfaces** instead of concrete classes.

---

## 🚀 Kotlin Features That Help

- **Interfaces**: Allow us to abstract dependencies (e.g. ApiClient, DataSource).
- **Constructor Injection**: Works beautifully in Kotlin with `val` properties.
- **Dependency Injection Frameworks**: Like Hilt, Koin, or Dagger.
- **Default Parameters**: Make manual DI easier without needing full frameworks.

---

## ❌ Bad Example

```kotlin
class UserRepository {
    private val api = NetworkClient() // tightly coupled
}
```
##✅ Good Example
interface ApiClient {
    fun getData(): String
}

class NetworkClient : ApiClient {
    override fun getData() = "From API"
}

class UserRepository(private val api: ApiClient) {
    fun fetchData() = api.getData()
}
Now UserRepository is decoupled from NetworkClient and easier to test and extend.

✅ Summary

Kotlin encourages clean architecture by making abstraction + dependency injection easy.
It’s simple to write testable and modular code using interfaces, constructor injection, and DI tools.
