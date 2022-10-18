import java.util.Scanner;

import Loan.Loan;
import BusinessLoan.BusinessLoan;
import PersonalLoan.PersonalLoan;

class CreatesLoan {
	public static void main(String rgs[]){

		Scanner sc = new Scanner(System.in);
		int n=5;
		Loan[] list = new Loan[n];
		for(int i=0;i<n;i++){
			System.out.println("---------------------------------");
			System.out.println("Loan Type: Enter 1 for Personal or 2 for Business. Default will be personal");
			int type = sc.nextInt();
			System.out.println("Enter Amount: (>100000)");
			float amount = sc.nextFloat();
			System.out.println("Choose Term:  1 for short, 2 for medium & 3 for long");
			int term = sc.nextInt();
			String TERM;
			if(term == 3){TERM="longTerm";}
			else if(term == 2){TERM="mediumTerm";}
			else{TERM="shortTerm";}
			if(type == 2){
				Loan obj = new BusinessLoan(i, amount, TERM);
				list[i] = obj;
			}else{
				Loan obj = new PersonalLoan(i, amount, TERM);
				list[i] = obj;
			}
		}
		System.out.println("Created Objects Successfully");
		for(int i=0;i<n;i++){
			System.out.println(list[i].toString());
		}
	}
}