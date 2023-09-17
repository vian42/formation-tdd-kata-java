package fr.arolla

data class Fraction(val num: Int, val dem: Int) {
    fun sum(fraction: Fraction): Fraction {
        if (this.dem == 1){
            return Fraction(this.num + fraction.dem, fraction.dem)
        }
        return Fraction(this.num + fraction.num, this.dem)
    }
}
