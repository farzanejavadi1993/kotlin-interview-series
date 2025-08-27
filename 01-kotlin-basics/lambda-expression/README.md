# 🧠 What is a Lambda Expression in Kotlin?

In Kotlin, a lambda is an anonymous function — a way to pass logic around like data.  
It helps reduce boilerplate and makes code more concise and expressive.

### ✅ Syntax
```kotlin
val lambdaName: (InputType) -> OutputType = { parameters -> body }
```
## 💻 Example
```kotlin
val sum = { a: Int, b: Int -> a + b }
println(sum(3, 5)) 

```
## 💻 Output
8

## Use Cases

List operations: map, filter, forEach

Click listeners in Android



## 🔗 Related

Higher-Order Functions

Function Types

Callbacks and async handlers
