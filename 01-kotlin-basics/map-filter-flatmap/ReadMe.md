```markdown
# 🔁 Collection Operations: map, filter, flatMap

Kotlin supports rich collection APIs:

### map:
```kotlin
val result = list.map { it + 1 }
```

### filter:
```kotlin
val even = list.filter { it % 2 == 0 }
```

### flatMap:
```kotlin
val nested = listOf(listOf(1, 2), listOf(3, 4))
val flat = nested.flatMap { it }
```

---

🔗 **Related**
- Functional Programming
- Collection Types
```
