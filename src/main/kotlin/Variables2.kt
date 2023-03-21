fun main(args: Array<String>) {
    var x:Int
    val y:Int

    x = 20
    x = 30
    println(x)
    y = 40
    println(y)


    // calculating a simple interest of a loan borrowed
    var principle = 10000
    var time = 5
    var rate = 2.5
    var interest = (principle * rate * time) / 100.0
    println("Your interest is $interest")

    // calculating the volume of a cylinder
    var radius = 7
    var height = 14
    var pie  = 3.142
    var volume = (pie * radius*radius * height)
    println("volume of the cylinder  is $volume")
}