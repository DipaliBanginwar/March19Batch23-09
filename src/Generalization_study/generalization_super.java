package Generalization_study;

public class generalization_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
jio J=new jio();
System.out.println("=======jio===========");
J.call();
J.data();
J.msg();
J.newmethod_jio();

System.out.println("=====Airtel=======");
Airtel A=new Airtel();
A.call();
A.data();
A.msg();
A.newmethod_airtel();

System.out.println("=======Vi==========");

Vi V=new Vi();
V.call();
V.data();
V.newmethod_Vi();
V.msg();
	}

}
