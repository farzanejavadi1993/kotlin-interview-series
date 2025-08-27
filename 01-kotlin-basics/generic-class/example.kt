class Box<T>(private val item: T) {
    fun getItem(): T = item
}

fun main() {
    val intBox = Box(123)
    val stringBox = Box("Hello")

    println("Int box contains: ${intBox.getItem()}")       // Output: 123
    println("String box contains: ${stringBox.getItem()}") // Output: Hello
}
