/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CPila {
    Nodo top;
        public CPila()
        {
            top = null;
        }

        public void Push(String dato)
        {
            Nodo n = new Nodo();
            n.setDato(dato);
            n.setSiguiente(top);
            top = n;
        }

        public Nodo Pop()
        {
            Nodo regreso = top;
            if (top != null)
            {
                top = top.getSiguiente();
            }
            return regreso;
        }

    @Override
    public String toString() {
        String stringPila = "";
            Nodo t = top;
            if (t != null)
            {
                stringPila += t.toString();
                t = t.getSiguiente();
                while (t != null)
                {
                    stringPila += "\n" + t.toString();
                    t = t.getSiguiente();
                }
                return stringPila;
            }
            else
            {
                return "La pila esta vacia";
            }
    }
        
}
