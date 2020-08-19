
public class Person {

		private String name;
		private int age;
		private int height;
		private int weight;
		
		// 마우스 우클릭 -> source -> Generate Getters and Setters	한번에 만드는 메소드 생성
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		
		// 마우스 우클릭 -> source -> Generate Constructor using Fields    생성자 만들기	
		public Person(String name, int age, int height, int weight) {
			super();
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}

		
}
