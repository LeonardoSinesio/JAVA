import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		

		double x,y,z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter a side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt(x*x+y*y);
		System.out.println("The result of hypotenuse is: "+z);
		
		scanner.close();

	}

}
