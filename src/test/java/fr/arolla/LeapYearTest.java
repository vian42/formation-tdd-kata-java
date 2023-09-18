package fr.arolla;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LeapYearTest {

    @Test
    void the_year_2023_is_not_a_leap_year() {
        Integer year = 2023;

        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isFalse();
    }

    @Test
    void the_year_2024_is_a_leap_year() {
        Integer year = 2024;

        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isTrue();
    }
    @Test
    void the_year_2028_is_a_leap_year() {
        Integer year = 2028;

        Boolean isLeap = YearUtil.isLeap(year);

        assertThat(isLeap).isTrue();
    }


}
