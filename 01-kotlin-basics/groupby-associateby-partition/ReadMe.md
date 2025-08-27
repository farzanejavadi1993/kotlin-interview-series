```markdown
# 🧠 Advanced Collection Operations: associateBy, groupBy, partition

### associateBy:
Turns a list into a map:
```kotlin
val map = list.associateBy { it.id }
```

### groupBy:
Groups items by a key:
```kotlin
val grouped = list.groupBy { it.type }
```

### partition:
Splits list in two:
```kotlin
val (even, odd) = list.partition { it % 2 == 0 }
```

---

🔗 **Related**
- Collection Fundamentals
- Data Transformation
```
