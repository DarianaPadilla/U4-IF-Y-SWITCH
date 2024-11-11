/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ocho;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Ocho {

    public static void main(String[] args) {
         String  artista;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Personajes de EL GRAN CULTIVADOR DEMONIACO Disponibles: ");
        System.out.println();
        System.out.println("Jiang cheng");
        System.out.println("Wei Ying");
        System.out.println("Lan Wangji");
        System.out.println("Lan Xichen");
        System.out.println("Xiao Xing chen");
        System.out.println();
        System.out.println("Ingresa el nombre del personaje que deseas conocer:");
        artista = teclado.nextLine();
        System.out.println();
        
        switch(artista){
            case "jiang cheng":
                 System.out.println("*Adora los perros");
                 System.out.println("* Es el actual lider de la Secta Yumeng Jiang");
                 System.out.println("* Su nombre de cortesia es Jiang Wanyin");
                 System.out.println("* Se volvio lider a temprana edad y crio a su sobrino tras la muerte de su hermana ");
                 System.out.println("* Tiene un sindrome de inferioridad con wei wuxian ");
                 System.out.println("* Tiene una lista de cualidades que buca en una pareja en las cuales el 90% coincide con lan xichen");
                 System.out.println("* Posee un carácter sarcástico, rígido y fuerte, es terco, con un gran ego, aunque no lo demuestre se preocupa por los demás");
                 break;
            case "wei ying":
                 System.out.println("*Lan wangji fue su primer beso aunque el lo descubrio hasta su segunda vida");
                 System.out.println("* Cumple años el 31 de octubre");
                 System.out.println("* Tiene un complejo de salvador por lo que no ve por si mismo");
                 System.out.println("* Fue considerado un prodigio en su generacion, el hombre que logro ser el mas amado y odiado en poco tiempo ");
                 System.out.println("* Creo su propio cultivacion a base de energia maldita ");
                 System.out.println("* Entre los wen que salvo, cuido y quiso a un niño llamado wen yuan en el tiempo que vivio");
                 System.out.println("* Padece una severa cinofobia. Esto se debe a que solía pelear con perros por comida cuando vivía en las calles cuando era niño");
                 break;  
            case "lan wangji":
                 System.out.println("*Cumple años el 31 de enero");
                 System.out.println("* Tiene 33 latigazos en su espalda, producto de desafiar a su secta en defensa de wei wuxian");
                 System.out.println("* A estado enamorado de wei wuxian desde su adolescencia por lo que es el primero en reconocerlo cuando reencarna");
                 System.out.println("* Desde su juventud es alguien noble y obediente, rompiendo las reglas solo por wei wuxian ");
                 System.out.println("* Adopto a Wen yuan como su hijo al enterarse de la muerte de su amado, siendo su unico recuerdo");
                 System.out.println("* Tiene poca tolerancia al alcohol, emborrachandose con una copa");
                 break;  
            case "lan xichen":
                 System.out.println("*Su nombre de cortesia es Lan huan");
                 System.out.println("* Cumple años el 8 de octubre");
                 System.out.println("* Tiene poca tolerancia al alcohol, se emborracha con una copa de vino");
                 System.out.println("* Es actualmente lder de la secta Gusu lan, siendo conocido como Zewu-jun");
                 System.out.println("* La unica vez en que se le vio enojado fue al pensar que wei wuxian se burlaba de los sentimientos de lan wangji");
                 break;  
            case "xiao xing chen":
                 System.out.println("* Cumple años el 25 de enero");
                 System.out.println("* Song lan fue su mejor amigo y compañero de cultivo");
                 System.out.println("* Perdio sus ojos a temprana edad por voluntad, al darselos a song lan para que recuperara la vista");
                 System.out.println("* Era gentil en el exterior, pero determinado en el interior. Era una persona muy solidaria ya que ayudaba a las personas cada vez que le pedían un favor");
                 System.out.println("* Su alma se destruyo ante el dolor de matar a song lan y a gente inocente en manipulacion por xue yang");
                 break;  
                 
            default:
                System.out.println("Ese personaje no esta disponible");
        }
     
        
    }
}
