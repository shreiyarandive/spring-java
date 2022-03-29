package com.spring.task4;

public abstract class BankAccount {
	private int accNum;
	private String accHolder;
	private double accBalanace;
	public BankAccount(int accNum, String accHolder, double accBalanace) {
		super();
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalanace = accBalanace;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getAccBalanace() {
		return accBalanace;
	}
	public void setAccBalanace(double accBalanace) {
		this.accBalanace = accBalanace;
	}
	@Override
	public String toString() {
		return "BankAccount [accNum=" + accNum + ", accHolder=" + accHolder + ", accBalanace=" + accBalanace + "]";
	}
	
	public void showBalance() {
		System.out.println("Balance is: " + this.accBalanace);
	}
	
	public abstract double withdraw(double amount);
	
	public abstract double deposit(double amount);

	
}
