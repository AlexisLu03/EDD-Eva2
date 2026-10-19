/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_listadoble;

/**
 *
 * @author dell
 */
public class Eva2_3_ListaDoble {

    public static void main(String[] args) {
      ListaDoble lista = new ListaDoble();
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
        
        System.out.println("Orden Inverso");
        lista.imprimirInverso();
        System.out.println("Insertar Nodo de 200 en posición 2");
        lista.insertarEN(200, 2);
        lista.imprimir();
        System.out.println("Cantidad: "+lista.longitud());
        System.out.println("Inverso");
        lista.imprimirInverso();
        System.out.println("Borrar Nodo en posición 2");
        lista.borrarEn(2);
        lista.imprimir();
        System.out.println("Inverso");
        lista.imprimirInverso();
    }
}
