package lab5.part2.ex5;

public class AccountTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Nam Anh",'m');

        System.out.println(customer1);
        System.out.println("name: " + customer1.getName());
        System.out.println("id: " + customer1.getId());
        System.out.println("gender: " + customer1.getGender());

        Account account1 = new Account(1, customer1, 1000.0);
        System.out.println(account1);
        System.out.println("id: " + account1.getId());
        System.out.println("customer: " + account1.getCustomer());
        System.out.println("balance: " + account1.getBalance());

        account1.setBalance(20000.0);
        System.out.println(account1);
        System.out.println("customer name: " + account1.getCustomerName());
        System.out.println("balance after deposit 1000: " + account1.deposit(1000.0));
        System.out.println("balance after withdraw 1000: " + account1.withdraw(1000.0));
    }
}
