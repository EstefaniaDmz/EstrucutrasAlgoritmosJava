/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

import java.util.LinkedList;

/**
 *
 * @author andre
 */
public class ArbolBinario {
   private NodoAD raiz;
    private int num_nodos;
    private int alt;

    public ArbolBinario() {
        raiz = null;
        num_nodos = 0;
        alt = 0;
    }
    

    public void insertar(int n){
       String dato = Integer.toString(n);
        if(existe(n))return;
       NodoAD nuevo = new NodoAD(dato);
          if (raiz == null)
              raiz = nuevo;
          else
          {
              NodoAD anterior = null;
              NodoAD tmp = raiz;
              while (tmp != null)
              {
                  anterior = tmp;
                  if (n < Integer.parseInt(tmp.getDato()))
                      tmp = tmp.getAnterior();
                  else
                      tmp = tmp.getSiguiente();
              }
              if (n < Integer.parseInt(anterior.getDato()))
                  anterior.setAnterior(nuevo);
              else
                  anterior.setSiguiente(nuevo);
          }
          num_nodos++;
    }

    public NodoAD getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAD raiz) {
        this.raiz = raiz;
    }

    public int getNumNodos() {
        return num_nodos;
    }
    

    public void preorden(NodoAD aux,LinkedList recorrido){
          if (aux != null)
          {
              recorrido.add(aux.getDato());
              preorden (aux.getAnterior(),recorrido);
              preorden (aux.getSiguiente(),recorrido);
          }
    }

    public void inorden(NodoAD aux,LinkedList recorrido){
          if (aux != null)
          {
              inorden (aux.getAnterior(),recorrido);
              recorrido.add(aux.getDato());
              inorden (aux.getSiguiente(),recorrido);
          }
    }

    public void postorden(NodoAD aux,LinkedList recorrido){
          if (aux != null)
          {
              postorden (aux.getAnterior(),recorrido);
              postorden (aux.getSiguiente(),recorrido);
              recorrido.add(aux.getDato());
          }
    }

    public void porNivel(NodoAD aux,LinkedList recorrido){
        LinkedList<NodoAD> cola = new LinkedList<NodoAD>();
        cola.addLast(aux);
        while(cola.size()> 0){
            NodoAD tmp = cola.pollFirst();
            recorrido.add(tmp.getDato());
            if(tmp.getAnterior()!=null){
                cola.addLast(tmp.getAnterior());
            }
            if(tmp.getSiguiente()!=null){
                cola.addLast(tmp.getSiguiente());
            } 
        }
    }
    
    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int n) {
        String dato = Integer.toString(n);
        NodoAD aux = raiz;
        while (aux!=null) {
            if (dato==aux.getDato())
                return true;
            else
                if (n>Integer.parseInt(aux.getDato()))
                    aux=aux.getSiguiente();
                else
                    aux=aux.getAnterior();
        }
        return false;
    }
    
    
    private void altura (NodoAD aux,int nivel)  {
        if (aux != null) {    
            altura(aux.getAnterior(),nivel+1);
            alt = nivel;
            altura(aux.getSiguiente(),nivel+1);
        }
    }
    //Devuleve la altura del arbol
    public int getAltura(){
        altura(raiz,1);
        return alt;
    }
}
