class User(val name: String, val age: Int) {
    // Secondary constructor
    constructor(name: String) : this(name, 18) {
        println("Secondary constructor used")
    }
}

fun main() {
    val user1 = User("Alex", 25) // primary
    val user2 = User("Lina")     // secondary

    println("${user1.name}, ${user1.age}")
    println("${user2.name}, ${user2.age}")
}
