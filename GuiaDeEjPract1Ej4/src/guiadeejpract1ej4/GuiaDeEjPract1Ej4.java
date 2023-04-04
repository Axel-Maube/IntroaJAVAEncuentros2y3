/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guiadeejpract1ej4;

import java.util.Scanner;


public class GuiaDeEjPract1Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de grados que hace");
        Scanner leer = new Scanner(System.in);
        
        double grados = leer.nextDouble();
        System.out.println("El equivalente a Fahrenheit es: " + (32+(9*grados/5)));
        
        
        
    }
    
}
