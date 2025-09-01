# ✅ Open/Closed Principle – Real-World Android Example

### 🔍 What is it?

The Open/Closed Principle states that software entities (like classes, modules, functions) should be **open for extension** but **closed for modification**.  
This means you should be able to add new functionality without changing existing code — reducing the risk of breaking things.

---

### 💡 In Android Development

Here’s how I often apply this principle:

- **BaseActivity/BaseViewModel Pattern**  
  I define shared logic in a `BaseActivity` class and then extend it in specific screens. I don’t touch the base logic anymore — just add behavior in the child class.

- **Using Sealed Classes**  
  For managing UI states or network responses, sealed classes help me extend logic (by adding new types) without changing the logic that handles them.

---

### ✅ Benefits

- Makes your code easier to maintain and scale.
- Reduces bugs when adding features.
- Encourages modular and testable design.

---


