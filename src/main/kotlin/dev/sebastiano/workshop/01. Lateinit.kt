package dev.sebastiano.workshop

internal class LateInit {

    private lateinit var _fruit: String

    var fruit: String?
        get() {
            return if (::_fruit.isInitialized) {
                _fruit
            } else {
                null
            }
        }
        set(value) {
            if (value == null) {
                throw IllegalArgumentException()
            }
            else {
                _fruit = value
            }
        }

    fun performSomeWork(): String = "Here's something for ya: $_fruit"
}
