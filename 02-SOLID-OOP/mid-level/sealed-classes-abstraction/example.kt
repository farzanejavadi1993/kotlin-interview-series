// A common use of sealed classes: Modeling UI state

sealed class UiState

object Loading : UiState()
data class Success(val data: String) : UiState()
data class Error(val message: String) : UiState()

fun renderState(state: UiState) {
    when (state) {
        is Loading -> println("Loading...")
        is Success -> println("Data loaded: ${state.data}")
        is Error -> println("Error: ${state.message}")
        // No `else` needed! Compiler ensures all cases are covered.
    }
}
