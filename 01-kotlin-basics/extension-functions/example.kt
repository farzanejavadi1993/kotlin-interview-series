class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paddingInDp = 16
        val paddingInPx = dpToPx(paddingInDp)

        findViewById<View>(R.id.someView).setPadding(paddingInPx, paddingInPx, paddingInPx, paddingInPx)
    }
    
    // Converts dp value to px based on screen density
   fun Context.dpToPx(dp: Int): Int {
    return (dp * resources.displayMetrics.density).toInt()
   }

}
