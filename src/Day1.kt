//fun main() {
//    //Deyisenler
//
//    val name = "Aqil" //deyismez tovsiye olunan
//    var age = 25 // deyisen
//    age = 26
//
//    val city: String = "Baki" // tip aciq yazila biler
//
//
////Null safety
//
//    var email: String? = null  //? isaresi: null ola biler
//
//    println(email?.length) // safe call: null-dirsa  null qaytarir cokmur
//    println(email?.length ?: 0) //elvis: null-dirsa 0
//    println(age)
//    println(city)
//
//    email?.let { println("Email: $it") }  // null deyilse icra olunur
//
//    //val len = email!!.length //null-dirsa cokur qacin
//    var score = 93
//    var day = 4
//    println(dayType(day))
//    println(describe(score))
//    greet("Aqil") //default deyer
//    greet(greeting = "Hello", name = "Aysel") //named argument
//    println(add(5, 3))
//}
//
//// When
//
//fun describe(score: Int): String = when {
//    score >= 90 -> "Ela"
//    score >= 70 -> "Yaxsi"
//    score >= 50 -> "Kafi"
//    else -> "Zeif"
//}
//
//fun dayType(day: Int) = when (day) {
//    1, 2, 3, 4, 5 -> "Is gunu"
//    6, 7 -> "Istirahet"
//    else -> "Yanlis Gun"
//}
//
//fun add(a: Int, b: Int): Int = a + b
//
//fun greet(name: String, greeting: String = "Salam") {
//    println("$greeting, $name!")
//}


//tapsiriq

fun main() {

    //1
    val text: String? = null
    println(text?.length ?: "Melumat Yoxdur")

    println(grade(83))

    println(isAdult(17))
    println(isAdult(null))
    println(isAdult(18))
    println(isAdult(19))


    println(average(5, 6, 7))

    val text2: String? = "Salam"
    println(text2?.length ?: "Melumat yoxdur")



}

//2
fun grade(score: Int): String = when {
    score >= 90 -> "A"
    score >= 80 -> "B"
    score >= 70 -> "C"
    score >= 60 -> "D"
    score >= 50 -> "E"
    else -> "Zeif"
}

//3
fun isAdult(age: Int?): Boolean = (age ?: 0) >= 18

//4
fun average(a: Int, b: Int, c: Int = 0): Double = (a + b + c).toDouble() / 3