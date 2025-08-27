
// Lambda: concise and clean
val double = { x: Int -> x * 2 }

// Anonymous function: more flexible
val triple = fun(x: Int): Int {
    return x * 3
}

fun runOperations() {
    println("Double of 4: ${double(4)}") // Output: 8
    println("Triple of 4: ${triple(4)}") // Output: 12
}

// Difference in return behavior
fun testLambdaReturn() {
    listOf(1, 2, 3).forEach {
        if (it == 2) return // Will exit the enclosing function
        println("Lambda: $it")
    }
    println("This won't be printed in lambda")
}

fun testAnonymousReturn() {
    listOf(1, 2, 3).forEach(fun(it: Int) {
        if (it == 2) return // Only exits the anonymous function
        println("Anon: $it")
    })
    println("This WILL be printed in anonymous function")
}

fun main() {
    runOperations()

    println("\n-- Lambda return test --")
    // testLambdaReturn()

    println("\n-- Anonymous function return test --")
    testAnonymousReturn()
}
