/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_9_factorial;

/**
 *
 * @author dell
 */
public class Eva2_9_Factorial {

    public static void main(String[] args) {
        System.out.println(factorialCiclo(3));
        System.out.println(factorialRecursivo(3));
    }

    public static int factorialCiclo(int valor) {
        int fact = 1;
        for (int i = 1; i <= valor; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int factorialRecursivo(int valor) {
        if (valor == 0) {
            return 1;
        } else {return valor * factorialRecursivo(valor - 1);
        }
        
    }
}
