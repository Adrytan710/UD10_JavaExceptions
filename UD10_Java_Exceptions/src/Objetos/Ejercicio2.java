package Objetos;
/**
 * @author Adri�n Rodriguez
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		try {
	    	System.out.println("Mensaje mostrado por pantalla");
	        Exception e = new Exception("Esto es un objeto Exception");
	        throw e;
	    } catch (Exception ex) {
	        System.out.println("Excepcion capturada con mensaje: " + ex.getMessage());
	    }
	        System.out.println("Programa terminado");
	    }
}