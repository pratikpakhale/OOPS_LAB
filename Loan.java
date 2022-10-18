package Loan;

import LoanConstants.LoanConstants;

public abstract class Loan implements LoanConstants{
	int loanNumber;
	float amount;
	float interestRate;
	String term;

	float dueAmount;

	public Loan(int id, float amt, float iR, String t){
		if(amt > 100000){ 
			System.out.println("Amount exceeded 1 lakh."); 
			return;	
		}
		amount = amt; 
		loanNumber = id; 
		interestRate = iR; 
		if(t == "shortTerm" || t == "mediumTerm" || t== "longTerm"){
			term = t;
		}else{
			term = "shortTerm";
		}
		int years = 1;
		if(term == "shortTerm"){years=1;}
if(term == "mediumTerm"){years=3;}
if(term == "longTerm"){years=5;}

		dueAmount = amount * (1 + ((interestRate * years)/100));
	} 

	public String toString(){ 
		return "Loan Number: "+loanNumber+" Amount: "+amount+" Interest Rate: "+interestRate+" Term: "+term+" Due Amount: "+dueAmount ;  
	}

}