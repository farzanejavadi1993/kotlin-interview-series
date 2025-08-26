# Can extension functions be defined for nullable types?

## ✅ Summary
Yes, Kotlin allows you to define extension functions on nullable types (e.g., `String?`, `Int?`).  
This lets you safely handle null values with clean, reusable logic — avoiding repetitive `if` statements.

## 📘 Detailed Explanation

- Nullable receivers (`String?`, `User?`, etc.) are perfectly valid in Kotlin extensions.
- Inside the extension function, `this` can be `null`, so you have to handle it properly.
- These are great for creating safe wrappers or custom null checks.

## 💡 Use Cases
- Avoid repeating `if (x != null && x.isNotEmpty())`
- Centralize null-checking logic
- Improve readability when chaining

## 💻 Example

```kotlin
fun String?.isSafeEmpty(): Boolean {
    return this == null || this.isEmpty()
}

val name: String? = null
println(name.isSafeEmpty()) // true
```
## Output
true

