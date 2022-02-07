package Objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adrián Rodriguez
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
	                System.out.println("El número introducido es: " + num);
	                correcto = true;
	            } catch (InputMismatchException ex) {
	            	System.out.println("Has introducido un número erróneo");
	                sc.next(); 
	                correcto = false;
	            }
	        } while (correcto == false);

	        if (num > numRandom) {
	        	System.out.println("El número es menor. Prueba otra vez.");
	        }
	        
	        if (num < numRandom) {
	            System.out.println("El número es mayor. Prueba otra vez.");
	        }

	    } while (num != numRandom);

		System.out.println("Has acertado. El número es: " + numRandom);
	    System.out.println("El número de intentos que has hecho es: " + intentos);
	}
}
