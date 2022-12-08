/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CListaDoble {
    private NodoAD head;
    public CListaDoble()
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
                return;
            }
            if(nuevo.getDato().compareTo(head.getDato()) < 0)
            {
                nuevo.setSiguiente(head);
                head.setAnterior(nuevo);
                head = nuevo;
                return;
            }
            NodoAD h = head;
            while(h.getSiguiente() != null)
            {
                if(nuevo.getDato().compareTo(h.getSiguiente().getDato()) < 0)
                {
                    break;
                }
                h = h.getSiguiente();
            }
            nuevo.setSiguiente(h.getSiguiente());
            nuevo.setAnterior(h);
            if (h.getSiguiente() != null)
            {
                h.getSiguiente().setAnterior(nuevo);
            }
            h.setSiguiente(nuevo);
        }

        public void Eliminar(String dato)
        {
            if (head != null)
            {
                if (head.getDato() == dato)
                {

                    head = head.getSiguiente();
                    head.setAnterior(null);
                    return;
                }
                NodoAD h = head;

                while (h.getSiguiente() != null)
                {
                    if (h.getSiguiente().getDato() == dato)
                    {
                        break;
                    }
                    h = h.getSiguiente();
                }
                if (h.getSiguiente().getSiguiente() == null)
                {
                    h.setSiguiente(null);
                }
                else
                {
                    h.setSiguiente(h.getSiguiente().getSiguiente());
                    h.getSiguiente().setAnterior(h);

                }
            }
        }
        public boolean Buscar(String dato)
        {
            NodoAD h = head;
            if (h != null)
            {
                while (h != null)
                {
                    if (h.getDato() == dato)
                    {
                        return true;
                    }
                    h = h.getSiguiente();
                }
            }
            return false;
        }

    @Override
    public String toString() {
        NodoAD h = head;
            String cadena = "";
            if (h != null)
            {
                cadena += h.toString() + "\r\n";
                h = h.getSiguiente();
                while (h != null)
                {
                    cadena += h.toString() + "\r\n";
                    h = h.getSiguiente();
                }
                return cadena;
            }
            return "La lista está vacía";
    }
        
}
