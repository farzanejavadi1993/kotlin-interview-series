

// A simple lambda for summing two integers
val sum = { a: Int, b: Int -> a + b }

// A lambda with no parameter
val greet = { println("Hello from Lambda!") }

// Using lambda in a higher-order function
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println(sum(2, 3)) // Output: 5

    greet() // Output: Hello from Lambda!

    // Passing lambda directly
    val result = performOperation(10, 20) { x, y -> x * y }
    println("Multiplication result: $result") // Output: 200
}
