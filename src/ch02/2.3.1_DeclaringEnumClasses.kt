package ch02.ex3_1_DeclaringEnumClasses

enum class Color(
        val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    BLACK(0,0,0),
    WHITE(255,255,255),
    VIOLET(238, 130, 238); //唯一會用到分號的地方 !!!

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.ORANGE.rgb())
}
