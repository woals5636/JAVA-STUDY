
public class Main2 {

	public static char function(String input) {
		return input.charAt(input.length() - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("HELLO WORLD의 마지막 문자는 " + function("HELLO WORLD"));
	}

}
