public class PrintDayInWord {
    public static void main(String[] args) {
        int n = 3;

        if(n == 0){
            System.out.println("SUNDAY");
        }
        else if(n == 1){
            System.out.println("MONDAY");
        }
        else if(n == 2){
            System.out.println("TUESDAY");
        }
        else if (n == 3){
            System.out.println("WEDNESDAY");
        }
        else if (n == 4) {
            System.out.println("THURSDAY");
        }
        else if (n == 5) {
            System.out.println("FRIDAY");
        }
        else if (n == 6) {
            System.out.println("SATURDAY");
        }
        else{
            System.out.println("NOT A VALID DAY");
        }
        //Using swtich case
        switch(n) {
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAT");
                break;
            default:
                System.out.println("NOT A VALID DAY");
                break;
        }
    }
}
