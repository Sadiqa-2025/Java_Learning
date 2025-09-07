public class LeapYears {
/*
Program to find and print the leap year for  the range 1990 to 2025
 */

        public static boolean isLeapYear(int year) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }

        public static void main(String[] args) {
            int startYear = 1990;
            int endYear = 2025;

            System.out.println("Leap years between " + startYear + " and " + endYear + ":");

            for (int year = startYear; year <= endYear; year++) {
                if (isLeapYear(year)) {
                    System.out.println(year);
                }
            }
        }

}
