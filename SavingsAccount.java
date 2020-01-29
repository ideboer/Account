public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(int a, double interest) {
        super(a);
        bal = 0.0;
        this.interest = interest / 100;
    }

    public void addInterest() {
        bal *= 1 + interest;
    }

    public String toString() {
        return super.toString() + " : interest = " + interest;
    }
}