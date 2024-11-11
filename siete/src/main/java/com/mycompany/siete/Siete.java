/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.siete;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Siete {

    public static void main(String[] args) {
         double mxn,convertidor;
        int seleccion;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de pesos: ");
        mxn = teclado.nextDouble();
        System.out.println("1.Dolar");
        System.out.println("2.Euro");
        System.out.println("3.Bath");
        System.out.println("4.Yen");
        System.out.println("5.Won");
        System.out.println("6.Dolar Australiano");
        System.out.println("7.Sol");
        System.out.println("8.Dolar Canadiense ");
         System.out.println("9.Bolivar");
        System.out.println("10.Peso Argentino");
         System.out.println();
        System.out.println("Coloca el numero de la opcion que desea convertir: ");
        seleccion = teclado.nextInt();
     
         switch(seleccion){
        
            case 1:
            convertidor = mxn*0.050;
            System.out.println("La cantidad de dolares es: " + convertidor +" USD");
            break;
            case 2:
            convertidor = mxn*0.046;
            System.out.println("La cantidad de euros es: " + convertidor +" EUR");
            break;
            case 3:
            convertidor = mxn* 1.68;
            System.out.println("La cantidad de bahts es: " + convertidor +" THB");
            break;
            case 4:
            convertidor = mxn*7.54;
            System.out.println("La cantidad de yenes es: " + convertidor +" JPY");
            break;
            case 5:
            convertidor = mxn*69.16;
            System.out.println("La cantidad de wones es: " + convertidor +" KRW");
            break;
             case 6:
            convertidor = mxn*0.075;
            System.out.println("La cantidad de dolares australianos es: " + convertidor +" AUD");
             break;
            case 7:
            convertidor = mxn*0.19;
            System.out.println("La cantidad de soles es: " + convertidor +" PEN");
            break;
            case 8:
            convertidor = mxn*0.069;
            System.out.println("La cantidad de dolares canadienses es: " + convertidor +" CAD");
            break;
            case 9:
            convertidor = mxn*196729;
            System.out.println("La cantidad en Bolivares es:: " + convertidor +" VES");
            break;
            case 10:
            convertidor = mxn*49.25;
            System.out.println("La cantidad en pesos argentinos es: " + convertidor +" ARS");
            break;
            default:
                System.out.println("Esa eleccion no esta");
              break;
        }
    }
}
