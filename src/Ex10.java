import javax.swing.JOptionPane;
public class Ex10 {

	public static void main(String[] args) {
	
				//switch = statement that allows a variable to be tested for equality against a list of values
				
				String day = JOptionPane.showInputDialog("Enter a day Sunday\n Monday \n Tuesday \n wednesday \n Friday \n Saturday");
				
				switch (day) {
					case "Sunday": System.out.println("It is Sunday");
					break;
					case "Monday": System.out.print("It is a Monday \n");
					break;
					case "Tuesday": System.out.println("It is Tuesday ");
					break;
					case "Wednesday": System.out.println("It is Wednesday");
					break;
					case "Friday": System.out.println("It is Friday");
					break;
					case "Saturday": System.out.println("It is Saturday");
					break;
					default: System.out.println(" That is not a day");
					
					
				}
				
			

		
	}

}
