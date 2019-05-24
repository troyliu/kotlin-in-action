//package ch01.ex1_ATasteOfKotlin // package 可以隨便命名
package ch01

data class Person(val name: String,
                  val age: Int? = null)

val persons = listOf(Person("Alice"),
        Person("Bob", age = 29),
        Person("Troy", 45))

fun main(args: Array<String>) {


    val oldest = persons.maxBy { it.age ?: 0 }
    val youngest = persons.minBy { it.age ?: 0 }
    val y = findYoung()
    println("The oldest is $oldest")
    println("The youngest person is $youngest") //這會取得物件，並且自動toString
    println("The youngest function is $y" ) // 這會取得方法物件， toString 出代稱
}

fun findOld() = {persons.maxBy { it.age ?: 0 }}

fun findYoung() = {persons.minBy { it.age ?: 0 }}

// The oldest is: Person(name=Bob, age=29)
