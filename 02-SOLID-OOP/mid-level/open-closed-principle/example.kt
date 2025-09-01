// Example of Open/Closed Principle using sealed class

sealed class UiState

data class Success(val data: String) : UiState()
data class Error(val message: String) : UiState()
object Loading : UiState()

fun render(state: UiState) {
    when (state) {
        is Success -> println("Success: ${state.data}")
        is Error -> println("Error: ${state.message}")
        Loading -> println("Loading...")
    }
}
