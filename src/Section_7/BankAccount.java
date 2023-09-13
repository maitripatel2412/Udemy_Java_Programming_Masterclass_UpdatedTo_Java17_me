package Section_7;

public class BankAccount {

    private long accountNumber;
    private long accountBalance;
    private String name;
    private String email;
    private long mobileNumber;

    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("deposit of $"+depositAmount+" made. new balance is $"+accountBalance);
    }

    public void withdrawFunds(double withdrawAmount){
        if(accountBalance - withdrawAmount == 0){
            System.out.println("insufficient funds!, you only have $"+accountBalance+" in your account");
        }else {
            accountBalance -= withdrawAmount;
            System.out.println("withdrawal of amount $"+withdrawAmount+" processed. remaining balance is $"+accountBalance);
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public BankAccount(int accountNumber,int accountBalance,String name,String email,long mobileNumber){
        System.out.println("account constructor with parameter called ");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    public BankAccount() {
        this(8765637,90000,"maitri","email.com",98765432);
        System.out.println("helloooo");
    }
}
