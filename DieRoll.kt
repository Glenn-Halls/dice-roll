fun main () {
    val myFirstDie = Die(6)
    println("Your ${myFirstDie.numSides} sided die rolled a ${myFirstDie.roll()}!")

    val mySecondDie = Die(20)
    println("Your ${mySecondDie.numSides} sided die rolled a ${mySecondDie.roll()}!")

}

class Die(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
