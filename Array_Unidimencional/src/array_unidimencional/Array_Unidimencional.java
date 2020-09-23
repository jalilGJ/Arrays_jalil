/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_unidimencional;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Array_Unidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("introdusca el tamaño del arreglo: ");
        int num;
        num = leer.nextInt();
        int[] numeros = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + ".ingrese los datos de cada indice:");
            numeros[i] = leer.nextInt();
        }

        System.out.println("Que opcion desea");
        System.out.println("1.Eliminar datos");
        System.out.println("2.Iprimir datos");
        System.out.println("3.operaciones");
        System.out.println("4.Salir");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:

                break;

            case 2:
                System.out.println("Los elementos del arreglo son:");
                for (int i = 0; i < num; i++) {
                    System.out.println(numeros[i] + num);
                }

                break;
            case 3:
                System.out.println("Elige una operacion: ");
                System.out.println("1. Promedio");
                System.out.println("2. Minimo y Maximo ");
                System.out.println("3. Suma");
                switch (opcion) {

                    case 1:
                      
                        break;
                    case 2:

                        break;
                    case 3:

                        break;

                }
                break;
            case 4:

                break;

        }

    }

}
