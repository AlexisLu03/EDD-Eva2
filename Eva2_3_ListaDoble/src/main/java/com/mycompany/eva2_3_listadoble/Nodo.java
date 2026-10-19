/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_listadoble;

/**
 *
 * @author dell
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo previo;

    public Nodo() {
        siguiente = null; // Esto es muy importante, marca el fin de la lista
        previo = null; // Marca el inicio de la lista
    }

    public Nodo(int dato) {
        this.valor = dato;
        this.siguiente = siguiente;
        this.previo = previo;
    }


    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int dato) {
        this.valor = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
}
