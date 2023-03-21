fun main(args: Array<String>) {
    var names = arrayListOf("Karren", "Tapiwa", "Ephraim", "Abdul", "Michelle")
    println(names[3])
    names.add("King")

    // Use for in loop
    for(i  in 0 until  (names.size - 1)){
        println(names[i])
    }
    // For each loop
    names.forEach {
        println(it)
    }
}