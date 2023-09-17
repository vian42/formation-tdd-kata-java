package fr.arolla

import org.assertj.core.api.Assertions.`as`
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class FractionTest {

    @Test
    internal fun `the fraction have one num and one dem`() {
        val frac = Fraction(1,1)
        assertThat(frac.num).isEqualTo(1)
        assertThat(frac.dem).isEqualTo(1)
    }

    @Test
    internal fun `the sum of  two fraction is a fraction`() {
        val firstFraction = Fraction(1,1)
        val secondFraction = Fraction(1,1)
        val result = firstFraction.sum(secondFraction)
        assertThat(result::class).isEqualTo(Fraction::class)
    }

    @Test
    internal fun `the sum of 1 plus 1 return 2`() {
        val one = Fraction(1,1)
        val two = one.sum(one)
        assertThat(two).isEqualTo(Fraction(2,1))
    }
}