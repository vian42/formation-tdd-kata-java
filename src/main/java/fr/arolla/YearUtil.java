package fr.arolla;

public class YearUtil {
    public static Boolean isLeap(Integer year) {
        return isDivisibleBy4(year)
                && (!isDivisibleBy100(year) || isDivisibleBy400(year));
    }

    private static boolean isDivisibleBy400(Integer year) {
        return year % 400 == 0;
    }

    private static boolean isDivisibleBy100(Integer year) {
        return year % 100 == 0;
    }

    private static boolean isDivisibleBy4(Integer year) {
        return year % 4 == 0;
    }
}
