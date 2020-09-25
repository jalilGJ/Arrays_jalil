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
public class Unidimensional extends Arreglos_EDT {

    public Unidimensional() {
    }

    public int[] Ingresardatos(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("ingrese el numero:" + (i + 1));
            a[i] = leer.nextInt();
        }
        return a;

    }

    public int[] mostrarnumeros(int y[]) {
        System.out.println("Los numeros del vector son:");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
        return y;
    }

    public int sumar(int z[]) {
        int suma = 0;
        for (int i = 0; i < z.length; i++) {
            suma += z[i];
        }
        return suma;
    }

}
