//	object Ŭ����

public class Main {

	public static void main(String[] args) {

		Archer archer1 = new Archer("�ü�1", "��");
		Archer archer2 = new Archer("�ü�1", "��");
		System.out.println(archer1 == archer2);		// �ν��Ͻ��� �ٸ��� ������ false�� ���´�
		System.out.println(archer1.equals(archer2));
	}

}
