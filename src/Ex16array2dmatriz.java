import java.util.Random;

public class Ex16array2dmatriz {

	public static void main(String[] args) {
		// 2D array = an array of array MATRIX
		
		Random random = new Random();
		
		int x =0 ; // = random.nextInt(2);
		int y =0 ; // = random.nextInt(3);
		
		String[][] cars = new String[3][3];
		String[][] colors =  {	
								{"Blue","Red","green"},
								{"white","black","Silver"}
							};
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvet";
		cars[0][2] = "Tesla";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ferrari";
		cars[1][2] = "Porsh";
		cars[2][0] = "Lambo";
		cars[2][1] = "Challenger";
		cars[2][2] = "Bugati";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars.length; j++) {
				System.out.print(cars[i][j]+" ");
				System.out.print(colors[x][y]+"  ");
				 x = random.nextInt(2);
				 y = random.nextInt(3);
			}
		}

	}

}
