interface OnClickListener {
    fun onClick()
}

interface OnSwipeListener {
    fun onSwipe()
}

class SwipeGestureDetector : OnSwipeListener {
    override fun onSwipe() {
        // Do swipe logic
    }
}
