/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uno;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Uno {

    public static void main(String[] args) {

        int parcial,proyecto,examen,promedio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nota correspondiente del 0 al 100");
        System.out.println("Ingresa tu nota del parcial: ");
        parcial = teclado.nextInt();
        System.out.println("Ingresa tu nota del proyecto: ");
        proyecto = teclado.nextInt();
        System.out.println("Ingresa tu nota del examen: ");
        examen = teclado.nextInt();
        if (parcial>=0 && parcial<=100 && proyecto>=0 && proyecto<=100 && examen>=0 && examen<=100){
        promedio = (int) (parcial*0.4);
        promedio = (int) (promedio + (proyecto *0.3));
        promedio = (int) (promedio + (examen * 0.3));
        
        System.out.println("Tu promedio final es: " + promedio);
        
                }else {
        System.out.println("Ingresa la verdadera calificacion de un 0 a 100");}
    }
}

