package fr.arolla

class YearUtilK {
    companion object {
        fun isLeap(year: Int): Boolean {
            return (year.isDivisibleBy(4)
                    && (!year.isDivisibleBy(100) || year.isDivisibleBy(400)))
        }

        private fun Int.isDivisibleBy(divisor: Int): Boolean {
            return this % divisor == 0
        }

    }
}
