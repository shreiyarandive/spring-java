package com.spring.task4;

public class SavingsAccount extends BankAccount{

	private static final int WITHDRAWAL_LIMIT = 30000;
	private static final int DEPOSIT_LIMIT = 1000000;
	
	public SavingsAccount(int accNum, String accHolder, double accBalanace) {
		super(accNum, accHolder, accBalanace);
		
	}

	@Override
	public double withdraw(double amount) {
		if(amount > WITHDRAWAL_LIMIT) {
			System.out.println("Withdrawal limit exceeded");
		}else {
			this.setAccBalanace(this.getAccBalanace() - amount);			
		}
		return this.getAccBalanace();
	}

	@Override
	public double deposit(double amount) {
		if(amount > DEPOSIT_LIMIT) {
			System.out.println("Deposit limit exceeded");
		}else {
			this.setAccBalanace(this.getAccBalanace() + amount);
		}
		return this.getAccBalanace();
	}

}
