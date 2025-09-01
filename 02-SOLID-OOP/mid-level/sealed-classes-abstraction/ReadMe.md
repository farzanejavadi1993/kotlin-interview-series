# ✅ Sealed Classes & Abstraction

### 🔍 What is a sealed class?

A sealed class in Kotlin lets you define a **closed type hierarchy**.  
All possible subclasses are known at compile time and must be declared in the same file.

---

### 🎯 Why is it useful?

Sealed classes help you model scenarios where an object can be one of several types — and you want the compiler to enforce exhaustive handling.

---

### ✅ How it improves abstraction:

- You can define a limited set of subclasses that represent all valid states of a concept.
- Makes your code **more expressive** and **safer**, especially in `when` expressions.
- Great for modeling `Result`, `UiState`, or `NavigationEvent`.

---

### 💡 Tip:
Sealed classes are especially useful in **MVI** or **State management** patterns in Android.

---

