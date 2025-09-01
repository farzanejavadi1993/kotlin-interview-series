
---

## 📄 example.kt

```kotlin
// Define abstraction
interface Logger {
    fun log(message: String)
}

// Concrete implementation
class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("LOG: $message")
    }
}

// High-level module depends on abstraction
class UserManager(private val logger: Logger) {
    fun login(username: String) {
        logger.log("User $username logged in")
    }
}

// In main or DI container
fun main() {
    val logger: Logger = ConsoleLogger()
    val userManager = UserManager(logger)
    userManager.login("farzaneh")
}
