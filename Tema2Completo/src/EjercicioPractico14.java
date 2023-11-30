import java.util.Scanner;

public class EjercicioPractico14 {

	public static void main(String[] args) {
		int num;
		int resultado;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduce un número para sacar su tabla de multiplicar:");
		num = read.nextInt();
		
		for (int contador = 0; contador<=10; contador++) {
			resultado = num*contador;
			System.out.println(num + " x " + contador + " = " + resultado);
		}
	}

}
