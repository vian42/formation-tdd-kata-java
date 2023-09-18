package fr.arolla;

public class YearUtil {
    public static Boolean isLeap(Integer year) {
        return isDivisibleBy4(year);
    }

    private static boolean isDivisibleBy4(Integer year) {
        return year % 4 == 0;
    }
}
