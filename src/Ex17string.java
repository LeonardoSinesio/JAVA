
public class Ex17string {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more characters
		// 			reference data type have access to useful methods
		
		String name = "   Leo   ";
		
		//boolean result = name.equalsIgnoreCase("leo");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("e");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		String resultado = name.trim();
		String result = resultado.replace('o','a');
		
		//String result = name.replace('e', 'i');
		
		
		System.out.println(result);
	}

}
