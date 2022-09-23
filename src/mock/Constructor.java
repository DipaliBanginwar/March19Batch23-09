package mock;


public class Constructor {

	int a=100;
	int b=40;
	public Constructor() 
	{
		System.out.println("This is Constructor");
	}
	
	public Constructor(int x) 
	{
		a=x;
		System.out.println("single parameterize constructor");
		
	}
	
	public Constructor(int x,int y) 
	{
		a=x;
		b=y;
		int c=a+b;
		System.out.println("this is 2 parameterize constructor "+ c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c1 =new Constructor();
		c1.test();
		Constructor c2= new Constructor(190);
		c2.test();
		Constructor c3= new Constructor(50, 70);
		c3.test();
		

	}
public void test()
{
	//int a=10;
	//int b=20;
	int sum=(a+b);
	System.out.println("addition is "+sum);
	}
}
