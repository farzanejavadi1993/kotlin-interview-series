### 💡 Question
What is an anonymous object in Kotlin?

### ✅ Answer
An **anonymous object** is an unnamed object expression created using the `object` keyword — often used for:

- One-time object implementations
- Anonymous classes or interfaces
- Temporary data holders or callbacks

Anonymous objects are common in UI listeners or when overriding methods on-the-fly.

### 💡 Question
What is a singleton object in Kotlin?

### ✅ Answer
A **singleton object** is declared using the `object` keyword. It ensures only one instance exists and it's lazily initialized at first access.

- Ideal for global managers like `Logger`, `Settings`, `Config`, etc.
- No need to create instances — you just use it directly.

Kotlin guarantees thread-safe initialization of singleton objects.
