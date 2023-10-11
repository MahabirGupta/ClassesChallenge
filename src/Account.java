public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

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

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    @Override
    public String toString() {
        System.out.println("Account{" +
                           "accountNumber=" + accountNumber +
                           ", accountBalance=" + accountBalance +
                           ", customerName='" + customerName + '\'' +
                           ", customerEmail='" + customerEmail + '\'' +
                           ", customerPhoneNumber=" + customerPhoneNumber +
                           '}');
        return "Account{" +
               "accountNumber=" + accountNumber +
               ", accountBalance=" + accountBalance +
               ", customerName='" + customerName + '\'' +
               ", customerEmail='" + customerEmail + '\'' +
               ", customerPhoneNumber=" + customerPhoneNumber +
               '}';
    }

    public Account(int accountNumber, double accountBalance, String customerName, String customerEmail, int customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double depositFunds(int depositAmount){
        this.accountBalance = this.accountBalance + depositAmount;
        System.out.println("Deposit amount $" + depositAmount + ". New balance is $" + this.accountBalance);
        return this.accountBalance;
    }

    public double withdrawFunds(int withdrawAmount){
        if((this.accountBalance - withdrawAmount)<0){
            System.out.println("Withdrawal amount of $" + withdrawAmount + " not allowed! Account balance cannot be less than $0");
        return this.accountBalance;
    }else {
            this.accountBalance = this.accountBalance - withdrawAmount;
            System.out.println("Withdrawal amount $" + withdrawAmount + ". New balance is $" + this.accountBalance);
            return this.accountBalance;
        }

}
}