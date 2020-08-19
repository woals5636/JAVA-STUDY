// 인터페이스

public class Main implements Dog,Cat{	// 추상은 다중상속이 안되지만 인터페이스는 다중상속이 가능하다.

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();
		
	}

	@Override
	public void crying() {
		System.out.println("왈! 왈!");
	}

	@Override
	public void show() {
		System.out.println("Hello World");
	}

	@Override
	public void one() {
		System.out.println("야 옹");
	}

	@Override
	public void two() {
		System.out.println("Two");
	}

}
