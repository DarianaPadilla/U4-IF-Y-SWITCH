/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tres;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Tres {

    public static void main(String[] args) {
         int calificacion;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion: ");
        calificacion = teclado.nextInt();
        
        if(calificacion>=90 && calificacion<=100){
        System.out.println("A");}
        else if (calificacion>=80 && calificacion <=89){
            System.out.println("B");
        }
        else if (calificacion>=70 && calificacion <=79){
        System.out.println("C");}
        else if (calificacion>=60 && calificacion <=69){
        System.out.println("D");}
        else if (calificacion <60){
        System.out.println("F");}
        else{
        System.out.println("Ingresa tu verdadera calificacion de 0 a 100");}
        }
        
    }

