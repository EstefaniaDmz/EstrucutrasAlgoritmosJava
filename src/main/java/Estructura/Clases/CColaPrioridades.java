/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CColaPrioridades {
    private NodoP[] prioridades;
    private int head, tail;
    
    public CColaPrioridades(){
        prioridades = null;
        head = tail = -1;
    }
    
    public void CrearArreglo(int num){
        prioridades = new NodoP[num];
    }
    
    public void Agregar(NodoP nuevo){
        if(head == -1){
            head = tail = 0;
            prioridades[0] = nuevo;
            return;
        }
        if (prioridades[nuevo.getPrioridad()] == null){
            tail = nuevo.getPrioridad();
            prioridades[nuevo.getPrioridad()] = nuevo;
            return;
        }
        NodoP h = prioridades[nuevo.getPrioridad()];
        while(h.getSiguiente() != null){
            h = h.getSiguiente();
        }
        h.setSiguiente(nuevo);
    }
    
    public void Eliminar(){
        if(head == -1){
            return;
        }
        if (head == tail){
            if (prioridades[head].getSiguiente() == null){
                prioridades[head] = null;
                head = tail = -1;
            } else {
                prioridades[head] = prioridades[head].getSiguiente();
            }
            return;
        }
        if(prioridades[head].getSiguiente() != null){
            prioridades[head] = prioridades[head].getSiguiente();
            return;
        }
        if(prioridades[head].getSiguiente() == null){
            if(head == prioridades.length - 1){
                prioridades[head] = null;
                head = 0;
            } else {
                prioridades[head] = null;
                head++;
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        if(head != -1){
            for(int i = head; i < prioridades.length; i++){
                if(prioridades[i] == null){
                    return cadena += "";
                }
                cadena+=prioridades[i].toString();
                NodoP h = prioridades[i];
                if(h == null){
                    cadena += "";
                }
                else {
                    while(h.getSiguiente() != null){
                        cadena += ", " + h.getSiguiente().toString();
                        h = h.getSiguiente();
                    }
                }
                cadena += "\n";
            }
            return cadena;
        }
        else 
        {
            return "Cola vacía";
        }
        
    }
    
    
}
