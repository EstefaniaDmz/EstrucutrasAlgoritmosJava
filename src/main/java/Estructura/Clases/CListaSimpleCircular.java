/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CListaSimpleCircular {
    private Nodo head;
        public CListaSimpleCircular()
        {
            head = null;
        }
        public void Agregar(String dato)
        {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            if(head == null)
            {
                nuevo.setSiguiente(nuevo);
                head = nuevo;
                return;
            }
            Nodo h = head;
            if (nuevo.getDato().compareTo(head.getDato()) < 0)
            {
                while(h.getSiguiente() != head)
                {
                    h = h.getSiguiente();
                }
                h.setSiguiente(nuevo);
                nuevo.setSiguiente(head);
                head = nuevo;
                return;
            }
            while(h.getSiguiente() != head)
            {
                if (nuevo.getDato().compareTo(h.getSiguiente().getDato()) < 0)
                {
                    break;
                }
                h = h.getSiguiente();
            }
            nuevo.setSiguiente(h.getSiguiente());
            h.setSiguiente(nuevo);
        }
        public Boolean Buscar(String dato)
        {
            Nodo h = head;
            if (h != null)
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
            if (head != null)
            {
                Nodo h = head;
                if(head.getDato() == dato)
                {
                    while (h.getSiguiente() != head)
                    {
                        h = h.getSiguiente();
                    }
                    if (head.getSiguiente() == head)
                    {
                        head = null;
                        return;
                    }
                    head = head.getSiguiente();
                    h.setSiguiente(head);
                    return;
                }
                while(h.getSiguiente().getDato() != dato)
                {
                    h = h.getSiguiente();
                }
                h.setSiguiente(h.getSiguiente().getSiguiente());
            }
        }

    @Override
    public String toString() {
        Nodo h = head;
            String cadena = "";
            if (h != null)
            {
                cadena += h.toString() + "\r\n";
                h = h.getSiguiente();
                while (h != head)
                {
                    cadena += h.toString() + "\r\n";
                    h = h.getSiguiente();
                }
                return cadena;
            }
            return "La lista está vacía";
    }
        
}
