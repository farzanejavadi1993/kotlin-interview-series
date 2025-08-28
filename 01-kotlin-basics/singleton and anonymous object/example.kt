//anonymous
fun getUserRole(isAdmin: Boolean) = object {
    val role = if (isAdmin) "Admin" else "User"
}

fun main() {
    val user = getUserRole(true)
    println("User role: ${user.role}")
}

//singleton
object Logger {
    fun log(message: String) {
        println("LOG: $message")
    }
}

fun main() {
    Logger.log("App started")
    Logger.log("Another log entry")
}
