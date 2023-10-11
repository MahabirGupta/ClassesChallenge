public class Main {
    public static void main(String[] args) {

        Account account = new Account(123456,1000,"Mahabir Gupta","mahabirno1@hotmail.com",96492491);
        account.toString();
        account.depositFunds(500);
        System.out.println("Account Balance =$ " + account.getAccountBalance());
        account.toString();

        account.withdrawFunds(800);
        System.out.println("Account Balance =$ " + account.getAccountBalance());
        account.toString();

//        System.out.println("Account Balance =$ " + account.getAccountBalance());
        account.withdrawFunds(900);
        System.out.println("Account Balance =$ " + account.getAccountBalance());

        account.withdrawFunds(700);
        System.out.println("Account Balance =$ " + account.getAccountBalance());

    }
}