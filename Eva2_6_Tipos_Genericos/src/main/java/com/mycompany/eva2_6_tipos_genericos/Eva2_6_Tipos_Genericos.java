/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_6_tipos_genericos;

/**
 *
 * @author dell
 */
public class Eva2_6_Tipos_Genericos {

    public static void main(String[] args) {
ejemplo<Integer> prueba = new ejemplo<Integer>();
prueba.getDato();
    }
}

class ejemplo<T> {

    private T dato;
    public ejemplo (){}
    public ejemplo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
