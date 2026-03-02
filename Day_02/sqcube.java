package mca;

public class sqcube {
	
	
	static void squarecube() {
		
		int square=0;
		int cube=0;
		for(int num=1;num<=5;num++) {
			square=num*num;
			cube=num*num*num;
	System.out.printf("%4d|%6d|%6d%n",num,square,cube);		
	
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Srno | square | cube ");
		System.out.println("-------------------------");
		squarecube();
	}
	
	
}
