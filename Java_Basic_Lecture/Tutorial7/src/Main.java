import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 정수를 입력하세요.");
		int i = sc.nextInt();	// 사용자가 입력한 정수 i를 넣겠다.
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close();
	}

}
