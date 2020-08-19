//	객체 지향 지법의 활용
//	간단한 게임 만들기
public class Main {

	public static void main(String[] args) {
		
		Hero[] heros = new Hero[3];
		
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");
		
		
		for(int i = 0; i < heros.length; i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) {
				Warrior temp = (Warrior) heros[i];
				temp.groundCutting();
			}
			else if(heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			}
			else {
				Wizard temp = (Wizard) heros[i];
				temp.freezing();
			}
		}
	}

}
