package ClassesPartI.BankAccountChallenge;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        BankAccount bobsAccount = new BankAccount(12321, 100.00,
                "Bob", "bob@gmail.com", 324234);

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
        System.out.println(bobsAccount.getCustomerName());

        bankAccount.setCustomerName("Yasin");
        bankAccount.setAccountBalance(500d);
        bankAccount.setAccountNumber(345345);
        bankAccount.setEmail("yasinokat@gmail.com");
        bankAccount.setPhoneNumber(325423);

        bankAccount.depositFunds(300);
        bankAccount.withdrawFunds(800);
    }
}
