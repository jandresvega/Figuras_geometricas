package com.figuras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner entrada=new Scanner(System.in);
        boolean contador=true;

        do {
            System.out.println("***** MENU *****");
            System.out.println("1) Cuadrado");
            System.out.println("2) Triangulo Rectangulo");
            System.out.println("3) Triangulo Isosceles");
            System.out.println("4) Rombo");
            System.out.println("5) Salir");

            int opc= entrada.nextInt();

            switch (opc){
                case 1:
                    break;
                case 2:

                    System.out.println("triangulo Rectangulo");
                    break;
                case 3:
                    Figuras_Geometricas.triangulo_isosceles(7);
                    System.out.println("Triangulo Isosceles");
                    break;
                case 4:
                    System.out.println("Rombo");
                default:
                    contador=false;
                    break;
            }
        }while(contador);
    }
}
