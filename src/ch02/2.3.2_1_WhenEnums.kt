package ch02.ex3_2_1_WhenEnums

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET, WHITE
}

/**
 * 用 when 來當成 Java 的 switch 用。
 */
fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
            Color.WHITE -> "Troy"
        }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getMnemonic(Color.WHITE))
    val lifeTypeFood = getLifeType(LifeType.FOOD)
    println("Life type of food = $lifeTypeFood") //將字串結果用 $ 帶進來
}

/**
 * 生活需求類型
 */
enum class LifeType {
    FOOD, CLOTHES, LIVE, MOVE
}

/**
 * 代換
 */
fun getLifeType(type: LifeType) =
        when (type) {
            LifeType.FOOD -> "meal"
            LifeType.CLOTHES -> "jacket"
            LifeType.LIVE -> "house"
            LifeType.MOVE -> "car"

        }