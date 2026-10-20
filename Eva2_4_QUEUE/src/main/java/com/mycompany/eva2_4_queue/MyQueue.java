/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_queue;

/**
 *
 * @author dell
 */
public class MyQueue {

    private Nodo Inicio;
    private Nodo Fin;
    private int tamanio;

    public MyQueue() {
        Inicio = null; // Siempre se crea vacía
        Fin = null;
        tamanio = 0;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (Inicio == null) {
            Inicio = nuevo;
            Fin = nuevo;
        } else {
            Fin.setSiguiente(nuevo);
            nuevo.setPrevio(Fin);
            Fin = nuevo;
        }
        tamanio++;
    }

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

    public void imprimirInverso() {
        if (listaVacia()) {
            System.out.println("");
            return;
        }

        Nodo temp = Fin;
        int cant = 0;
        for (int i = longitud() - 1; i >= 0; i--) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
            cant++;
            if (cant == 5) {
                System.out.println("");
                cant = 0;
            }
        }
        System.out.println("");
    }

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

    public void insertarEN(int valor, int posicion) {
        if (posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("La posición dada esta fuera de rango: " + posicion);
        }

        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {
            nuevo.setSiguiente(Inicio);
            Inicio.setPrevio(nuevo);
            Inicio = nuevo;
            if (Fin == null) {
                Fin = nuevo;
            }
        } else if (posicion == longitud()) {
            Fin.setSiguiente(nuevo);
            nuevo.setPrevio(Fin);
            Fin = nuevo;
        } else {
            Nodo temp = Inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            Nodo siguiente = temp.getSiguiente();

            nuevo.setPrevio(temp);
            nuevo.setSiguiente(siguiente);
            temp.setSiguiente(nuevo);
            siguiente.setPrevio(nuevo);
        }
        tamanio++;
    }

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
            } else {
                Inicio.setPrevio(null);
            }
        } else if (posicion == longitud() - 1) {
            Fin = Fin.getPrevio();
            Fin.setSiguiente(null);
        } else {
            Nodo temp = Inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            Nodo aBorrar = temp.getSiguiente();
            Nodo siguiente = aBorrar.getSiguiente();

            temp.setSiguiente(siguiente);
            siguiente.setPrevio(temp);
        }
        tamanio--;
    }

    //Queue - FIFO(Primero en entrar, primero en salir)
    public void push(int Valor)//Agrega un valor al final de la lista
    {
        agregar(Valor);
    }

    public int peek()//Lee el valor directamente accesible sin borrarlo
    {
        return valorEn(0);
    }

    public int pop() // Lee el valor directamente accesible y lo borra
    {
        int temp = valorEn(0);
        borrarEn(0);
        return temp;
    }
}
