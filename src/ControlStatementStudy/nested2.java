package ControlStatementStudy;

public class nested2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1if atm pin =1234 then enter amount
		//2. if amount=2000 then -withdrawnal sucess
		//2. else enter correct amount
  //1. enter correct pin
		
		int pin=1234;
		int amt=2000;
		
		if(pin==1234)
		{
			if(amt==2000)
			{
				System.out.println("withdrawl sucessful");
			}
			else
			{
				System.out.println("enter correct amount");
			}
		}
		else
		{
			System.out.println("enter correct pin");
		}
	}

}
