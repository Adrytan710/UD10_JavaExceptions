package Main;

/**
 * @author Adrián Rodriguez
 */

import javax.swing.JOptionPane;
import Objetos.PasswordEj5;

public class MainEj5App {
	
	 public static void main(String[] args) throws Exception {
		 try {
			 String txt = JOptionPane.showInputDialog("Introduce un tamaño para el array");
		     int tamany = Integer.parseInt(txt);
		  
		     txt=JOptionPane.showInputDialog("Introduce la longitud del password");
		     int longitud = Integer.parseInt(txt);
		     
		     if (longitud < 0 || tamany < 0) {
		    	 Exception e = new Exception("Tienes que introducir un número entero");
		    	 throw e;
		     }
		  
		     PasswordEj5 array1[] = new PasswordEj5[tamany];
		     boolean array2[] = new boolean[tamany];
		  
		     for(int i = 0; i < array1.length; i++) {
		     	array1[i] = new PasswordEj5(longitud);
		     	array2[i] = array1[i].esFuerte();
		        System.out.println(array1[i].getPasswd() + " " + array2[i]);
		     }
		     
		 } catch(NumberFormatException ex) {
	    	 System.out.println("Tienes que introducir un número");
		 } catch(Exception ex) {
		    	 System.out.println(ex.getMessage());
		 }
	}
}
