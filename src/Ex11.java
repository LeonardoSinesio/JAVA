import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
		// && = (AND) both conditions must be true
		// || = (OR) either condition must be true
		// !  = (NOT) reverses boolean value of condition	

	/*int temp = 10;
	if(temp >30) {
		System.out.println("It is hot outside");
	}
	else if(temp >= 20 && temp <= 30) {
		System.out.println("It is warm outside");
	}
	else {
		System.out.println("It is cold outside");
	}
	*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		/*if(response.equals("q") || response.equals("Q")) {
			System.out.println("You are quit the game");
		}
		else {
			System.out.println("You are still paying the game *pew pew*");
		}*/
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still paying the game *pew pew*");
		}
		else {
			System.out.println("You are quit the game");
		}
	}

}
