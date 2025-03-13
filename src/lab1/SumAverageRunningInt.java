package lab1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int SumOdd = 0;
        int SumEven = 0;
        int AbsDiff;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1 ){
                SumOdd += i;
            }
            else{
                SumEven += i;
            }
        }
        if (SumOdd > SumEven){
            AbsDiff = SumOdd - SumEven;
        }
        else{
            AbsDiff = SumEven - SumOdd;
        }

        AbsDiff = (SumOdd > SumEven) ? (SumOdd - SumEven): (SumEven - SumOdd);

        System.out.println("Sum Even is : " + SumEven);
        System.out.println("Sum Odd is : " + SumOdd);
        System.out.println("Diff is: " + AbsDiff);
    }
}
