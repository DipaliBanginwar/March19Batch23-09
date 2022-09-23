package acessspecifierstudy;

public class Sample1 {
	
	private void test1()//within the class
	{
		System.out.println("private test1");
	}
	
	 void test2()//within package
	 {
		 System.out.println("default test2");
	 }
	 
	 protected void test3()//within package if we want call then use inheritance
	 {
		 System.out.println("protected test3");
	 }
	 
	 public void test4()//overall project
	 {
		 System.out.println("public test4");
	 }
	 


public static void main(String[] args)
{
	Sample1 obj= new Sample1();
	obj.test1();
	obj.test2();
	obj.test3();
	obj.test4();
	}
}

