# 📦 Generic Classes in Kotlin

A generic class provides a way to define classes that work with any type.

### Example:
```kotlin
class Box<T>(private val item: T) {
    fun getItem(): T = item
}
```

### Use cases:
- Wrapping or caching different types
- Creating custom containers or adapters
- Reusable utility classes

---

🔗 **Related**
- Generic Functions
- Type Bounds
