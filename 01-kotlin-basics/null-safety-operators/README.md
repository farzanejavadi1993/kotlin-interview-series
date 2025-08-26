# What is null safety in Kotlin and how do `?.`, `!!`, and `?:` work?

## ✅ Summary
Kotlin's type system is designed to eliminate the null pointer exceptions (NPE) by distinguishing nullable and non-nullable types at compile time.  
The null-safety operators `?.`, `!!`, and `?:` help handle nullable variables safely and concisely.

## 📘 Detailed Explanation

- **`?.` (Safe call operator):** Executes the method only if the object is non-null. Otherwise, returns null.
- **`!!` (Non-null assertion):** Tells the compiler “trust me, this won’t be null.” If it is null, it crashes the app.
- **`?:` (Elvis operator):** Provides a default value when the left-hand expression is null.

> ⚠️ Excessive use of `!!` is a code smell. Prefer `?.` or `?:` when possible.

## 💡 Use Cases
- `?.` for optional chaining (e.g., `user?.name?.length`)
- `!!` only when you're 100% sure (e.g., after proper null checks)
- `?:` for fallback/default values (e.g., `userName ?: "Guest"`)

## 💻 Example

```kotlin
val name: String? = null

val length1 = name?.length         // null
val length2 = name?.length ?: 0    // 0
val length3 = name!!.length        // 💥 crash

```

## Output

length1: null  
length2: 0  
length3: Exception (if run)
