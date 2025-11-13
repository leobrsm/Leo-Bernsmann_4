package p1;

public class P1_main {
	public static void main(String[] args) {
		int Stockwerk =-1;
		
		switch(Stockwerk) {
		case 0:
			System.out.println("Angebote");
			break;
		case 1:
			System.out.println("Damenbekleidung");
			break;
		case 2: 
			System.out.println("Herrenbekleidung");
			break;
		case 3:
			System.out.println("Kinderbekleidung");
			break;
		case -1:
			System.out.println("Parkhaus");
			break;
		default:
			System.out.println("unbekannt");
		}
	}

}
