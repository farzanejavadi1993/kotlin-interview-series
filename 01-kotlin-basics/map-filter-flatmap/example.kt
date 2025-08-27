fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val doubled = numbers.map { it * 2 }
    println("Doubled: $doubled")

    val even = numbers.filter { it % 2 == 0 }
    println("Even: $even")

    val nested = listOf(listOf(1, 2), listOf(3, 4))
    val flat = nested.flatMap { it }
    println("Flat: $flat")
}
