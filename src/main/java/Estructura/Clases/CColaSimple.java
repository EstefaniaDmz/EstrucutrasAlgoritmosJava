/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CColaSimple {
    private Nodo head;
    private Nodo tail;
    
    public CColaSimple(){
        head = null;
        tail = null;
    }
    
    public void Agregar(String dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(head == null){
            head = tail = nuevo;
            return;
        }
        tail.setSiguiente(nuevo);
        tail = nuevo;
    }
    
    public void Eliminar(){
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.getSiguiente();
    }

    @Override
    public String toString() {
        String cadena = "";
        Nodo h = head;
        if(h != null){
            cadena+=h.toString();
            h = h.getSiguiente();
            while(h != null){
                cadena+=", " + h.toString();
                h = h.getSiguiente();
            }
            return cadena;
        } else {
            return "Cola vacía";
        }
    }
    
    
}
