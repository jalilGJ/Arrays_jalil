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
public class Multidimensional extends Arreglos_EDT {
    public Multidimensional() {
    }
    public int[][][] llenar(int[][][] x) {
        System.out.println("ingrese los valores del arreglo");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    System.out.print(" matriz [" + i + "][" + j + "][" + k + "]:");
                    x[i][j][k] = Integer.parseInt(leer.next());

                }
            }
        }
        return x;
    }
    public int[][][] imprimirarreglo(int[][][] x) {
        System.out.println("los numeros del arreglo son:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    System.out.print(x[i][j][k]);
                }
            }
            System.out.println("");
        }
        return x;
    }
}
