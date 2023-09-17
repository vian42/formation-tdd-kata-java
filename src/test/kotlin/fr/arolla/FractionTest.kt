package fr.arolla

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class FractionTest {

    @Test
    internal fun `the fraction have one num and one dem`() {
        val frac = Fraction(1,1)
        assertThat(frac.num).isEqualTo(1)
        assertThat(frac.dem).isEqualTo(1)
    }
}