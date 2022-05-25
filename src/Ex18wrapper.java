
public class Ex18wrapper {

	public static void main(String[] args) {
		// wrapper class = provides a way to use primitive data types as reference data types
		//					reference data types contain useful methods
		//					can be used with collections (ex.ArrayList)
		
		//primitive			//wrapper
		//¯¯¯¯¯¯¯¯¯			//¯¯¯¯¯¯¯
		//boolean			Boolean
		//char				Character
		//int				Integer
		//double			Double
		
		//autoboxing = the automatic conversion that the Java compiler makes between the primitive types and thei corresponding
		//object wrapper classes
		//unboxing = the reverse os autoboxing. Automatic conversion of wrapper class to primitive
		
		Boolean a = true;
		Character b = '@';
		char be = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Leo";
		
		//c.floatValue();
		if(a==true) {
			System.out.println("this is → "+ a);
		}

	}

}
