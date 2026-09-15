/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Ingrese en km la distancia recorrida");
        int kmsNum = sc.nextInt();

        System.out.println("Ahora ingrese las horas que ha tardado en recorrerla");
        int hoursNum = sc.nextInt();
        
        System.out.println("La velocidad media empleada ha sido " + kmsNum / hoursNum + "km/h.");
    }
}
