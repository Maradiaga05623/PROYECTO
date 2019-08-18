/****ELABORADO POR****/

/*
 *Flavio César Betanco Amaya		
 *Sergio Enrique Pérez Figueroa            
 *Héctor David Maradiaga García           
*/


package Servidor.CampoDefinicion;

public class CampoDefinicion<T> {

	private NodoCampo<T> head;
	private NodoCampo<T> tail;

	//Funciones Creadas apartir de los requerimentos
	public void crear(NodoCampo<T> n) {

		insertarTail(n);
	}

	public String[] getNombre() {
		NodoCampo<T> temp = this.head;

		String[] nombre;
		nombre = new String[this.conteo];
		for (int i = 0; i < this.conteo; i++) {

			nombre[i] = temp.getNombre();
			temp = temp.siguiente;
		}

		return nombre;
	}

	public String setNombre(int n, String nombre) {
		NodoCampo<T> temp = this.head;

		for (int i = 1; i <= n; i++) {
			if (i == n) {
				temp.setNombre(nombre);
			}
			temp = temp.siguiente;
		}

		return nombre;
	}

	public void setDescripcion(int n, T descripcion) {
		NodoCampo<T> temp = this.head;

		for (int i = 1; i <= n; i++) {
			if (i == n) {
				temp.setDescripcion(descripcion);
			}
			temp = temp.siguiente;
		}

	}

	public void setTipoDato(int n, T tipoDato) {
		NodoCampo<T> temp = this.head;

		for (int i = 1; i <= n; i++) {
			if (i == n) {
				temp.setTipoDato(tipoDato);
			}
			temp = temp.siguiente;
		}

	}

	public NodoCampo<T> getHead() {
		return head;
	}

	public NodoCampo<T> getTail() {
		return tail;
	}

	private int conteo;

	/**
	 * Constructor de la ListaPrioridad
	 */
	public CampoDefinicion() {
		this.head = null;
		this.tail = null;
		reiniciarCuenta();
	}

	// Funciones privadas para simplificar tareas
	private void reiniciarCuenta() {
		this.conteo = 0;
	}

	private void incrementarCuenta() {
		this.conteo++;
	}

	private void decrementarCuenta() {
		this.conteo--;
	}

	private void insertarVacia(NodoCampo<T> n) {
		this.head = n;
		this.tail = n;
	}

	private void insertarHeadLlena(NodoCampo<T> n) {
		NodoCampo<T> segundo = this.head;
		n.siguiente = segundo;
		this.head = n;
	}

	private void insertarTailLlena(NodoCampo<T> n) {
		NodoCampo<T> penultimo = this.tail;
		penultimo.siguiente = n;
		this.tail = n;
	}

	private NodoCampo<T> encontrarPenultimoNodo() {
		NodoCampo<T> penultimo = this.head;

		// Entontrar el Nodo que este en la penultima posicion. Recuerden que el conteo
		// comienza en 1.
		for (int i = 1; i < conteo - 1; i++) {
			penultimo = penultimo.siguiente;
		}

		return penultimo;
	}

	/**
	 * Retorna el numero de Nodos que contiene la listaPrioridad enlazada.
	 *
	 * @return Cantidad de Nodos de listaPrioridad enlazada.
	 */
	public int count() {
		return this.conteo;
	}

	/**
	 * Revisa si existen elementos en la listaPrioridad enlazada.
	 *
	 * @return Devuelve true si no hay elementos en la listaPrioridad enlazada
	 */
	public boolean estaVacia() {
		boolean vacia = this.head == null;
		return vacia;
	}

	/**
	 * Elimina todos los elementos que existan en la listaPrioridad enlazada.
	 */
	public void vaciar() {
		this.head = this.tail = null;
		reiniciarCuenta();
	}

	/**
	 * Inserta un Nodo al inicio de la listaPrioridad enlazada (Head).
	 *
	 * @param n Nodo a insertar
	 */
	public void insertarHead(NodoCampo<T> n) {
		if (estaVacia()) {
			insertarVacia(n);
		} else {
			insertarHeadLlena(n);
		}

		incrementarCuenta();
	}

	/**
	 * Inserta un Nodo al final de la listaPrioridad enlazada (Tail).
	 *
	 * @param n Nodo a insertar
	 */
	public void insertarTail(NodoCampo<T> n) {
		if (estaVacia()) {
			insertarVacia(n);
		} else {
			insertarTailLlena(n);
		}

		incrementarCuenta();
	}

	/**
	 * Insertar un nodo en cualquier sitio de la listaPrioridad enlazada.
	 *
	 * @param n Nodo a insertar.
	 * @param previo Nodo que precede al que se inserta.
	 */
	public void insertar(NodoCampo<T> n, NodoCampo<T> previo) {
		// TODO: Debe insertar el Nodo 'n' posterior al nodo 'previo'
	}

	/**
	 * Elimina el primer Nodo de la listaPrioridad enlazada (Head).
	 */
	public void eliminarHead() {
		NodoCampo<T> segundo = this.head.siguiente;
		this.head = segundo;

		decrementarCuenta();
	}

	/**
	 * Elimina el ultimo Nodo de la listaPrioridad enlazada (Tail).
	 */
	public void eliminarTail() {
		NodoCampo<T> penultimo = encontrarPenultimoNodo();
		this.tail = penultimo;
		penultimo.siguiente = null;

		decrementarCuenta();
	}

	/**
	 * Elimina un nodo cualquiera de la listaPrioridad enlazada.
	 *
	 * @param n Nodo a eliminar.
	 * @return Nodo eliminado
	 */
	public NodoCampo<T> retNodo(int n) {
		NodoCampo<T> temp = this.head;
		int i = 1;
		while (temp != null) {
			if (i == n) {
				break;
			}
			temp = temp.siguiente;
			i++;
		}
		return temp;

	}

	public NodoCampo<T> eliminar(int n) {
		// TODO: Buscar al nodo del argumento y removerlo de la listaPrioridad, sin perder los
		// enlaces existentes

		NodoCampo<T> eliminado;
		eliminado = this.retNodo(n);

		if (eliminado == this.head) {
			eliminarHead();
		} else if (eliminado == this.tail) {
			eliminarTail();
		} else {
			NodoCampo<T> elemento = this.head;

			while (elemento != null) {
				if (elemento.siguiente == eliminado) {
					NodoCampo<T> anteriorNodo = elemento;
					// Esto es lo mismo que n.siguiente
					NodoCampo<T> siguienteNodo = elemento.siguiente.siguiente;

					anteriorNodo.siguiente = siguienteNodo;
					break;
				}

				elemento = elemento.siguiente;
			}
			this.decrementarCuenta();
		}

		return eliminado;
	}

}
