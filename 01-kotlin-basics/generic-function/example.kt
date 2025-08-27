// A generic function that returns the first element of a list
fun <T> firstElement(list: List<T>): T {
    return list[0]
}

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")
    val numbers = listOf(10, 20, 30)

    println("First name: ${firstElement(names)}")     // Output: Alice
    println("First number: ${firstElement(numbers)}") // Output: 10
}
