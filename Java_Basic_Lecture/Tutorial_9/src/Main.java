
public class Main {

	public static int function(int a, int b, int c) {
		int MAX = a;
		
		if(b > c) {
			if(b > MAX) {
				MAX = b;
			}
		}
		else {
			if(c > MAX) {
				MAX = c;
			}
		}
		
		return MAX;
	}
	
	public static void main(String[] args) {
		
		System.out.println(function(7,5,1));
		
	}

}
