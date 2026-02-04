public class lab1 {
    public void payIn(Account acc, float amount) {
        acc.setBalance(acc.getBalance() + amount);
        System.out.println("Deposited: " + amount);
    }
    public void changePin(Account acc, int pin) {
        acc.setPin(pin);
        System.out.println("PIN CHANGED: " + pin);
    }

    public void withdraw(Account acc, float amount) {
        if (amount > acc.getBalance()) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            acc.setBalance(acc.getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void displayBalance(Account acc) {
        System.out.println("Current Balance: " + acc.getBalance());
    }

    public void displayDetails(Account acc) {
        System.out.println("\n***** ACCOUNT DETAILS *****");
        System.out.println("Name: " + acc.fullName());
        System.out.println("Account No: " + acc.getAccountNo());
        System.out.println("Balance: " + acc.getBalance());
    }

    public static void main(String[] args) {

        lab1 atm = new lab1();

        Account myAcc = new Account("John", "Emmanuel", 9724639201L, 0, 9999);

        atm.payIn(myAcc, 5000);

        atm.payIn(myAcc, 500);

        atm.changePin(myAcc,1111);

        atm.displayBalance(myAcc);

        atm.withdraw(myAcc, 6000);

        atm.withdraw(myAcc, 2000);

        atm.displayBalance(myAcc);

        atm.displayDetails(myAcc);
    }
}
