### 💡 Question
What is the difference between let, run, also, apply, and with in Kotlin?

### ✅ Answer
These are Kotlin’s scope functions — each provides a way to operate on objects within a limited scope, but with slight differences in how `this` and `it` behave.

- `let`: Executes a block and returns its result. Inside the block, the object is referenced as `it`. Useful for null checks and chaining.
- `run`: Similar to `let`, but the object is referenced as `this`. Often used to combine object configuration and result computation.
- `also`: Like `let`, but returns the original object instead of the block result. Typically used for logging or side effects.
- `apply`: Works like `also`, but uses `this` inside the block. Ideal for configuring objects.
- `with`: Not an extension function. Takes an object and runs a block with `this` as context.

Each one has its use-case — it's about **how you reference the object**, and **what you want to return**.



