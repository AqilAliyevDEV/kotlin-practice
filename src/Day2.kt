class Person(val name: String, var age: Int) {
    fun introduce(){
        println("Men $name, $age yasim var")
    }
}

data class User(val id: Int, val name: String)

val u1 = User(1, "Aqil")
val u2 = User(1, "Aqil")

val u3 = u1.copy(name = "Corc")



fun main() {
    val p = Person("Aqil", 20)
    p.introduce()
    p.age = 26
    println(p.age)

    println(u1)
    println(u1 == u2)
    println(u3)

    Logger.log("Salam")

    println(Product.TAX)
    val gift = Product.free("Hediyye")

    shapes.forEach {it.describe()}

    val book = Book("Kotlin", "JetBrains")
    book.borrow() //Goturuldu
    book.borrow() //Artiq goturulub
    println(book.isAvailable) // false


    println(s1 == s2)
    println(s3)

    AppConfig.printInfo()
    println(AppConfig.appName)

    val e = Employee.create("Aqil")
    println("${e.name}, ${e.salary}")
    animals.forEach {it.describe()}
}


//Object singleton

object Logger{
    fun log(msg: String) = println("Log: $msg")
}

//Companion object

class Product(val name: String, val price: Double) {
    companion object {
        const val TAX = 0.18
        fun free(name: String) = Product(name, 0.0)
    }
}

//Interface

interface Shape{
    fun area(): Double
    fun describe() = println("Sahe: ${area()}") //default implementasiya
}

class Rectangle(val w: Double, val h: Double): Shape{
    override fun area() = w * h
}

class Circle(val r: Double): Shape {
    override fun area() = Math.PI * r * r
}

class Square(val a: Double): Shape {
    override fun area() = a * a
}

val shapes: List<Shape> = listOf(Rectangle(3.0, 5.0), Circle(2.0), Square(6.0))



//Exercise

//1

class Book(val title: String, val author: String, var isAvailable: Boolean = true){
    fun borrow(){
        if (isAvailable){
            isAvailable = false
            println("Goturuldu")
        }else {
            println("Artiq goturulub")
        }
    }
}


//2

data class Student(val name: String, val grade: Int)

val s1 = Student("Aqil", 11)
val s2 = Student("Aqil", 11)
val s3 = s1.copy(name = "Qafar")


//3

object AppConfig {
    val appName = "MyApp"

    fun printInfo(){
        println("My app is $appName")
    }
}


//4

class Employee(val name: String, val salary: Int = 0){
    companion object {
        fun create(name: String): Employee = Employee(name)
    }
}


//5

interface Animal{
    fun sound(): String
    fun describe() = println(sound())
}

class Dog(): Animal{
    override fun sound() = "Hav-hav"
}

class Cat(): Animal {
    override fun sound() = "Myauv"
}

val animals:  List<Animal> = listOf(Dog(), Cat())












