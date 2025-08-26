# What is lazy initialization in Kotlin and how is it implemented?

## ✅ Summary
Kotlin's `lazy` delegate lets you delay the initialization of a variable until it's actually needed.  
It's especially useful when the initialization is heavy or might not be required during every run.

## 📘 Detailed Explanation

- `val myValue by lazy { ... }` is the basic syntax.
- The lambda inside `lazy {}` only runs **once**, at the time of first access.
- `lazy` ensures **thread safety** by default.
- It's ideal for loading configuration, resources, or doing computations that are needed **later**, not at startup.

> ⚠️ Only works with `val`, not `var`.

## 💡 Use Cases
- Loading data from disk or database when accessed for the first time
- Initializing expensive or optional objects (e.g., bitmap, preferences)
- Avoiding unnecessary work during startup

## 💻 Example

```kotlin
val config by lazy {
    println("Loading config…")
    "dark_theme_enabled=true"
}

fun main() {
    println("App started")
    println(config)
}

## Output

App started  
Loading config…  
dark_theme_enabled=true
