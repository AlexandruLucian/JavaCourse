package day3;

public class Savings extends Account {

	private double interestRate;
	
	public Savings(double balance) {
		super(balance);
	}
	public double getInterestrate() {
		return interestRate;
	}
	public void setInterestrate(double interestRate) {
		this.interestRate = interestRate;
	}

}
