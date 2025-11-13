package h3;

public class H3_main {
	public static void main(String[] args) {
		
		float ceslsiusFloat = 15.0f;
		float fahrenheitFloat;
		
		double clesiusDouble = 15.0;
		double fahrenheitDouble;
		
		fahrenheitFloat = celsiusFloat * 9f / 5f + 32f;
		
		fahrenheitDouble = celsiusDouble * 9.0 / 5.0 + 32.0;
		
		System.out.println("float. " + celsiusFloat + " °C" + fahrenheitFloat + " °F");
		System.out.println("double: " + celsiusDouble + " °C" + fahrenheitDouble + " °F");
	}

}
