### 💡 Question
What’s the difference between primary and secondary constructors in Kotlin?

### ✅ Answer
Kotlin classes can have:

- **Primary constructor** — declared in the class header and used for basic initialization.
- **Secondary constructor(s)** — declared inside the class body using the `constructor` keyword, useful when you need multiple ways to create an object.

Primary constructors are concise and recommended when possible.  
Secondary constructors give more flexibility but are rarely needed if you use default arguments and factory patterns.
