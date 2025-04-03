package lab7.ex5;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(2012, 2, 28);
        System.out.println(myDate1);
        System.out.println(myDate1.nextDay());
        System.out.println(myDate1.nextDay());
        System.out.println(myDate1.nextMonth());
        System.out.println(myDate1.nextYear());

        MyDate myDate2 = new MyDate(2012, 1, 2);
        System.out.println(myDate2);
        System.out.println(myDate2.previousDay());
        System.out.println(myDate2.previousDay());
        System.out.println(myDate2.previousMonth());
        System.out.println(myDate2.previousYear());

        MyDate myDate3 = new MyDate(2012, 2, 29);
        System.out.println(myDate3.previousYear());

        MyDate myDate4 = new MyDate(2011, 12, 28);
        while (!(myDate4.getYear() == 2012 && myDate4.getMonth() == 3 && myDate4.getDay() == 2)) {
            System.out.println(myDate4);
            myDate4.nextDay();
        }
    }
}
