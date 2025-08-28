### 💡 Question
How does `run` differ from `let`, and when would you prefer one over the other?

### ✅ Answer
Both `run` and `let` return the result of the block, but the main difference lies in how they access the object:

- `let` uses `it`
- `run` uses `this`

🟢 Use `let` when you want to operate on a nullable value (e.g. after a null-check).
🟢 Use `run` when you want to work with an object as a receiver, especially for initialization or combining multiple operations on the same object.

Both are great for reducing boilerplate code and improving readability.


