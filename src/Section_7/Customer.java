package Section_7;

public class Customer {

    private String name;
    private String email;
    private double creditLimit;

    public Customer(){
        this("nobody","nobody@nowhere.com");
    }
    public Customer(String name, String email) {
        this(name,email,1000);
    }
    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
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

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
