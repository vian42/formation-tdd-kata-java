package fr.arolla;

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
    @CsvSource({"2000","1600"})
    void the_year_divisible_by_400_are_leap(Integer year) {
        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isTrue();
    }
    @ParameterizedTest
    @CsvSource({"2021","2023","2029"})
    void the_year_not_divisible_by_4_are_not_leap(Integer year) {
        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isFalse();
    }
    @ParameterizedTest
    @CsvSource({"1900","2100","1700"})
    void the_year_divisible_by_100_are_not_leap(Integer year) {
        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isFalse();
    }
}
