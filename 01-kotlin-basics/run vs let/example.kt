fun main() {
    val name: String? = "Farzaneh"

    // Using let for null safety
    name?.let {
        println("Name has ${it.length} characters")
    }

    // Using run for chaining and receiver usage
    val result = name?.run {
        println("Hello, $this")
        length
    }
    println("Name length (via run): $result")
}
