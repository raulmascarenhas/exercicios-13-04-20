package JavaTech;

import java.util.Scanner;

public class exercicio3 {

	public static void variavel(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, adicionalnoturno,descontos, salarioLiquido, horaExtra;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digito o Salario bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digito o adicional noturno: ");
		adicionalnoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horaExtra = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalnoturno - descontos) + horaExtra *5;
		
		System.out.println ("Eis o vosso salario:  " + salarioLiquido);
		
		

}
}