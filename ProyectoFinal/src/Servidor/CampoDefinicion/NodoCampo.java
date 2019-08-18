package Servidor.CampoDefinicion;

public class NodoCampo<T> {

	private T nombre;
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
	 * @param dato Contenido del Nodo
	 */
	public NodoCampo(T nombre, T descripcion, T tipoDato) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoDato = tipoDato;
		this.siguiente = null;
	}

	/**
	 * Getter de dato
	 * @return Contenido del Nodo
	 */


	/**
	 * Setter de dato
	 * @param dato Contenido del Nodo
	 */

	/**
	 * Permite al Nodo comportarse como String
	 */
	@Override
	public String toString() {
		return "Nombre: " + this.nombre.toString() + " ,Descripcion: " + this.descripcion + " ,Tipo: " + this.tipoDato;
	}
}