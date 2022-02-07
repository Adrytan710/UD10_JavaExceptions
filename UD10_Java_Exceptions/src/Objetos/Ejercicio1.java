package Objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adri�n Rodriguez
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int numRandom = (int) (Math.random() * 500);
	    int num = 0;
	    int intentos = 0;

	    do {
	    	boolean correcto;
	    	do {
	        	System.out.println("Introduzca un numero entre 1 y 500)");
	        	try {
	            	intentos++;
	                num = sc.nextInt();
	                System.out.println("El n�mero introducido es: " + num);
	                correcto = true;
	            } catch (InputMismatchException ex) {
	            	System.out.println("Has introducido un n�mero err�neo");
	                sc.next(); 
	                correcto = false;
	            }
	        } while (correcto == false);

	        if (num > numRandom) {
	        	System.out.println("El n�mero es menor. Prueba otra vez.");
	        }
	        
	        if (num < numRandom) {
	            System.out.println("El n�mero es mayor. Prueba otra vez.");
	        }

	    } while (num != numRandom);

		System.out.println("Has acertado. El n�mero es: " + numRandom);
	    System.out.println("El n�mero de intentos que has hecho es: " + intentos);
	}
}
