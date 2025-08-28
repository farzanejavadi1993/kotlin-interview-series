class AppConfig {
    companion object {
        const val version = "1.0"
        fun printVersion() = println("App version is $version")
    }
}

fun main() {
    AppConfig.printVersion()
    println("Version: ${AppConfig.version}")
}
