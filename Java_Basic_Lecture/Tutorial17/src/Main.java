import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Teacher teacher1 = new Teacher("ȫ�浿", 20, 175,70,"20170101", 500, 10);
//		Teacher teacher2 = new Teacher("�̼���", 30, 180,75,"20181215", 300, 5);
//		teacher1.show();
//		teacher2.show();
//		
//		// �迭�� �̿�
//		Student[] students = new Student[100];
//		for(int i = 0; i < 100; i++) {
//			students[i] = new Student("ȫ�浿", 20, 175, 70, i + "", 1, 4.5);
//			students[i].show();
//		}
		
		
		// Scanner �̿�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� ���� �մϱ�? : ");
		int N = scan.nextInt();
		Student[] students = new Student[N];
		
		for(int a = 0; a < N; a++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID = scan.next();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = scan.nextDouble();
			students[a] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		
		for(int a = 0; a < N; a++) {
			students[a].show();
		}
	}

}
