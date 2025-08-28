### 💡 Question
What are `init` blocks in Kotlin and how are they used?

### ✅ Answer
An `init` block in Kotlin is a special initializer block that runs **as soon as the class is instantiated**, right after the primary constructor.

It’s mainly used to:

- Execute logic during initialization
- Validate constructor arguments
- Set up derived properties

Multiple `init` blocks are allowed, and they run in the order they appear.


