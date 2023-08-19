package ClassesPartI.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Ahmet", 30000, "ahmet@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getEmailAddress());
        System.out.println(customer.getCreditLimit());
    }
}
