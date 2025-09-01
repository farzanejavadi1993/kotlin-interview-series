
---

## 📄 example.kt

```kotlin
// Define an interface
interface Logger {
    fun log(message: String)
}

// Concrete implementation
class FileLogger : Logger {
    override fun log(message: String) {
        println("Writing to file: $message")
    }
}

// Delegate class
class UserManager(logger: Logger) : Logger by logger {
    fun createUser(name: String) {
        log("Creating user: $name")
    }
}

fun main() {
    val logger = FileLogger()
    val manager = UserManager(logger)
    manager.createUser("Ali")
}
