package fr.arolla;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class LeapYearTest {

    @ParameterizedTest
    @CsvSource({"2024","2028"})
    void the_year_divisible_by_4_are_leap(Integer year) {
        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isTrue();
    }
    @ParameterizedTest
    @CsvSource({"2021","2023","2029"})
    void the_year_not_divisible_by_4_are_not_leap(Integer year) {
        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isFalse();
    }

    @Test
    void the_year_1900_is_not_a_leap_year() {
        Integer year = 1900;

        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isFalse();
    }
}
