```markdown
# 🔒 Type Bounds in Kotlin

Type bounds restrict what types can be used with generics.

### Syntax:
```kotlin
fun <T : SomeType> myFunction(param: T) { ... }
```

### Example:
```kotlin
fun <T : Number> doubleValue(value: T): Double {
    return value.toDouble() * 2
}
```

### Benefits:
- Enforces type constraints at compile time
- Prevents misuse of generic APIs

---

🔗 **Related**
- Generic Functions
- Generic Classes
```
