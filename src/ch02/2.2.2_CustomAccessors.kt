package ch02.ex2_2_CustomAccessors

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
    val isNotSquare: Boolean
        get() {
            return height != width
        }
}

fun main(args: Array<String>) {
    val height = 41
    val width = 42


    val rectangle = Rectangle(height, width)
    println("Is it square: " + rectangle.isSquare)
    println("Is it NOT square: " + rectangle.isNotSquare)
}
