package ClassesPartI.BankAccountChallenge;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(2432, 2.50,
                "Default name", "Default email", 32432);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
        // this.customerName = customerName;
        // this.email = email;
        // this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        accountBalance += amount;
        System.out.println(amount + " has been deposited to your account.");
        System.out.println("You balance is: " + accountBalance);
    }

    public void withdrawFunds(double amount) {
        if (amount > accountBalance) {
            System.out.println("Not enough balance");
        } else {
            accountBalance -= amount;
            System.out.println(amount + " has been withdrawn from your account.");
        }
        System.out.println("You balance is: " + accountBalance);
    }
}
