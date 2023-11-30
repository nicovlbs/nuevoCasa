import java.util.Scanner;

public class EjercicioPractico8 {
	public static void main(String[] args) {
		String numero1;
		String numero2;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		numero1 = read.nextLine();
		numero1 = numero1.toLowerCase();
		numero1 = numero1.replace(" ", "");
		
		System.out.println("Introduce el segundo número:");
		numero2 = read.nextLine();
		numero2= numero2.toLowerCase(); 
		numero2 = numero2.replace(" ", "");
		
		while(!numero1.equals(numero2)) {
			System.out.println("Introduce el primer número:");
			numero1 = read.nextLine();
			numero1 = numero1.toLowerCase();
			numero1 = numero1.replace(" ", "");
			
			System.out.println("Introduce el segundo número:");
			numero2 = read.nextLine();
			numero2= numero2.toLowerCase();
			numero2 = numero2.replace(" ", "");
		}
		
		System.out.println("Hola, bienvenido");
	}

}
