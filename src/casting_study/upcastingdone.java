package casting_study;

public class upcastingdone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son S=new son();
		S.bike();
		S.car();
		S.ownmethod();
		
		father F=new son();
				F.bike();
		F.car();
		F.bike();
		

	}

}
