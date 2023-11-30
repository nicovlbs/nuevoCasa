import java.util.Scanner;

public class EjercicioPractico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*EJERCICIO 1
Realizar un programa que pregunte por el año de nacimiento del usuario. Según lo que nos
indique, mostrarle por consola a qué generación pertenece según este cuadro: */
		
		Scanner scanner = new Scanner (System.in);

		System.out.println("En qu ao naciste?");
		Integer ao = scanner.nextInt();
		
		if (ao <= 1900) {
			System.out.println("Eres de la generacin perdida");
		}
		else if ( ao <= 1927) {
			System.out.println("Grandiosa");
		}
		else if (ao <= 1946) {
			System.out.println("Silenciosa");
		}
		else if (ao <= 1965) {
			System.out.println("Baby boomers");
		}
		else if (ao <= 1981) {
			System.out.println("Generacin X");
		}
		else if (ao <= 1996) {
			System.out.println("Generacin Y");
		}
		else if (ao <= 2012) {
			System.out.println("Generacin Z");
		}
		else  {
			System.out.println("Generacin Alfa");
		}
		
		scanner.close();


	}

}
