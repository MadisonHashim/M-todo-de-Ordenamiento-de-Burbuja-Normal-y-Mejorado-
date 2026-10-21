/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasjava.practicas;

/**
 *
 * @author Thinkval
 */
public class burbuja {
    
    //ordenamiento de burbuja normal
    public static void ordenamientoBurbuja(int [] arreglos){
              
        for(int i=0;i<arreglos.length-1;i++){
            for(int j=0;j<arreglos.length-1-i;j++){
                if(arreglos[j]>arreglos[j+1]){
                     int temporal=arreglos[j];
                    arreglos[j]=arreglos[j+1];
                    arreglos[j+1]=temporal;
                }
            }
        }
    }
    
    //ordenamiento de burbuja mejordo 
    public static void ordenamientoBurbujaMejorado(int[]arreglos){
         boolean huboIntercambio;
       for (int i = 0; i < arreglos.length - 1; i++) {
            huboIntercambio = false;
        for (int j = 0; j < arreglos.length - 1 - i; j++) {
            if (arreglos[j] > arreglos[j + 1]) {
                int temporal = arreglos[j];
                arreglos[j] = arreglos[j + 1];
                arreglos[j + 1] = temporal;

                huboIntercambio = true; 
            }
        }
        if (!huboIntercambio) {
            break; 
            }
        }
    }
    
    public static void main(String[] args) {

    int[] arreglos1 = {5, 2, 9, 1, 3};
    int[] arreglos2 = {5, 2, 9, 1, 3};

    // Prueba con burbuja normal
    System.out.println("BURBUJA NORMAL");
    System.out.println("Arreglo inicial: "+ java.util.Arrays.toString(arreglos1));

    ordenamientoBurbuja(arreglos1);

    System.out.println("Arreglo ordenado: "+ java.util.Arrays.toString(arreglos1));

    System.out.println();

    // Prueba con burbuja mejorado
    System.out.println("BURBUJA MEJORADO");
    System.out.println("Arreglo inicial: "+ java.util.Arrays.toString(arreglos2));

    ordenamientoBurbujaMejorado(arreglos2);

    System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(arreglos2));

    System.out.println();

    // Prueba con un arreglo parcialmente ordenado
    int[] arreglos3 = {1, 2, 4, 3, 5};

    System.out.println("PRUEBA CON ARREGLO PARCIALMENTE ORDENADO");
    System.out.println("Arreglo inicial: "+ java.util.Arrays.toString(arreglos3));

    ordenamientoBurbujaMejorado(arreglos3);

    System.out.println("Arreglo ordenado: "+ java.util.Arrays.toString(arreglos3));

    System.out.println();

    // Prueba con un arreglo ya ordenado
    int[] arreglos4 = {1, 2, 3, 4, 5};

    System.out.println("PRUEBA CON ARREGLO ORDENADO");
    System.out.println("Arreglo inicial: "+ java.util.Arrays.toString(arreglos4));

    ordenamientoBurbujaMejorado(arreglos4);

    System.out.println("Arreglo final: "+ java.util.Arrays.toString(arreglos4));
    }
}   
