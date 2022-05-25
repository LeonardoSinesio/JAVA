
public class ex9 {

	public static void main(String[] args) {
		
		//if statement = performs a block of code if it's condition evaluates to be true
		
		int age = 3;
		
		if(age >= 18 & age < 75) {
			System.out.println("You are adult!");
		}
		else if(age >= 75) {
			System.out.println("ok bummer");
			
		}
		else if (age >= 13) {
			System.out.println("You are a teenager");
		}
		else if (age ==3) {
			System.out.println("You are a baby");
		}
		else {
			System.out.println("You are not an adult!");
		}

	}

}
