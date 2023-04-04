/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
 por pantalla.
 */
package guia.de.ej.pract.pkg1.ej2;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class GuiaDeEjPract1Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre=leer.next();
        System.out.println("Su nombre es " + nombre);
                
    }
    
}
