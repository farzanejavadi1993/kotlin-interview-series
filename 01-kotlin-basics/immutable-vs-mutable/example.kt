fun main() {
    val immutableList = listOf("apple", "banana", "cherry")
    println("Immutable: $immutableList")

    val mutableList = mutableListOf("apple", "banana")
    mutableList.add("cherry")
    println("Mutable: $mutableList")
}
