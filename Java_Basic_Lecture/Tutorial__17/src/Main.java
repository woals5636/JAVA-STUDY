import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Teacher teacher1 = new Teacher("홍길동", 20, 175,70,"20170101", 500, 10);
//		Teacher teacher2 = new Teacher("이순신", 30, 180,75,"20181215", 300, 5);
//		teacher1.show();
//		teacher2.show();
//		
//		// 배열을 이용
//		Student[] students = new Student[100];
//		for(int i = 0; i < 100; i++) {
//			students[i] = new Student("홍길동", 20, 175, 70, i + "", 1, 4.5);
//			students[i].show();
//		}
		
		
		// Scanner 이용
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재 합니까? : ");
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
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			students[a] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		
		for(int a = 0; a < N; a++) {
			students[a].show();
		}
	}

}
