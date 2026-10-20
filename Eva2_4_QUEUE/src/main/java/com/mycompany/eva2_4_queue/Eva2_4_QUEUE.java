/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_queue;

/**
 *
 * @author dell
 */
public class Eva2_4_QUEUE {

    public static void main(String[] args) {
        MyQueue cola = new MyQueue();
        System.out.println("Numero de nodos previo: " + cola.longitud());
        System.out.println("¿Esta vacía la cola?");
        if (cola.listaVacia() == true) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }

        System.out.println("Rellenando cola con push");
        cola.push(190);
        cola.push(345);
        cola.push(46);
        cola.push(757);
        cola.push(46754);
        cola.push(9);

        cola.imprimir();
        System.out.println("Cantidad: " + cola.longitud());

        System.out.println("Orden Inverso");
        cola.imprimirInverso();

        System.out.println("Peek (primero en la cola): " + cola.peek());
        cola.imprimir();

        System.out.println("Pop (sale el primero): " + cola.pop());
        cola.imprimir();
        System.out.println("Cantidad: " + cola.longitud());

        System.out.println("Pop (sale el siguiente): " + cola.pop());
        cola.imprimir();
        System.out.println("Peek ahora: " + cola.peek());

        System.out.println("Vaciando la cola con pop");
        while (!cola.listaVacia()) {
            System.out.println("Sale: " + cola.pop());
        }
        System.out.println("Cantidad final: " + cola.longitud());

    }
}