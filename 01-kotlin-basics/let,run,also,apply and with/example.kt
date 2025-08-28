data class User(var name: String, var age: Int)

fun main() {
    val user = User("Farzaneh", 30)

    user.let {
        println("User's name is ${it.name}") // using 'it'
    }

    val agePlusOne = user.run {
        age + 1 // using 'this'
    }
    println("Next year: $agePlusOne")

    user.also {
        println("Logging user: $it") // useful for debugging
    }

    user.apply {
        name = "Updated Farzaneh" // modify properties directly
    }
    println("Updated user: $user")

    with(user) {
        println("Inside with: name is $name and age is $age")
    }
}
