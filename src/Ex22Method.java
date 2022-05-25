
public class Ex22Method {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
		/*
		String name = "Leo";
		int age = 21;
		hello(name,age);
		
		//hello();
		//hello();
		 * 
		 */
		int x = 3;
		int y = 4;
		
		//int z = add(x,y);
		//System.out.println(z);
		System.out.println(add(x,y));
	}
	/*
	static void hello(String title, int old) {
		System.out.println("Hello "+title);
		System.out.println("You are "+old);
	}
	*/
	static int add(int x, int y) {
		//int z = x + y ;
		//return z;
		return x+ y;
		
	}
}
