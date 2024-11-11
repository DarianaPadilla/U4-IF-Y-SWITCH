/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seis;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Seis {

    public static void main(String[] args) {
        int celsius;
        double grados;
        String eleccion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los grados Celsius: ");
        celsius = teclado.nextInt();
        System.out.println("¿A que quieres convertir Fahrenheit (F) o Kelvin (K)?");
        eleccion = teclado.next();
        
        switch (eleccion){
            case "F":
            grados = (celsius *1.8)+32;
            System.out.println(" En grados fahrenheit: " + grados + " F");
            break; 
            case "K":
            grados = celsius + 213.5;
            System.out.println(" En grados fahrenheit: " + grados + " K");
            break;   
            default:
                System.out.println("Ese modo de temperatura no existe");
   
        }
        
    }
}
