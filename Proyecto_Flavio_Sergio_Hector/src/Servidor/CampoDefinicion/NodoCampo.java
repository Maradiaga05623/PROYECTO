/****ELABORADO POR****/

/*
 *Flavio César Betanco Amaya		
 *Sergio Enrique Pérez Figueroa            
 *Héctor David Maradiaga García           
*/


package Servidor.CampoDefinicion;

public class NodoCampo<T> {

    private String nombre;
    private T descripcion;
    private T tipoDato;

    // Este atributo queda expuesto a nivel del package
    NodoCampo<T> siguiente;

    /**
     * Constructor que inializa en null el dato y el enlace al siguiente Nodo
     */
    public NodoCampo() {
        this.nombre = null;
        this.descripcion = null;
        this.tipoDato = null;
        this.siguiente = null;
    }

    /**
     * Inializa el dato.
     *
     * @param dato Contenido del Nodo
     */
    public NodoCampo(String nombre, T descripcion, T tipoDato) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoDato = tipoDato;
        this.siguiente = null;
    }

    //Metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public T getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(T descripcion) {
        this.descripcion = descripcion;
    }

    public T getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(T tipoDato) {
        this.tipoDato = tipoDato;
    }

    /**
     * Permite al Nodo comportarse como String
     */
    @Override
    public String toString() {
        return this.nombre.toString();
    }
}
