/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_lista_simple;

/**
 *
 * @author dell
 */
public class ListaSimple {

    private Nodo Inicio;
    private Nodo Fin;
    private int tamanio;

    public ListaSimple() {
        Inicio = null; // Siempre se crea vacía
        Fin = null;
        tamanio = 0;
    }

    // O(1)
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (Inicio == null) {
            Inicio = nuevo;
            Fin = nuevo;
        } else {
            Fin.setSiguiente(nuevo);
            Fin = nuevo;
        }
        tamanio++;
    }

    // O(N)
    public void imprimir() {
        Nodo temp = Inicio;
        int Cant = 0;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
            Cant++;
            if (Cant == 5) {
                System.out.println("");
                Cant = 0;
            }
        }
        System.out.println("");
    }

    // Imprimir en orden inverso usando valorEn. O(N^2)
    public void imprimirInverso() {
        if (listaVacia()) {
            System.out.println("");
            return;
        }

        int cant = 0;
        for (int i = longitud() - 1; i >= 0; i--) {
            System.out.print("[" + valorEn(i) + "]");
            cant++;
            if (cant == 5) {
                System.out.println("");
                cant = 0;
            }
        }
        System.out.println("");
    }

    // O(1)
    public int longitud() {
        return tamanio;
    }

    public boolean listaVacia() {
        return Inicio == null;
    }

    public void vaciarLista() {
        Inicio = null;
        Fin = null;
        tamanio = 0;
    }

    // O(N)
    public int valorEn(int posicion) {
        if (listaVacia()) {
            throw new IndexOutOfBoundsException("La lista está vacía.");
        }
        if (posicion < 0 || posicion >= longitud()) {
            throw new IndexOutOfBoundsException("La posición dada esta fuera de rango: " + posicion);
        }
        Nodo temp = Inicio;
        for (int i = 0; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }

    // Encuentra la posición del valor pedido, solo la primera
    public int encontrar(int valor) {
        if (listaVacia()) {
            throw new IndexOutOfBoundsException("La lista está vacía.");
        }
        Nodo temp = Inicio;
        int posicion = 0;
        while (temp != null) {
            if (temp.getValor() == valor) {
                return posicion;
            }
            temp = temp.getSiguiente();
            posicion++;
        }
        return -1;
    }

    // Inserta un valor en una posición. O(N)
    public void insertarEN(int valor, int posicion) {
        if (posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("La posición dada esta fuera de rango: " + posicion);
        }

        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {
            nuevo.setSiguiente(Inicio);
            Inicio = nuevo;
            if (Fin == null) {
                Fin = nuevo;
            }
        } else if (posicion == longitud()) {
            Fin.setSiguiente(nuevo);
            Fin = nuevo;
        } else {
            Nodo temp = Inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
        tamanio++;
    }

    // Borra el nodo en la posición dada. O(N)
    public void borrarEn(int posicion) {
        if (listaVacia()) {
            throw new IndexOutOfBoundsException("La lista está vacía.");
        }
        if (posicion < 0 || posicion >= longitud()) {
            throw new IndexOutOfBoundsException("La posición dada está fuera de rango: " + posicion);
        }

        if (posicion == 0) {
            Inicio = Inicio.getSiguiente();
            if (Inicio == null) {
                Fin = null;
            }
        } else {
            Nodo temp = Inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            Nodo aBorrar = temp.getSiguiente();
            temp.setSiguiente(aBorrar.getSiguiente());

            if (aBorrar == Fin) {
                Fin = temp;
            }
        }
        tamanio--;
    }
}