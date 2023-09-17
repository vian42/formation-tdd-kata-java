package fr.arolla

data class Fraction(val num: Int, val dem: Int) {
    fun sum(fraction: Fraction): Fraction {
        return Fraction(this.num + fraction.num, this.dem)
    }
}
