class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Nullable intent extra (e.g., username from another activity)
        val userName: String? = intent.getStringExtra("user_name")

        // Safe call operator (?.)
        Log.d("UserInfo", "Username length: ${userName?.length}")

        // Elvis operator (?:) — use fallback if null
        val displayName = userName ?: "Guest"
        Toast.makeText(this, "Hello, $displayName!", Toast.LENGTH_SHORT).show()

        // Non-null assertion (!!) — risky if not properly checked
        if (userName != null) {
            val upper = userName!!.uppercase()  // Not recommended — use safe calls instead
            Log.d("UserInfo", "Uppercase name: $upper")
        }
    }
}
