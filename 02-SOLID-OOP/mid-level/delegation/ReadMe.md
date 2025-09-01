# 🤝 Delegation in Kotlin

---

## 🔍 What is Delegation?

**Delegation** is a design pattern where an object delegates responsibility to another object.

Instead of inheriting behavior, a class can reuse logic by **delegating** it — this promotes **composition over inheritance**.

---

## ⚙️ Kotlin Native Support

Kotlin makes delegation super easy using the `by` keyword.

We often use it to delegate interface implementations:

```kotlin
class AppLogger(logger: Logger) : Logger by logger
```
Here, AppLogger implements Logger and delegates its methods to logger.

🧑‍💻 Real-world Example

Let’s say we have multiple loggers — file, console, network.
Instead of rewriting log(), we just delegate:

interface Logger {
    fun log(message: String)
}

class FileLogger : Logger {
    override fun log(message: String) = println("Writing to file: $message")
}

class Service(private val logger: Logger) : Logger by logger
We can inject any logger we want, and the service just uses it without implementing log() itself.

✅ Benefits

Encourages clean design (composition)

Makes code modular and testable

Reduces boilerplate

⚠️ When Not to Use

If you need to override only some behavior (delegation applies all methods)

If inheritance is truly more expressive for your use case

🔁 Summary

Delegation is an elegant Kotlin-native feature that helps you share behavior between classes cleanly — and it's great for modular Android codebases.
