package h1;

public class H2_main {
	public static void main(String[] args) {
		int zone = 3;
		double price = 0.0;
		
		switch (zone) {
		case 0:
			System.out.print("Preis = unbekannt");
		case 1:
			price = 2.00;
			break;
		case 2:
			price = 2.35;
			break;
		case 3:
		case 4:
			price = 2.85;
			break;
		case 5: 
			price = 3.55;
			break;
		default:
			price = 4.00;
			break;
		}
		
		System.out.print("Zone(n): " + zone);
		System.out.print("Preis: " + price);
		
		
	}

}
