/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
    public class NodoAD {
    private String dato;
    private NodoAD anterior;
    private NodoAD siguiente;
    public NodoAD(String d)
    {
        dato = d;
        anterior = null;
        siguiente = null;
    }
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoAD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoAD anterior) {
        this.anterior = anterior;
    }

    public NodoAD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAD siguiente) {
        this.siguiente = siguiente;
    }
    
    public NodoAD(){
        dato = "";
        anterior = siguiente = null;
    }

    @Override
    public String toString() {
        return dato;
    }
}
