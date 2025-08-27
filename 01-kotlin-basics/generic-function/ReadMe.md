# 🔧 Generic Functions in Kotlin

A generic function works with different data types without being rewritten for each type.

### Example:
```kotlin
fun <T> firstElement(list: List<T>): T {
    return list[0]
}
```
### Benefits:
- Code reusability
- Type safety
- Cleaner abstraction

---

🔗 **Related**
- Generic Classes
- Type Bounds
```
