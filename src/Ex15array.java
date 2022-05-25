
public class Ex15array {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		/*String[] cars = {"Camaro","Corvet","Tesla","BMW"};
		
		//cars[0] = "Mustang";
		System.out.println(cars[0]);
		System.out.println(cars[3]);*/
		
		String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvet";
		cars[2] = "tesla";
		
		for(int i =0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
