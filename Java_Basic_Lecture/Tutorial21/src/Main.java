import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ٳ��� : 1, ������ : 2");
		int input = scanner.nextInt();
		Fruit fruit;
		if(input== 1) {
			fruit = new Banana();
			fruit.show();
		}
		else if(input == 2) {
			fruit = new Peach();
			fruit.show();
		}
		
//		Fruit fruit1 = new Peach();
//		fruit1.show();
//		
//		System.out.println("---------------------");
//		
//		Fruit fruit2 = new Banana();
//		fruit2.show();
	}

}
