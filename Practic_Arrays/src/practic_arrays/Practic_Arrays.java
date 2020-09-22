/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practic_arrays;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Practic_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("introdusca el tamaño del arreglo: ");
        int num;
        num = leer.nextInt();
        int[] numeros = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + ".ingrese los datos de cada indice:");
            numeros[i] = leer.nextInt();
        }
        System.out.println("los elementos del arreglo son:");
         for (int i = 0; i < num; i++) {
             System.out.println(numeros[i]);
         }
    }

}
