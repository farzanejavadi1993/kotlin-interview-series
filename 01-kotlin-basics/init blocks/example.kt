class User(val name: String, val age: Int) {
    init {
        println("Initializing User: $name")
    }

    init {
        if (age < 0) {
            throw IllegalArgumentException("Age can't be negative")
        }
    }

    val isAdult = age >= 18
}

fun main() {
    val user = User("Sina", 21)
    println("${user.name} is adult: ${user.isAdult}")
}
