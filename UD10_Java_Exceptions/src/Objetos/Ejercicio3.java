package Objetos;
/**
 * @author Adri�n Rodriguez
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        
    	try {
    		System.out.println("Generando n�mero aleatorio...");
            int num = (int) (Math.random() * 1000);
            System.out.println("El n�mero aleatorio generado es:" + num);
            if (num % 2 == 0) {
                throw new Exception("Es par");
            } else {
                throw new Exception("Es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}