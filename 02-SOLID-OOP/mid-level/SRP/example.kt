// BEFORE: One class doing everything (not SRP-compliant)

class UserManager {
    fun fetchUserFromApi() {
        // fetch from network
    }

    fun saveUserToLocalDb() {
        // save to Room
    }

    fun updateUserUI() {
        // update UI
    }
}

// AFTER: SRP-compliant refactor

class UserRepository {
    fun fetchUser(): User {
        // fetch from API or local DB
        return User("Alice")
    }
}

class GetUserUseCase(private val repository: UserRepository) {
    fun execute(): User {
        return repository.fetchUser()
    }
}

class UserViewModel(private val getUserUseCase: GetUserUseCase) {
    fun loadUser() {
        val user = getUserUseCase.execute()
        println("Loaded user: ${user.name}")
    }
}

data class User(val name: String)
