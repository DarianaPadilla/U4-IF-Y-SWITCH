/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dos;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Dos {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();
        
        if (edad>=18){
        System.out.println("Puedes votar");}
        else{
        System.out.println("NO PUEDES VOTAR");}
        }
    }
