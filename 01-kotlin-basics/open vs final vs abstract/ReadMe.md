### 💡 Question
What is the difference between `open`, `final`, and `abstract` in Kotlin?

### ✅ Answer
These keywords define how a class or member behaves in terms of inheritance:

- `open` allows a class or method to be extended or overridden.
- `final` (default in Kotlin) prevents a class or method from being extended or overridden.
- `abstract` is used in abstract classes — it forces subclasses to implement the method or property.

🟢 `open` is used when you **intentionally** want a method to be overridden.
🔴 `final` is the default — it adds safety by preventing unwanted inheritance.
🟣 `abstract` is used in base classes when some methods shouldn’t have an implementation.


