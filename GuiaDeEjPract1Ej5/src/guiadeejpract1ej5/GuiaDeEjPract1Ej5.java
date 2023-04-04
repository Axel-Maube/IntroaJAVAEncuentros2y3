/*
 Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package guiadeejpract1ej5;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class GuiaDeEjPract1Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
                
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println("El doble es: " + (num*2) + ". El triple es: " + num*3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
        System.out.println("Elevado al cubo es " + Math.pow(num, 3));
                
    }
    
}
