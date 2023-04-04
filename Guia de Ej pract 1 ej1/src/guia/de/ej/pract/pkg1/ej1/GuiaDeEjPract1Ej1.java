/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma
 de los dos. El programa deberá después mostrar el resultado de la suma
 */
package guia.de.ej.pract.pkg1.ej1;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class GuiaDeEjPract1Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese primer Numero");
        num1=leer.nextInt();
        System.out.println("Ingrese segundo Numero");
        num2=leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de los num ingresados es de " + suma);
    }
    
}
