// Defining function type: (Int, Int) -> Int
val sum: (Int, Int) -> Int = { a, b -> a + b }

// Another function that takes a function as parameter
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Function reference
fun multiply(x: Int, y: Int): Int = x * y

fun main() {
    println("Sum using lambda: ${sum(2, 3)}") // Output: 5

    val subtract = { x: Int, y: Int -> x - y }
    println("Subtraction using lambda: ${calculate(10, 4, subtract)}") // Output: 6

    println("Multiplication using function reference: ${calculate(3, 5, ::multiply)}") // Output: 15
}
