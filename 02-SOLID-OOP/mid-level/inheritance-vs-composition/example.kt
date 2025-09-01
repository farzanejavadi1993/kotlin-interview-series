// Inheritance example
open class Animal {
    fun speak() = println("Some generic sound")
}

class Dog : Animal() {
    fun bark() = println("Bark!")
}

// Composition example
class Logger {
    fun log(message: String) = println("Log: $message")
}

class UserManager(private val logger: Logger) {
    fun login(username: String) {
        // some login logic
        logger.log("$username logged in")
    }
}
