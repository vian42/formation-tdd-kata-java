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
}
