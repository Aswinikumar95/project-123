package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposite() {
		System.out.println("deposite is 7%");
		

	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposite();
		a.fixed();
		a.saving();
		
	}

	
}
