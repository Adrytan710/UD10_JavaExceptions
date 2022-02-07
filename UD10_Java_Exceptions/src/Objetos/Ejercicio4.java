package Objetos;

/**
 * @author Adrián Rodriguez
 */

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void suma() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
			result = num1 + num2;
			System.out.println("Resultado de la suma: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo números");
		}
	}

	public static void resta() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
			result = num1 - num2;
				System.out.println("Resultado de la resta: " + result);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Introduce solo números");
			}
		}

	public static void multiplicar() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
			result = num1 * num2;
			System.out.println("Resultado de la multiplicación: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void potencia() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para elevar el primer número"));
			result = (int) Math.pow(num1, num2);
			System.out.println("Resultado de la potencia: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void raizCuadrada() {
		int num1 = 0;
		int result = 0;
			
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
			result = (int) Math.sqrt(num1);
			System.out.println("Resultado de la raíz cuadrada: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void raizCubica() {
		int num1 = 0;
		int result = 0;
			
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
			result = (int) Math.cbrt(num1);
			System.out.println("Resultado de la raíz cubica: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
		
	public static void dividir() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
			result = num1 / num2;
			System.out.println("Resultado de la división: " + result);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
	
	public static void menu() {
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicación");
		System.out.println("4 - Potencia");
		System.out.println("5 - Raíz Cuadrada");
		System.out.println("6 - Raíz Cubica");
		System.out.println("7 - División");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción"));
		switch (opcion) {
		case 1:
			suma();
			break;

		case 2:
			resta();
			break;
		case 3:
			multiplicar();
			break;
		case 4:
			potencia();
			break;
		case 5:
			raizCuadrada();
			break;
		case 6:
			raizCubica();
			break;
		case 7:
			dividir();
			break;
		default:
			System.out.println("Has introducido un número erróneo");
			break;
		}
	}
}
