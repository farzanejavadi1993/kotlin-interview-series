# 🤔 Lambda vs Anonymous Function in Kotlin

Both lambdas and anonymous functions are function literals — functions without names.

### 🔍 Key Differences

| Feature           | Lambda                               | Anonymous Function                           |
|------------------|--------------------------------------|----------------------------------------------|
| Syntax           | Concise (`{ a, b -> a + b }`)         | Verbose (`fun(a: Int): Int { return a }`)    |
| Return behavior  | Can return from outer function        | Only returns from itself                     |
| Return type      | Usually inferred                     | Can be explicitly declared                   |

### ✅ Example

```kotlin
val double = { x: Int -> x * 2 }

val triple = fun(x: Int): Int {
    return x * 3
}
```
Lambdas are great for concise logic, while anonymous functions offer more control.

## 🔗 Related

Lambda Expressions
Higher-Order Functions
