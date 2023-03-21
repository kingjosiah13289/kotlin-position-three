package OOP

fun main(args: Array<String>) {
    // Inheritance And Polymorphism
    var studentone = Student("Jared", "jared@gmail.com", "12345678")
    var studenttwo = Student("Ephraim", "ephraim@gmail.com", "12345qwer")
    println(studentone.name)
    studenttwo.register()

    var teacherone = Teacher("Jopen", "jopen@gmail.com", "12345678")
    var teachertwo = Teacher("Kdeey", "keddy@gmail.com", "12345qwer")
    println(teacherone.name)
    teachertwo.register()
    teacherone.suspendstudent()

    var headteacherone = Headteacher("Ken", "ken@gmail.com", "ken2345678")
    var headteachertwo = Headteacher("Kogy", "kogy@gmail.com", "12dfg5qwer")
    println(headteacherone.name)
    headteacherone.register()
    headteacherone.login()
    headteacherone.suspendstudent()
    headteacherone.approvecash()
}
open class Student(open var name:String, open var email:String, open var password:String){

    fun register(){
        println("You have registered with email $email and password $password")
    }
    fun login(){
        println("You have logged in with email $email and password $password")
    }
}
open class Teacher(name:String, email:String, password:String):Student(name, email, password){
    fun suspendstudent(){
        println("Yeah, I can suspend a student")
    }
}
class Headteacher(name:String, email:String, password:String):Teacher(name, email, password){
    fun approvecash(){
        println("Yeah, I can approve cash")
    }
}