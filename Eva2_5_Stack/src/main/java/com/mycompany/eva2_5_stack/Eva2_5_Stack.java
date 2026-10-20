/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_stack;

/**
 *
 * @author dell
 */
public class Eva2_5_Stack {

    public static void main(String[] args) {
        Mystack pila = new Mystack();
        System.out.println("Numero de nodos previo: " + pila.longitud());
        System.out.println("¿Esta vacía la pila?");
        if (pila.listaVacia() == true) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }

        System.out.println("Rellenando pila con push");
        pila.push(190);
        pila.push(345);
        pila.push(46);
        pila.push(757);
        pila.push(46754);
        pila.push(9);

        pila.imprimir();
        System.out.println("Cantidad: " + pila.longitud());

        System.out.println("Orden Inverso (de la cima hacia la base)");
        pila.imprimirInverso();

        System.out.println("Peek (cima de la pila): " + pila.peek());
        pila.imprimir();

        System.out.println("Pop (sale la cima): " + pila.pop());
        pila.imprimir();
        System.out.println("Cantidad: " + pila.longitud());

        System.out.println("Pop (sale la siguiente): " + pila.pop());
        pila.imprimir();
        System.out.println("Peek ahora: " + pila.peek());

        System.out.println("Vaciando la pila con pop");
        while (!pila.listaVacia()) {
            System.out.println("Sale: " + pila.pop());
        }
        System.out.println("Cantidad final: " + pila.longitud());
    }
}