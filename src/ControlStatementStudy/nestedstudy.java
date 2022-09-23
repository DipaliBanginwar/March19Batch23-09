package ControlStatementStudy;

public class nestedstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. if userid=dipali then enter password
		      //2 if-pass=dipali123 then->login success
		    //2 else enter correct password
		//1 enter correct userid
		
		String uid="Dipali50";
		String pwd="dipali123";
		
		
		if(uid=="Dipali")
		{
			if(pwd=="dipali123")
			{
				System.out.println("login sucessful");
			}
			else
			{
				System.out.println("enter correct password");
			}
			
		}
		else
		{
			System.out.println("enter correct uid");
		}
	}

}
