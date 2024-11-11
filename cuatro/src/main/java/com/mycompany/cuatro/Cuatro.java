/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuatro;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Cuatro {

    public static void main(String[] args) {
        double precio,descuento;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa el precio de tu producto: ");
        precio = teclado.nextDouble();
        
        if (precio<=100){
        System.out.println("No tienes descuento");}
        else if (precio>100 && precio<=200){
            descuento = precio - (precio*0.1);
            System.out.println("El precio final del producto con el 10% de descuento es: " + descuento);
        }else if (precio>200 && precio<=500){
        descuento = precio - (precio*0.2);
            System.out.println("El precio final del producto con el 20% de descuento es: " + descuento);
        }
        else {
        descuento = precio - (precio*0.25);
            System.out.println("El precio final del producto con el 25% de descuento es: " + descuento);
        }
    }
}

