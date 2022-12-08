/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CListaDobleCircular {
    private NodoAD head;
        public CListaDobleCircular()
        {
            head = null;
        }
        public void Agregar(String dato)
        {
            NodoAD nuevo = new NodoAD();
            nuevo.setDato(dato);
            if(head == null)
            {
                head = nuevo;
                head.setAnterior(head);
                head.setSiguiente(head);
                return;
            }
            if (nuevo.getDato().compareTo(head.getDato()) < 0)
            {
                head.getAnterior().setSiguiente(nuevo);
                nuevo.setAnterior(head.getAnterior());
                nuevo.setSiguiente(head);
                head.setAnterior(nuevo);
                head = nuevo;
                return;
            }
            NodoAD h = head;
            while (h.getSiguiente() != head)
            {
                if (h.getSiguiente().getDato().compareTo(nuevo.getDato()) > 0)
                {
                    break;
                }
                h = h.getSiguiente();
            }
            h.getSiguiente().setAnterior(nuevo);
            nuevo.setAnterior(h);
            nuevo.setSiguiente(h.getSiguiente());
            h.setSiguiente(nuevo);
        }
        public Boolean Buscar(String dato)
        {
            NodoAD h = head;
            if (head != null)
            {
                do
                {
                    if (h.getDato() == dato)
                    {
                        return true;
                    }
                    h = h.getSiguiente();
                } while (h != head);
            }
            return false;
        }
        public void Eliminar(String dato)
        {
            NodoAD h = head;
            while (h.getSiguiente() != head)
            {
                if (h.getDato() == dato)
                {
                    break;
                }
                h = h.getSiguiente();
            }
            h.getAnterior().setSiguiente(h.getSiguiente());
            h.getSiguiente().setAnterior(h.getAnterior());
            if (h == head)
            {
                head = head.getSiguiente();
            }
        }

    @Override
    public String toString() {
        NodoAD h = head;
            String cadena = "";
            if (h != null)
            {
                cadena += h.toString() + "\n";
                h = h.getSiguiente();
                while (h != head)
                {
                    cadena += h.toString() + "\n";
                    h = h.getSiguiente();
                }
                return cadena;
            }
            return "La lista está vacía";
    }
        
}
