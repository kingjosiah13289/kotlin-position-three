package OOP

fun main(args: Array<String>) {
    var f1 = Fruits("mango", "yellow", "200g", 40.0)
    var f2 = Fruits("apple", "pink", "300g", 30.0)
    println(f1.name)
    println(f2.price)


    var c1 = Car("Toyota", "KDA 123E", 2000000.0)
    var c2 = Car("Mercedes", "KDD 123J", 5000000.0)
    c1.accelerate()
    c2.brake()
    println(c2.regno)
}
 class Fruits(name:String, color:String, size:String, price:Double){
     var name: String
     var color: String
     var size: String
     var price: Double

     // Initialize the properties
     init {
         this.name = name
         this.color = color
         this.size = size
         this.price = price
     }
 }
class Car(model:String, regno:String, price:Double) {
    var model: String
    var regno: String
    var price: Double

    init {
        this.model = model
        this.regno = regno
        this.price = price
        // these are functions
    }
    fun accelerate(){
            println("Yeah, I can accelerate")
    }
    fun brake(){
            println("I am a $model and I can brake")
        }
}