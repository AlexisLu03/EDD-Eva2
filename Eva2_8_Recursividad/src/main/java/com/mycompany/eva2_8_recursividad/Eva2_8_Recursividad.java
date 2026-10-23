/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_8_recursividad;

/**
 *
 * @author dell
 */
public class Eva2_8_Recursividad {

    public static void main(String[] args) {
        imprimirCiclo(5);
        imprimirRecu(5);
    }

    public static void imprimirCiclo(int num) {
        for (int i = num; i >= 1; i--) {
            System.out.print(i);
            if (i!=1) {
                System.out.print(" - ");
            }
        }
        System.out.println("");
    }

    public static void imprimirRecu(int num) {
        //Resuelva una parte del problema
        //Se llame a sí mismo
        //Detener la recursividad
        if (num!=0) {
            System.out.print(num);
            if (num!=1) {
                System.out.print(" - ");
            }
            imprimirRecu(num-1);
        } else {
            System.out.println("");
        }
    }

}
