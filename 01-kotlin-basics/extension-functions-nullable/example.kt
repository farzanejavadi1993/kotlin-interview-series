class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userMessage: String? = intent.getStringExtra("message")
        
        // Even if message is null or blank, it shows a safe fallback
        showSafeToast(userMessage)
    }
    
    fun Context.showSafeToast(message: String?) {
    val safeMessage = message?.takeIf { it.isNotBlank() } ?: "Something went wrong"
    Toast.makeText(this, safeMessage, Toast.LENGTH_SHORT).show()
    }

}
