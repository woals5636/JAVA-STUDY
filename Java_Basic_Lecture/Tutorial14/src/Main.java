
public class Main {

	public static void main(String[] args) {

		int N = 50;
		
		int [][] array = new int[N][N];
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < N; j++) {
				array[i][j] = (int)(Math.random() * 100);
				System.out.printf("%3d" , array[i][j]);		// %3d --> 3자리수 이하 정렬
			}
			System.out.println();
		}
	}

}
