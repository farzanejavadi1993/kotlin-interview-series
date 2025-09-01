```kotlin
// Bad example: one huge interface
interface UserActions {
    fun onClick()
    fun onSwipe()
    fun onZoom()
}

class PhotoViewer : UserActions {
    override fun onClick() = println("Clicked")
    override fun onSwipe() = println("Swiped")
    override fun onZoom() = println("Zoomed")
}

// Better: small, focused interfaces
interface Clickable {
    fun onClick()
}

interface Swipable {
    fun onSwipe()
}

interface Zoomable {
    fun onZoom()
}

class ImageViewer : Swipable, Zoomable {
    override fun onSwipe() = println("Swiped image")
    override fun onZoom()  = println("Zoomed image")
}
