package com.onesoft.polymorphism_overLoading;

public class UseBank {
	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.findEligiblityLoanAmt(20000,900000));
	}

}

class Bank {
	public String findEligiblityLoanAmt() {
		return "LoanAmt is= "+(30000);
	}
	public String findEligiblityLoanAmt(int salary) {
		return "LoanAmt is= "+(30000+(salary*10));
	}
	public String findEligiblityLoanAmt(int salary,int propertyVal) {
		return "LoanAmt is= "+(30000+(salary*10)+(propertyVal*50/100));
	}
}
