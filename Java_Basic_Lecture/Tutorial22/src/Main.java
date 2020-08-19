//	object 클래스

public class Main {

	public static void main(String[] args) {

		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		System.out.println(archer1 == archer2);		// 인스턴스가 다르기 때문에 false로 나온다
		System.out.println(archer1.equals(archer2));
	}

}
