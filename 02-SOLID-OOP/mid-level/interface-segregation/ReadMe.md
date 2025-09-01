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
```
A class like SwipeGestureDetector may only need onSwipe(), but is forced to implement all the other methods — even if they do nothing.

## Good Practice

```kotlin
interface OnClickListener {
    fun onClick()
}

interface OnSwipeListener {
    fun onSwipe()
}

class SwipeGestureDetector : OnSwipeListener {
    override fun onSwipe() {
        // Do swipe logic
    }
}

```
## ✅ Benefits

Cleaner and more maintainable code

Easier testing

Higher cohesion in interfaces

Avoids empty method implementations

## 🔁 Summary

Split large interfaces into role-specific components.
In Android, this is especially useful for View callbacks, adapter listeners, and UI interaction handlers.
