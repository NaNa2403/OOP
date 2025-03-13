package lab5.ex2_4;

public class TestInvoice {
    public static void main(String[] args) {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer1);

        customer1.setDiscount(8);
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("discount is: " + customer1.getDiscount());

        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        System.out.println(invoice1);

        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("id is: " + invoice1.getId());
        System.out.println("customer name is: " + invoice1.getCustomer());

        System.out.println("Amount is: " + invoice1.getAmount());
        System.out.println("Customer id is: " + invoice1.getCustomerId());
        System.out.println("Customer name is: " + invoice1.getCustomerName());
        System.out.println("Customer discount is " + invoice1.getCustomerDiscount());

        System.out.printf("amount after discount is %.2f%n", invoice1.getAmountAfterDiscount());
    }

}
