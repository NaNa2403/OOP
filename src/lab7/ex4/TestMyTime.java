package lab7.ex4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        System.out.println(myTime1);

        MyTime myTime2 = new MyTime(23,35,57);
        System.out.println(myTime2);

        myTime2.setHour(19);
        myTime2.setMinute(5);
        myTime2.setSecond(15);
        System.out.println(myTime2);

        myTime2.setTime(12,36,32);
        System.out.println(myTime2);

        // myTime2.setMinute(80); Illegal Argument

        myTime2.nextSecond();
        System.out.println(myTime2);

        myTime2.setSecond(59);
        System.out.println(myTime2);

        myTime2.setTime(23,59,59);
        System.out.println(myTime2);
        myTime2.nextSecond();
        System.out.println(myTime2);

        myTime2.previousSecond();
        System.out.println(myTime2);
    }
}
