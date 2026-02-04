public class Account {

    private String firstName;
    private String lastName;
    private long accountNo;
    private float balance;
    private int pin;


    Account(String firstName, String lastName, long accountNo, float balance, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNo = accountNo;
        this.balance = balance;
        this.pin = pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}
