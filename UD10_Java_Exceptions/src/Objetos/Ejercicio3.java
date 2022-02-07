package Objetos;
/**
 * @author Adrián Rodriguez
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        
    	try {
    		System.out.println("Generando número aleatorio...");
            int num = (int) (Math.random() * 1000);
            System.out.println("El número aleatorio generado es:" + num);
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