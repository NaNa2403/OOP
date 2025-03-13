package lab4.HW3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtility {
    public static int[] centuryValues = {6,4,2,0};
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", ""};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] daysInMonthsInLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] monthValuesNonLeap = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] monthValuesLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


    // Method to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDaysInMonth = 0;
        if (isLeapYear(year)) {
            maxDaysInMonth =  daysInMonthsInLeapYear[month - 1];
        }
        else {maxDaysInMonth = daysInMonths[month - 1];}

        return day >= 1 && day <= maxDaysInMonth;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int century = year / 100;
        int centuryValue = centuryValues[century % 4];

        int lastTwoDigits = year % 100;
        int total = centuryValue + lastTwoDigits;

        total += lastTwoDigits / 4;

        int monthValue = 0;
        if (isLeapYear(year)) {
            monthValue = monthValuesLeap[month-1];
        }
        else {monthValue = monthValuesNonLeap[month-1];}

        total += monthValue;
        total += day;
        return total % 7;
    }

    public static String printDate(int year, int month, int day){
        String result = String.format("%s %d %s %d",
                daysOfWeek[getDayOfWeek(year, month, day)],
                day,
                strMonths[month - 1],
                year);
        return result;
    }
    public static void testCalendar(int year, int month, int day){
        Calendar cal = new GregorianCalendar(year, month-1, day);

        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("It is " + daysOfWeek[dayNumber-1]);;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012,2,29));
        System.out.println(isValidDate(2011,2,29));
        System.out.println(isValidDate(2099,12,31));
        System.out.println(isValidDate(2099,12,32));

        System.out.println(getDayOfWeek(1982,4,24));
        System.out.println(getDayOfWeek(2000,1,1));
        System.out.println(getDayOfWeek(2054,6,19));
        System.out.println(getDayOfWeek(2012,2,17));

        testCalendar(2012,2,14);

        System.out.println(printDate(2012,2,14));


    }
}
