import java.util.Scanner;

public class EjercicioPractico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*EJERCICIO 2
		Completar el ejercicio 7 del tema anterior para mostrar si el usuario tiene o no sobrepeso
		siguiente esta guía: */
		
		Scanner scanner = new Scanner (System.in);

		System.out.println("Dime tu altura");
		Double altura = scanner.nextDouble();
		System.out.println("Dime tu peso");
		Double peso = scanner.nextDouble();
		
		Double imc = peso / (altura*altura);
		System.out.println("Tu ndice de masa corporal es " + imc);
		
		if (imc <= 18.5) {
			System.out.println("Est ms delgado de lo normal");
		}
		else if (imc <= 24.9) {
			System.out.println("Est normal");
		}
		else if (imc <= 29.9) {
			System.out.println("Peso superior al normal");
		}
		else {
			System.out.println("Obesidad");
		}
		
		
		scanner.close();



	}

}
