/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinco;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Cinco {

    public static void main(String[] args) {
         int mes;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero del mes");
        mes = teclado.nextInt();
        
        switch  (mes){
     case 1:
    
    System.out.println("Invierno");
    break;
    case 2: 
    System.out.println("Invierno");
    break;
     case 3:
    System.out.println("Primavera");
    break;
     case 4:
    System.out.println("Primavera");
    break;
    case 5:
    System.out.println("Primavera");
    break;
    case 6:
    System.out.println("Verano");
    break;
     case 7:
    System.out.println("Verano");
    break;
     case 8:
    System.out.println("Verano");
    break;
     case 9:
    System.out.println("Otoño");
    break;
     case 10:
    System.out.println("Otoño");
    break;
    case 11:
    System.out.println("Otoño");
    break;
     case 12:
    System.out.println("Invierno");
    break;
     default:
    System.out.println("El mes ingresado no existe");
    } }
}
