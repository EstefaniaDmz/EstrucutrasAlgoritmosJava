/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo.Clases;

import Estructura.Clases.NodoAD;

/**
 *
 * @author andre
 */
public class COrdenamientoAB {
    private NodoAD raiz = new NodoAD();
        public COrdenamientoAB()
        {
            raiz = null;
        }
        public void Insertar(int nuevoDato, boolean invertido)
        {
            if (invertido)
            {
                raiz = InsertarInvertido(raiz, nuevoDato);
                return;
            }
            raiz = Insertar(raiz, nuevoDato);
        }

        private NodoAD Insertar(NodoAD raiz, int nuevoDato)
        {
            String dato = Integer.toString(nuevoDato);
            if (raiz == null)
            {
                raiz = new NodoAD(dato);
                return raiz;
            }
            if (Integer.parseInt(raiz.getDato()) > nuevoDato)
            {
                raiz.setAnterior(Insertar(raiz.getAnterior(), nuevoDato));
                return raiz;
            }
            if (Integer.parseInt(raiz.getDato()) < nuevoDato)
            {
                raiz.setSiguiente(Insertar(raiz.getSiguiente(), nuevoDato));
                return raiz;
            }
            return raiz;
        }
        private NodoAD InsertarInvertido(NodoAD raiz, int nuevoDato)
        {
            String dato = Integer.toString(nuevoDato);
            if (raiz == null)
            {
                raiz = new NodoAD(dato);
                return raiz;
            }
            if (Integer.parseInt(raiz.getDato()) < nuevoDato)
            {
                raiz.setAnterior(Insertar(raiz.getSiguiente(), nuevoDato));
                return raiz;
            }
            if (Integer.parseInt(raiz.getDato()) > nuevoDato)
            {
                raiz.setSiguiente(Insertar(raiz.getAnterior(), nuevoDato));
                return raiz;
            }
            return raiz;
        }

    public String Acomodo(){
        return Enorder(raiz, "");
    }
    private String Enorder(NodoAD reco, String cadena){
        if(reco != null){
            Enorder(reco.getAnterior(), cadena);
            cadena += reco.getDato() + ", ";
            Enorder(reco.getSiguiente(), cadena);
        }
        return cadena;
    }
}
