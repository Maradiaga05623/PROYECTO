package Servidor.CampoDefinicion;

public class CampoDefinicion<T> {

	private NodoCampo<T> head;
	private NodoCampo<T> tail;
	
	//Funciones Creadas apartir de los requerimentos

	public void crear(NodoCampo<T> n) {
		
		insertarTail(n);
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
	public NodoCampo<T> eliminar(NodoCampo<T> n) {
		// TODO: Buscar al nodo del argumento y removerlo de la listaPrioridad, sin perder los
		// enlaces existentes
		NodoCampo<T> eliminado = n;

		if (n == this.head) {
			eliminarHead();
		} else if (n == this.tail) {
			eliminarTail();
		} else {
			NodoCampo<T> elemento = this.head;

			while (elemento != null) {
				if (elemento.siguiente == n) {
					NodoCampo<T> anteriorNodo = elemento;
					// Esto es lo mismo que n.siguiente
					NodoCampo<T> siguienteNodo = elemento.siguiente.siguiente;

					anteriorNodo.siguiente = siguienteNodo;
					break;
				}

				elemento = elemento.siguiente;
			}
		}

		if (eliminado != null) {
			decrementarCuenta();
		}

		return eliminado;
	}

	/*public Nodo<T> buscarDato(T dato) {
		Nodo<T> hallado = null;
		Nodo<T> elemento = this.head;

		while (elemento != null) {
			if (dato.equals(elemento.getDato())) {
				hallado = elemento;
				break;
			}

			elemento = elemento.siguiente;
		}

		return hallado;
	}*/

	/**
	 * Muestra la listaPrioridad enlazada, identificando el primer elemento (H) y al ultimo elemento (T).
	 */
	public void display() {
		System.out.println("Existen " + this.conteo + " campos");

		NodoCampo<T> temp = this.head;

		while (temp != null) {
			if (temp == this.head) {
				System.out.println(temp);
			} else if (temp == this.tail) {
				System.out.println(temp);
			} else {
				System.out.println(temp);
			}

			temp = temp.siguiente;
		}
		System.out.println("");
	}



}

