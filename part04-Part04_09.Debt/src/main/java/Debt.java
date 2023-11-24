public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBance, double initialInterestRate) {
        this.balance = initialBance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * interestRate;
    }
}
