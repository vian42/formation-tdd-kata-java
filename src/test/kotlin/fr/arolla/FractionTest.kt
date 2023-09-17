package fr.arolla

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FractionTest {

    private val one = Fraction(1, 1)

    @Test
    internal fun `the fraction have one num and one dem`() {
        assertThat(one.num).isEqualTo(1)
        assertThat(one.dem).isEqualTo(1)
    }

    @Test
    internal fun `the sum of  two fraction is a fraction`() {
        val result = one.sum(one)
        assertThat(result::class).isEqualTo(Fraction::class)
    }

    @Test
    internal fun `the sum of 1 plus 1 return 2`() {
        val two = one.sum(one)
        assertThat(two).isEqualTo(Fraction(2, 1))
    }

    @Test
    internal fun `can add a real fraction to 1`() {
        val fraction = Fraction(1, 4)
        val result = one.sum(fraction)
        assertThat(result).isEqualTo(Fraction(5, 4))
    }

    @Test
    internal fun `the sum is idempotent`() {
        val fraction = Fraction(1, 4)
        val firstResult = one.sum(fraction)
        val secondResult = fraction.sum(one)
        assertThat(firstResult).isEqualTo(secondResult)
    }

    @Test
    internal fun `when the 2 dem are equals we just add the num`() {
        val left = Fraction(3,5)
        val right = Fraction(4,5)
        val result = left.sum(right)
        assertThat(result).isEqualTo(Fraction(7,5))
    }

    @Test
    internal fun `sum with 2 different dem`() {
        val left = Fraction(3,5)
        val right = Fraction(4,7)
        val result = left.sum(right)
        assertThat(result).isEqualTo(Fraction(4*5+3*7,5*7))
    }

    @Test
    internal fun `reduce when doable`() {
        val fraction = Fraction(4,2)
        assertThat(fraction.getValue()).isEqualTo(Fraction(2,1))
    }
}