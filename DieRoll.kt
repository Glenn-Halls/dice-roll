fun main () {
    val myFirstDie = Die()
    val dieRoll = myFirstDie.roll()
    println("Your ${myFirstDie.sides} sided die rolled a ${dieRoll}")
}

class Die {
    var sides = 6
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }
}
