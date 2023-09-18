package fr.arolla

import fr.arolla.YearUtilK.Companion.isLeap
import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LeapYearKTest {
    @ParameterizedTest
    @CsvSource("2024", "2028")
    fun the_year_divisible_by_4_are_leap(year: Int) {
        val isLeap = isLeap(year)
        Assertions.assertThat(isLeap).isTrue
    }

    @ParameterizedTest
    @CsvSource("2000", "1600")
    fun the_year_divisible_by_400_are_leap(year: Int) {
        val isLeap = isLeap(year)
        Assertions.assertThat(isLeap).isTrue
    }

    @ParameterizedTest
    @CsvSource("2021", "2023", "2029")
    fun the_year_not_divisible_by_4_are_not_leap(year: Int) {
        val isLeap = isLeap(year)
        Assertions.assertThat(isLeap).isFalse
    }

    @ParameterizedTest
    @CsvSource("1900", "2100", "1700")
    fun the_year_divisible_by_100_are_not_leap(year: Int) {
        val isLeap = isLeap(year)
        Assertions.assertThat(isLeap).isFalse
    }
}