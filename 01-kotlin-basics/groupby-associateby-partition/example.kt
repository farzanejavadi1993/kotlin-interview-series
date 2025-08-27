data class User(val name: String, val age: Int)

fun main() {
    val users = listOf(
        User("Alice", 30),
        User("Bob", 25),
        User("Anna", 30),
        User("Eve", 17)
    )

    val byName = users.associateBy { it.name }
    println("Associate by name: $byName")

    val byAge = users.groupBy { it.age }
    println("Group by age: $byAge")

    val (adults, minors) = users.partition { it.age >= 18 }
    println("Adults: $adults")
    println("Minors: $minors")
}
