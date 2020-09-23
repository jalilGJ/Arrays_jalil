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
        int num; // se declara la variable donde se alamacenara el tamaño del arreglo
        int suma = 0;
        System.out.println("introdusca el tamaño del arreglo: ");//se solicita el tamaño del arreglo
        num = leer.nextInt();//se almacena el tamaño del arreglo
        int[] numeros = new int[num];// se declara el nombre del arreglo y tipo de dato
        for (int i = 0; i < num; i++) {//se utiliza un bucle for para guardar los datos, el iterador debe que ser igual a 0 hasta que el interador sea menor que num.
            //num ser la cantridad de elementos, y aumentamos el interador con i mas mas.
            System.out.println((i + 1) + ".ingrese los datos de cada indice:");// se solicitan los datos de los indices
            numeros[i] = leer.nextInt();// se guarda en el arreglo
        }
        System.out.println("los elementos del arreglo son:");//se imprimen los elementos  del arreglo
         for (int i = 0; i < num; i++) {//se recorre los indices con un bucle for
             System.out.println(numeros[i]);// se imprime los elemntos de cada indice del interador i
              
            
         }
       
    }

}
