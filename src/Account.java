public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

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

    @Override
    public String toString() {
        System.out.println("Account{" +
                           "accountNumber=" + accountNumber +
                           ", accountBalance=" + accountBalance +
                           ", customerName='" + customerName + '\'' +
                           ", email='" + email + '\'' +
                           ", phoneNumber=" + phoneNumber +
                           '}');
        return "Account{" +
               "accountNumber=" + accountNumber +
               ", accountBalance=" + accountBalance +
               ", customerName='" + customerName + '\'' +
               ", email='" + email + '\'' +
               ", phoneNumber=" + phoneNumber +
               '}';
    }

    public Account(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(int depositAmount){
        this.accountBalance = this.accountBalance + depositAmount;
        return this.accountBalance;
    }

    public double withdrawFunds(int withdrawAmount){
        if((this.accountBalance - withdrawAmount)<0){
            System.out.println("Withdrawal not allowed! Account balance cannot be less than $0");
        return this.accountBalance;
    }else {
            this.accountBalance = this.accountBalance - withdrawAmount;
            return this.accountBalance;
        }

}
}