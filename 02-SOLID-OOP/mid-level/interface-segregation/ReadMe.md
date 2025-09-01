# 🧩 Interface Segregation Principle (ISP)

---

## 📘 Definition

> A class should not be forced to implement interfaces it does not use.

This principle encourages creating **smaller, more focused interfaces** instead of large "god interfaces" with unrelated methods.

---

## 💡 Real-world Android Example

### ❌ Bad Practice

```kotlin
interface UserActionListener {
    fun onClick()
    fun onSwipe()
    fun onLongPress()
    fun onDoubleTap()
}
