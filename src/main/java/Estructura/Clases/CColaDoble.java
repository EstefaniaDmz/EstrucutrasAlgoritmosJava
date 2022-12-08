/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CColaDoble {
    private NodoAD head;
    private NodoAD tail;
    
    public CColaDoble(){
        head = tail = null;
    }
    
    public void AgregarFrente(String dato){
        NodoAD nuevo = new NodoAD();
        nuevo.setDato(dato);
        if(EstaVacia()){
            head = tail = nuevo;
            return;
        }
        head.setAnterior(nuevo);
        nuevo.setSiguiente(head);
        head = nuevo;
    }
    
    public void AgregarFinal(String dato){
        NodoAD nuevo = new NodoAD();
            nuevo.setDato(dato);
            if (EstaVacia())
            {
                head = tail = nuevo;
                return;
            }
            tail.setSiguiente(nuevo);
            nuevo.setAnterior(tail);
            tail = nuevo;
    }
    
    public void EliminarFrente(){
        if (EstaVacia()){
                return;
            }
            if (head.getSiguiente() == null){
                head = tail = null;
                return;
            }
            head = head.getSiguiente();
            head.setAnterior(null);
    }
    
    public void EliminarFinal(){
        if(EstaVacia()){
            return;
        }
        if (head.getSiguiente() == null){
                head = tail = null;
                return;
            }
            tail = tail.getAnterior();
            tail.setSiguiente(null);
    }
    
    public boolean EstaVacia(){
        if(head == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String cadena="";
        NodoAD h = head;
        if(EstaVacia() == false){
            cadena += h.toString();
            h = h.getSiguiente();
            while (h != null){
                cadena += ", " + h.toString();
                h = h.getSiguiente();
            }
            return cadena;
        }else{
            return "Cola vacía";
        }
    }
}
