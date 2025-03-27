package lab7.ex1_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] daysInMonthsInLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static final int[] monthValuesNonLeap = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static final int[] monthValuesLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static final int[] centuryValues = {6,4,2,0};

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

    public MyDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Year must be between 1 and 9999");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        int maxDaysInMonth = isLeapYear(year) ? daysInMonthsInLeapYear[month - 1] : daysInMonths[month - 1];
        if (day < 1 || day > maxDaysInMonth) {
            throw new IllegalArgumentException("Day is not valid for the given month and year");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Year must be between 1 and 9999");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDaysInMonth = isLeapYear(year) ? daysInMonthsInLeapYear[month - 1] : daysInMonths[month - 1];
        if (day < 1 || day > maxDaysInMonth) {
            throw new IllegalArgumentException("Day is not valid for the given month and year");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        String result = String.format("%s %d %s %d",
                daysOfWeek[getDayOfWeek(year, month, day)],
                day,
                strMonths[month - 1],
                year);
        return result;
    }

    public MyDate nextDay() {
        day++;

        if (day > (isLeapYear(year) ? daysInMonthsInLeapYear[month - 1] : daysInMonths[month - 1])) {
            day = 1;
            nextMonth();
        }

        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        int maxDaysInMonth = isLeapYear(year) ? daysInMonthsInLeapYear[month - 1] : daysInMonths[month - 1];
        if (day > maxDaysInMonth) {
            day = maxDaysInMonth;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (year > 9999) {
            throw new IllegalArgumentException("Year out of range");
        }
        int maxDaysInMonth = isLeapYear(year) ? daysInMonthsInLeapYear[month - 1] : daysInMonths[month - 1];
        if (day > maxDaysInMonth) {
            day = maxDaysInMonth;  // Adjust the day to the last valid day of the month
        }

        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();

            if (isLeapYear(year)) {
                day = daysInMonthsInLeapYear[month - 1];
            } else {
                day = daysInMonths[month - 1];
            }
        }

        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            previousYear();
        }
        int maxDaysInMonth = isLeapYear(year) ? daysInMonthsInLeapYear[month - 1] : daysInMonths[month - 1];
        if (day > maxDaysInMonth) {
            day = maxDaysInMonth;  // Adjust the day to the last valid day of the month
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (year < 1) {
            throw new IllegalArgumentException("Year out of range");
        }
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }

}
