class MainActivity : AppCompatActivity() {

    // val: immutable value, initialized once and never changes
    private val appName: String = "MyInterviewApp"

    // var: mutable value that can change over time (e.g., button click count)
    private var clickCount: Int = 0

    // lateinit: tells the compiler we will initialize this later (non-null reference)
    private lateinit var userToken: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the lateinit property before using it
        userToken = fetchUserToken()

        // Using val and lateinit variables
        Log.d("AppInfo", "App Name: $appName")
        Log.d("AppInfo", "Token: $userToken")

        // Increment clickCount on button click
        findViewById<Button>(R.id.btnClick).setOnClickListener {
            clickCount++
            Toast.makeText(this, "Clicked $clickCount times", Toast.LENGTH_SHORT).show()
        }
    }

    private fun fetchUserToken(): String {
        // Simulate fetching user token (e.g., from SharedPreferences or API)
        return "abc123token"
    }
}
