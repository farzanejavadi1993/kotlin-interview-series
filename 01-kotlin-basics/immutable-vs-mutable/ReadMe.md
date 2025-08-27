```markdown
# 📚 Immutable vs Mutable Collections

### Immutable:
```kotlin
val items = listOf("A", "B", "C")
```

You can't modify them (no add, remove, etc.)

### Mutable:
```kotlin
val items = mutableListOf("A", "B", "C")
items.add("D")
```

You can read and modify.

---

✅ Why it matters:
- Immutable collections reduce bugs and improve code safety
- Mutable ones are flexible but can introduce unexpected changes

---

🔗 **Related**
- Common Operations
- Functional Programming
```
