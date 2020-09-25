/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import static arreglos.Arreglos.leer;

/**
 *
 * @author hp
 */
public class Bidimensional extends Arreglos_EDT {

    public Bidimensional() {
    }

    public int[][] llenar(int[][] x) {
        System.out.println("ingrese los valores de la matriz");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer.parseInt(leer.next());

            }
        }
        return x;
    }

    public int[][] imprimirmatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]); 

            }

            System.out.println();
        }
        return x;
    }
     
     
}
