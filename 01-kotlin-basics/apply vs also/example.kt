data class Button(var text: String, var color: String)

fun main() {
    val myButton = Button("Click", "Blue")

    // Using apply to configure the object
    val configuredButton = myButton.apply {
        text = "Submit"
        color = "Green"
    }
    println("Configured: $configuredButton")

    // Using also for logging
    val result = myButton.also {
        println("Button before sending: $it")
    }
}
