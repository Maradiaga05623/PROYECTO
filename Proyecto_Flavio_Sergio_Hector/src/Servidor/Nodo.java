/****ELABORADO POR****/

/*
 *Flavio César Betanco Amaya		
 *Sergio Enrique Pérez Figueroa            
 *Héctor David Maradiaga García           
*/

package Servidor;

import java.util.ArrayList;

public class Nodo<T> {

    private ArrayList<T> dato;

    // Este atributo queda expuesto a nivel del package
    public Nodo<T> siguiente;

    /**
     * Constructor que inializa en null el dato y el enlace al siguiente Nodo
     */
    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    /**
     * Inializa el dato.
     *
     * @param dato Contenido del Nodo
     */
    public Nodo(ArrayList<T> dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Getter de dato
     *
     * @return Contenido del Nodo
     */
    public ArrayList<T> getDato() {
        return dato;
    }

    /**
     * Setter de dato
     *
     * @param dato Contenido del Nodo
     */
    public void setDato(ArrayList<T> dato) {
        this.dato = dato;
    }

    /**
     * Permite al Nodo comportarse como String
     */
    @Override
    public String toString() {
        return "Nodo: " + this.dato.toString();
    }
}
