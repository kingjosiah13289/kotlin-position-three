fun main(args: Array<String>) {
    // while loops
        // While loop
    var counterone = 0
    while (counterone <= 5){
        println(counterone)
        counterone++
    }
      // Do While Loop
    var countertwo = 10
    do {
        println(countertwo)
        countertwo++
    }while (countertwo <= 15)

    // for loops
         // for in loop
        for (num in 20..25){
            println(num)
        }
    for (num in 50 downTo 45){
        println(num)
    }
        // for each loop
    var names = listOf("Josiah", "James", "Lorna", "Juma", "Victoria")
    names.forEach{
        println(it)
    }

    // repeat loop

    repeat(7){
        println("Hello world")
    }
}