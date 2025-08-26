// Represents a user fetched from an API
data class UserResponse(
    val id: Int,
    val name: String,
    val email: String,
    val isActive: Boolean
)

// Usage in a ViewModel or Repository
fun handleUserResponse(user: UserResponse) {
    if (user.isActive) {
        Log.d("UserStatus", "${user.name} is active")
    } else {
        Log.d("UserStatus", "${user.name} is inactive")
    }

    val updatedUser = user.copy(isActive = true)
    Log.d("UserUpdate", "Updated user: $updatedUser")
}
