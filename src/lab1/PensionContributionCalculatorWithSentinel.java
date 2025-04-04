import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_To_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end) ");
        int salary = sc.nextInt();

        while (salary != -1){

            System.out.print("Enter the age: ");
            int age = sc.nextInt();

            int contributableSalary;
            double employeeContribution;
            double employerContribution;
            double totalContribution;

            contributableSalary = 6000;

            if (age <= 55){
                employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * salary;
                employerContribution = EMPLOYER_RATE_55_AND_BELOW * salary;
            } else if (age <= 60) {
                employeeContribution = EMPLOYEE_RATE_55_TO_60 * salary;
                employerContribution = EMPLOYER_RATE_55_TO_60 * salary;
            } else if (age <= 65) {
                employeeContribution = EMPLOYEE_RATE_60_TO_65 * salary;
                employerContribution = EMPLOYER_RATE_60_To_65 * salary;
            }
            else{
                employeeContribution = EMPLOYEE_RATE_65_ABOVE * salary;
                employerContribution = EMPLOYER_RATE_65_ABOVE * salary;
            }
            if (employeeContribution >= contributableSalary) employeeContribution = contributableSalary;
            if (employerContribution >= contributableSalary) employerContribution = contributableSalary;

            totalContribution = employeeContribution + employerContribution;

            System.out.printf("The employee contribution is %.2f%n", employeeContribution);
            System.out.printf("The employer contribution is %.2f%n", employerContribution);
            System.out.printf("The total contribution is %.2f%n", totalContribution);

            System.out.print("Enter the monthly salary (or -1 to end) ");
            salary = sc.nextInt();
        }
        System.out.println("Bye!");
    }
}
