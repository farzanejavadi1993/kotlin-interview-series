# 🔧 Refactoring a Large Class That Violates SRP

## Question  
**How would you refactor a large class that violates the Single Responsibility Principle?**

## Answer  
When a class tries to do too much — like handling UI logic, business rules, and data persistence — it becomes difficult to maintain, test, or extend.

To refactor:
- **Identify the different responsibilities** the class is managing.
- **Split them into separate classes**: one for each concern (e.g. ViewModel, Repository, UseCase).
- Follow Clean Architecture or MVVM to guide the structure.

This makes the codebase more modular, testable, and easier to understand.

---

✅ **Real-world scenario**  
Imagine a `UserManager` class that:
- fetches user data from API
- caches it in Room
- updates the UI

This should be broken into:
- `UserRepository`: data handling
- `UserUseCase`: business logic
- `UserViewModel`: UI state

---

🔗 Related  
- Single Responsibility Principle  
- Clean Architecture  
- Separation of Concerns  
