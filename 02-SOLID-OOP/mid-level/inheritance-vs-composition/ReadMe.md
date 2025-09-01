# 🧩 Inheritance vs Composition

---

## 🔍 Inheritance

Inheritance allows a class to inherit functionality from a parent class.  
It supports **code reuse** through a hierarchical relationship.

### ✅ When to use:

- There's a strong **"is-a"** relationship.
- You want to extend or override base class behavior.
- Example: `AppCompatActivity` extends `Activity`.

---

## 🔧 Composition

Composition allows a class to **include other objects** and use their functionality.  
It promotes **modularity** and **loose coupling**.

### ✅ When to use:

- You want more flexibility and testability.
- You’re combining multiple responsibilities or behaviors.
- Example: A `ViewModel` with injected `UseCase` classes.

---

## ⚖️ In Android Development

Use **inheritance** sparingly. Overusing it can create tight, fragile class hierarchies.  
Prefer **composition** when building scalable and testable components (e.g., in Clean Architecture).

---

## 💬 Summary

| Feature        | Inheritance              | Composition              |
|----------------|---------------------------|---------------------------|
| Relationship   | is-a                      | has-a                     |
| Coupling       | Tighter                   | Looser                    |
| Flexibility    | Less flexible             | More flexible             |
| Android Example| Activity → AppCompatActivity | ViewModel + UseCases  |
