package com.ebrain.demo;
import java.util.Scanner;
public class BankAccount {
	private String accountname;
	private float currentaccount;
	private static  float account;
	private int deposit;
	private int withdraw;
	private String message;
	private static float nowamount;
	private String ready;
	
	public float getNowamount() {
		return nowamount;
	}
	public void setNowamount(float nowamount) {
		this.nowamount = nowamount;
	}

	public String getReady() {
		return ready;
	}

	public void setReady(String ready) {
		this.ready = ready;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public float getCurrentaccount() {
		return currentaccount;
	}

	public void setCurrentaccount(float currentaccount) {
		this.currentaccount = currentaccount;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public float getAccount() {
		return account;
	}

	public void setAccount(float account) {
		this.account = account;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] agrs) {
		Scanner Bankaccount = new Scanner(System.in);
		System.out.println("Enter the Account Name");
		String accountname = Bankaccount.nextLine();
		System.out.println("Enter The Current Account");
		float amount = Bankaccount.nextFloat();
		System.out.println("Enter The Deposit Amount");
		int deposit = Bankaccount.nextInt();
		System.out.println("Enter The Withdraw Amount");
		int withdraw = Bankaccount.nextInt();
		BankAccount acc = new BankAccount();
		
		acc.setAccountname(accountname);
		acc.setCurrentaccount(amount);
		acc.setDeposit(deposit);
		acc.setAccount(amount + deposit);
		acc.setWithdraw(withdraw);
		acc.setNowamount(account - withdraw);

		System.out.println(acc.getAccountname() + "," + acc.getCurrentaccount() + "," + acc.getDeposit() + ","
				+ acc.getAccount() + "," + acc.getWithdraw() + " ," + acc.getNowamount());

		System.out.println("Enter the withdraw amount");
		int cash = Bankaccount.nextInt();
		if (cash > nowamount) {
			acc.setMessage("Insufficiant message");
			System.out.println(acc.getMessage());
		
		} else {
			acc.setReady("Amount is ready");
			System.out.println(acc.getReady());
		
		}

	}
}


