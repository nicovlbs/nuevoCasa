import java.util.Scanner;

public class EjercicioPractico7 {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		numero1 = read.nextInt();
		
		System.out.println("Introduce el segundo número:");
		numero2 = read.nextInt();
		
		while(numero1!=numero2) {
			System.out.println("Introduce el primer número:");
			numero1 = read.nextInt();
			
			System.out.println("Introduce el segundo número:");
			numero2 = read.nextInt();
		}
		
		System.out.println("Hola, bienvenido");
	}
}
