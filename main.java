package JavaTech;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4, difer;
		
		Scanner leia = new Scanner (System.in);
		System.out.println ("digite o n1 e n2: ");
		n1 = leia.nextFloat();
		n2 = leia.nextFloat();
		
		System.out.println ("digite n3 e n4:  ");
		n3 =leia.nextFloat();
		n4 =leia.nextFloat();
		
		difer = (n1*n2) - (n3*n4);
		System.out.println ("diferença: " + difer); 
			
	}

}
