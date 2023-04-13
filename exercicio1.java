package JavaTech;


// exercicio para saber quanto vai ficar o salario com o abono
import java.util.Scanner;

public class exercicio1 {

	public static void variavel(String[] args) {
		float salarioInicial, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salario inicial: ");
		salarioInicial = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
	
		novosalario = salarioInicial + abono;
		
		System.out.printf ("\n Seu novo salario é:  %.2f" , novosalario);
		
			

	}

}
