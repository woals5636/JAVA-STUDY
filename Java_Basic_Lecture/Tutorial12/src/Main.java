import java.util.Scanner;

public class Main {

	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		
		if(number == 1) {
			return one;
		}
		else if(number == 2) {
			return two;
		}
//		else {
//			for(int i = 2; i < number; i++) {
//				result = one + two;
//				one = two;
//				two = result;
//			}
//		}
//		return result;
		else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		int i = number.nextInt();
		
		int res = fibonacci(i);
		
		System.out.println(res);
		
		
	}

}
