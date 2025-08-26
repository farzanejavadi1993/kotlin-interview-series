# What is the difference between `val`, `var`, and `lateinit`?

## ✅ Summary
In Kotlin:
- `val` is used for **read-only variables**.
- `var` is for **mutable variables**.
- `lateinit` is used when we **want to initialize a variable later**, especially in non-null reference types.

## 📘 Detailed Explanation

- **`val`**: Immutable. Once assigned, its value can't change. Similar to `final` in Java.
- **`var`**: Mutable. Can be reassigned multiple times.
- **`lateinit`**: A modifier for `var` properties of non-null reference types.  
  Useful when you don’t want to use nullable types, but can’t initialize the variable immediately.

> ⚠️ `lateinit` cannot be used with primitive types or `val`.  
> Accessing a `lateinit` variable before initialization causes a runtime exception.

## 💡 Use Cases
- `val` for fixed config (e.g. `val baseUrl = "..."`)
- `var` for things like counters or toggles
- `lateinit` for injected ViewModels, bindings, etc.

## 💻 Example

```kotlin
val appName = "MyApp"     // can't reassign
var clickCount = 0        // can reassign

lateinit var userToken: String
fun setupToken() {
    userToken = "abc123"
}
