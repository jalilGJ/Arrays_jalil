package arreglos;

import java.util.Scanner;

public class Arreglos {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Unidimensional opc1 = new Unidimensional();
        Bidimensional opc2 = new Bidimensional();
        Multidimensional opc3 = new Multidimensional();

        int opcion;
        System.out.println("Elige el arreglo que desea utilizar");
        System.out.println("1.Unidimencional");
        System.out.println("2.Bidimencional");
        System.out.println("3.Multidimencional");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                int opcion1;
                System.out.println("introdusca el tamaño del arreglo: ");
                int[] vector = new int[leer.nextInt()];
                opc1.Ingresardatos(vector);
                System.out.println("Selecione que tarea desea relizar con su vector:");
                System.out.println("1.Mostrar numeros");
                System.out.println("2.Sumar numeros");
                opcion1 = leer.nextInt();
                switch (opcion1) {
                    case 1:
                        opc1.mostrarnumeros(vector);
                    case 2:
                        opc1.sumar(vector);
                        System.out.println("la suma de los indices es :" + opc1.sumar(vector));
                }
                break;

            case 2:
                int filas;
                int columnas;
                int[][] Matriz = null;
                System.out.println("ingrese el tamaño de la matriz:");
                System.out.println("Digete el numero de columnas:");
                columnas = leer.nextInt();
                System.out.println("Digete el numero de filas:");
                filas = leer.nextInt();
                Matriz = new int[filas][columnas];
                opc2.llenar(Matriz);
                System.out.println("");
                System.out.println("Mostrar matriz");
                System.out.println(opc2.imprimirmatriz(Matriz));
                break;

            case 3:
                int filas1;
                int columnas1;
                int caras;
                int[][][] Multidimencional = null;
                System.out.println("Define el tamaño del Arreglo.");
                System.out.println("ingrese el numero de caras:");
                caras = leer.nextInt();
                System.out.println("Ingrese el numero de filas:");
                columnas1 = leer.nextInt();
                System.out.println("Ingrese el numero de columnas:");
                filas1 = leer.nextInt();
                Multidimencional = new int[caras][filas1][columnas1];
                System.out.println(opc3.llenar(Multidimencional));
                System.out.println(opc3.imprimirarreglo(Multidimencional));
                break;
        }
    }
}
