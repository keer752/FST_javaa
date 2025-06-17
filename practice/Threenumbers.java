package practise;

public class Threenumbers {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 10;
		
		if(x==y && y==z) {
			System.out.println("All are equal");
		}
		else if(x==y || x==z || y==z) {
			System.out.println("two are equal");
		}
		else {
			System.out.println("All are not equal");
		}
		
	}

}
