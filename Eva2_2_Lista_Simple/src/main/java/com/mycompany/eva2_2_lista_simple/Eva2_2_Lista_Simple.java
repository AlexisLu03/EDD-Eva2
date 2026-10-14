/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_2_lista_simple;

/**
 *
 * @author dell
 */
public class Eva2_2_Lista_Simple {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        //long ini,Fin, tiempo;
        //int[] arreglo = new int[1000000];
        System.out.println("Numero de nodos previo: " + lista.longitud());
        System.out.println("¿Esta vacía la lista?");
        if (lista.listaVacia() == true) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
        System.out.println("Rellenando lista");
        lista.agregar(190);
        lista.agregar(345);
        lista.agregar(46);
        lista.agregar(757);
        lista.agregar(46754);
        lista.agregar(9);

        lista.imprimir();
        System.out.println("Valor en posición 4: " + lista.valorEn(4));

        System.out.println("Posición de 190: " + lista.encontrar(190));
        System.out.println("Posición de 500: " + lista.encontrar(500));

        System.out.println("Insertar Nodo en posición 2");
        lista.insertarEN(200, 2);
        lista.imprimir();
        System.out.println("Borrar Nodo en posición 2");
        lista.borrarEn(2);
        lista.imprimir();
        System.out.println("Borrar Nodo en posición 0");
        lista.borrarEn(0);
        lista.imprimir();
        System.out.println("Orden Inverso");
        lista.imprimirInverso();
    }

}
