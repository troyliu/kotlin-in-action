package ch02.ex1_2_Functions

// 上面因為沒有按照宣告 package 來放，所以會有警示，但不是不行，只是建議要按照宣告的檔案結構來放

fun max(a: Int, b: Int): Int {
    // 表示式：除了回圈以外的原Java判斷式，都是表示式。
    return if (a > b) a else b
}

fun main(args: Array<String>) {

    println(max(1, 2))

    println(min(6, 4))

    val a = 12.34
    val b = 23.45
//    println("which one is bigger: " + d_max(12.34, 23.45))

    println("which one is bigger: " + d_max(a, b))
    println("Which one is bigger: " + if (d_max(a, b) == a) "A" else "B")

}


fun min(a: Int, b: Int): Int {

    return if (a > b) b else a

}

fun d_max(a: Double, b: Double): Double {
    return if (a > b) a else b
}


