package Part_III.Exercises;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 0) {
            return -1;
        }
        return switch (month) {
            case 1, 5, 3, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}
