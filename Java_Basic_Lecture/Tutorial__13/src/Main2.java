import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		int[]array = new int[100];
		
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);	//	Math.random --> 0 ~ 0.xxx 무작위로 나온다. 그래서 100을 곱하면 양의 정수로 사용가능하다.
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
	}

}
