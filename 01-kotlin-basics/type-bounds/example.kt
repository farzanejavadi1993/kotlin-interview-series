package typebounds

fun <T : Number> doubleValue(value: T): Double {
    return value.toDouble() * 2
}

fun main() {
    println("Double of 4: ${doubleValue(4)}")         // Output: 8.0
    println("Double of 5.5f: ${doubleValue(5.5f)}")   // Output: 11.0
}


