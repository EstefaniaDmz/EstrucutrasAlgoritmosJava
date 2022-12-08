/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CColaCircular {
    private Nodo head;
    private Nodo tail;
    
    public CColaCircular(){
        head = tail = null;
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
        tail.setSiguiente(head);
    }
    
    public void Eliminar(){
        if(head == null){
            return;
        }
        if(head.getSiguiente() == head){
            head = tail = null;
            return;
        }
        head = head.getSiguiente();
        tail.setSiguiente(head);
    }

    @Override
    public String toString() {
        String cadena = "";
        Nodo h = head;
        if(h != null){
            if (h.getSiguiente() != h)
                {
                    while (h != tail){
                        cadena += h.toString() + ", ";
                        h = h.getSiguiente();
                    }
                    cadena += h.toString() + ", ";
                    return cadena;
                }
                else{
                    cadena = h.toString();
                    return cadena;
                }
        }
        else
        {
            return "Cola vacía";
        }
    }
    
}
