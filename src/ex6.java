
public class ex6 {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); //Mostra o valor maior
		
		//System.out.println(z);
		
		z = Math.min(x, y);  //Joga o menor valor em z
		System.out.println(z);
		
		z = Math.abs(y);
		System.out.println(z);
	
		int a = 10;
		z = Math.sqrt(a);
		System.out.println(z);
		
		z = Math.round(x);
		System.out.println(z);
		
		z = Math.ceil(x);
		System.out.println(z);
		
		z = Math.floor(x);
		System.out.println("Floor is "+z);
		
	}

}
