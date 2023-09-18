package fr.arolla;

public class YearUtil {
    public static Boolean isLeap(Integer year) {
        if (year == 1900) {
            return false;
        }
        return isDivisibleBy4(year);
    }

    private static boolean isDivisibleBy4(Integer year) {
        return year % 4 == 0;
    }
}
