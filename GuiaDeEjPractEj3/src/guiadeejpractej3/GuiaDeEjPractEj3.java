/*
*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
*después toda en minúsculas. 
*Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guiadeejpractej3;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class GuiaDeEjPractEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase;
        frase = leer.next();
        System.out.println(frase);
        frase = toLowerCase(frase);
        System.out.println(frase);
        frase = toUpperCase(frase);
        System.out.println(frase);
        
        
                
    }

    private static boolean toLowerCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean toUpperCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String toLowerCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
