class MainActivity : AppCompatActivity() {

    // SharedPreferences are only loaded when first accessed
    private val preferences by lazy {
        getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // This will trigger lazy initialization
        val isDarkModeEnabled = preferences.getBoolean("dark_mode", false)
        Toast.makeText(this, "Dark mode: $isDarkModeEnabled", Toast.LENGTH_SHORT).show()
    }
}
