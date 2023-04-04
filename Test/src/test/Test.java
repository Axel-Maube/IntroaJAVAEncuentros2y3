/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Hola, como estan?, me llamo " + nombre + " y estoy aprendiendo JAVA");             
    }
    
}
