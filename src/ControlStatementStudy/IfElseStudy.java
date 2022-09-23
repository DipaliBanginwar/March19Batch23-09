package ControlStatementStudy;

public class IfElseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if marks greater than 75 ->distinction
		//elseif marks bet>75 & <=66-first class
		//elseif marks bet >66 & <=57-second class
		//elseif marks bet >57 & <=40-Pass
		//else ur fail
		
		int marks=41;
		if(marks>75)
		{
			System.out.println("You are distinction");
		
		}
		else if(marks<=75 & marks>=66) 
		{
			System.out.println("you r 1st class");
		}
		else if (marks<66 & marks>=57) 
		{
			System.out.println("you r 2nd class");
		}
		else if(marks<57 & marks>=40)
		{
			System.out.println("ur pass");
		}
		else
		{
		System.out.println("ur fail");	
		}
	}

}
