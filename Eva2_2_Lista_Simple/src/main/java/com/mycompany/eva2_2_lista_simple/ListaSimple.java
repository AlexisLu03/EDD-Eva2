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
        Inicio = null;//Siempre se crea vacía
        Fin = null;
        tamanio = 0;
    }
//Versión 1: O(N);
    //Versión mejorada: O(1)

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor); // Creo el nodo para el valor a insertar
        if (Inicio == null) {
            Inicio = nuevo;
            Fin = nuevo; // Si es el primer nodo, también es el Fin
        } else { // Lista con nodos
            Fin.setSiguiente(nuevo); // Conecto el nuevo nodo al final de la lista
            Fin = nuevo; // Actualizo la referencia de 'Fin' al nuevo último nodo
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
    //Imprimir en orden inverso. O(N)
    public void imprimirInverso() {
        if (listaVacia()) {
            System.out.println("");
            return;
        }

        int tam = longitud()-1;
        int[] valores = new int[tam];
        Nodo temp = Inicio;
        int a = 0;
        
        while (temp != null) {
            valores[a] = temp.getValor();
            temp = temp.getSiguiente();
            a++;
        }

        int cant = 0;
        for (int i = tam - 1; i >= 0; i--) {
            System.out.print("[" + valores[i] + "]");
            cant++;
            if (cant == 5) {
                System.out.println("");
                cant = 0;
            }
        }
        System.out.println("");
    }
    
    // O(N).Tarea Cambiar a O(1)
    public int longitud() {
       /* Nodo temp = Inicio;
        int cant = 0;
        while (temp != null) {
            cant++;
            temp = temp.getSiguiente();
        }
        return cant;*/
       return tamanio;
    }

    public boolean listaVacia() {
        if (Inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void vaciarLista() {
        Inicio = null;
        Fin = null;
    }

    // Validar posición valida
    //throws
    //O(N)
    public int valorEn(int posicion) {
        //Excepción
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

    //Encuentra la posición del valor pedido, solo la primera
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

    //Insertar en. necesita el valor a agregar y su posición
    //O(N)
    public void insertarEN(int valor, int posicion) {
        if (listaVacia()) {
            throw new IndexOutOfBoundsException("La lista está vacía.");
        }
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
        }}
    //Borrar en. desplazar a la posición anterior a la que quiero borrar
    //Cambiar la referencia del siguiente nodo.
    //O(N)
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
    }
}
