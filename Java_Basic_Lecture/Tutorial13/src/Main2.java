import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		int[]array = new int[100];
		
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);	//	Math.random --> 0 ~ 0.xxx �������� ���´�. �׷��� 100�� ���ϸ� ���� ������ ��밡���ϴ�.
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		
		System.out.println("100���� ���� ������ ��� ���� " + sum / 100 + "�Դϴ�.");
	}

}
