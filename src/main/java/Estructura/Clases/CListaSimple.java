/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

/**
 *
 * @author andre
 */
public class CListaSimple {
    private Nodo head = new Nodo();
    public CListaSimple()
        {
            head = null;
        }

        public void Insertar(String dato)
        {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            if (head == null)
            {
                head = nuevo;
                return;
            }
            if (nuevo.getDato().compareTo(head.getDato()) < 0)
            {
                nuevo.setSiguiente(head);
                head = nuevo;
                return;
            }

            Nodo h = head;
            while (h.getSiguiente() != null)
            {
                if (h.getSiguiente().getDato().compareTo(nuevo.getDato()) > 0)
                {
                    break;
                }
                h = h.getSiguiente();
            }
            nuevo.setSiguiente(h.getSiguiente());
            h.setSiguiente(nuevo);
        }

        public boolean Encontrado(String dato)
        {
            Nodo h = head;
            if (h != null){
                while (h != null){
                    if (h.getDato() == dato){
                        return true;
                    }
                    h = h.getSiguiente();
                }
            }
            return false;
        }

        public void Eliminar(String dato)
        {
            if (head.getDato() == dato)
            {
                head = head.getSiguiente();
            }
            else
            {
                Nodo h = head;
                while (h.getSiguiente() != null)
                {
                    if (h.getSiguiente().getDato() == dato)
                    {
                        h.setSiguiente(h.getSiguiente().getSiguiente());
                    }
                    else
                    {
                        h = h.getSiguiente();
                    }
                }
            }
        }

    @Override
    public String toString() {
        Nodo h = head;
            String cadena = "";
            if(h != null)
            {
                cadena += h.toString() + "\n";
                h = h.getSiguiente();
                while (h != null)
                {
                    cadena += h.toString() + "\n";
                    h = h.getSiguiente();
                }
                return cadena;
            }
            return "La lista está vacía";
    }
        
}
