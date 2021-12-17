package com.figuras;

import java.util.Scanner;

public class Figuras_Geometricas {

    static Scanner entrada=new Scanner(System.in);
    int h=0;
    int b=0;
    public static void ingresarDatos() {
        Scanner entrada=new Scanner(System.in);
        int h=0;
        int b=0;
        System.out.println("INGRESE ALTURA DE LA FIGURA QUE SELLECIONO");
        h = entrada.nextInt();
        System.out.println("INGRESE BASE DE LA FIGURA QUE SELLECIONO");
        b = entrada.nextInt();
    }
    public static void cuadrado(int base, int altura){
        for(int i=0;i<base;i++){
            for (int j=1;j<=altura;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void triangulo_rectangulo(int altura){

        for (int i=0;i<altura;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
