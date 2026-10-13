/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_referencias;

/**
 *
 * @author dell
 */
public class Eva2_1_Referencias {

    public static void main(String[] args) {
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        
        System.out.println("Inicio :" + inicio);
        System.out.println("Inicio :" + inicio.valor);
        System.out.println("Inicio :" + inicio.otro);
        
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200;
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor = 300;
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.valor = 320;
        
        Ejemplo sig = inicio;
        while (sig != null) {
            System.out.println("[" + sig.valor + "]");
            sig = sig.otro;
        }
    }
}

class Ejemplo {
    int valor;
    Ejemplo otro;
}