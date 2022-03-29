package com.spring.task4;

public class SalaryAccount extends BankAccount {
	
	private static final int WITHDRAWAL_LIMIT = 100000;
	
	public SalaryAccount(int accNum, String accHolder, double accBalanace) {
		super(accNum, accHolder, accBalanace);
		
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
}
