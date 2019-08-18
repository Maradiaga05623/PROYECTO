package Servidor;

import java.util.ArrayList;

public class Tabla<T> {
	private Nodo<T> head;
	private Nodo<T> tail;
	
	Registro<T> registro;

	//TODO LO NUEVO A PROGRAMAR

	/****AQUI COMIENZA TODO LO RELACIONADO CON LOS CAMPOS******/
	public void agregarCampo() {
		ArrayList<T> campo = new ArrayList<T>();

		Nodo<T> n = new Nodo<T>(campo);

		this.insertarTail(n);

	}
	
	//Agrega un valor al campo, dependiendo del numero de campo
	public void modificarCampo(int n, T dato) {
		ArrayList<T> nodo;
		Nodo<T> temp;

		temp = this.retNodo(n);
		nodo = temp.getDato();

		nodo.add(dato);

	}
	
	//Modifica un valor de un campo.
	public void actualizarCampo(int r, int n , T dato) {
		ArrayList<T> nodo;
		Nodo<T> temp;

		temp = this.retNodo(n);
		nodo = temp.getDato();

		nodo.set(r, dato);

	}
	
	//Elimina un campo, conociendo la posicion del campo
	public Nodo<T> eliminarCampo(int n) {
		// TODO: Buscar al nodo del argumento y removerlo de la listaPrioridad, sin perder los
		// enlaces existentes
		Nodo<T> eliminado;
		eliminado = this.retNodo(n);


		if (eliminado == this.head) {
			eliminarHead();
		} else if (eliminado == this.tail) {
			eliminarTail();
		} else {
			Nodo<T> elemento = this.head;

			while (elemento != null) {
				if (elemento.siguiente == eliminado) {
					Nodo<T> anteriorNodo = elemento;
					// Esto es lo mismo que n.siguiente
					Nodo<T> siguienteNodo = elemento.siguiente.siguiente;

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

	//Devuelve el nodo de acuerdo en la posicion de la lista
	public Nodo<T> retNodo(int n){
		Nodo<T> temp =  this.head;

		for (int i = 1; i < n; i++) {
			temp = temp.siguiente;
		}

		return temp;

	}

	//Imprimie el campo que esta en la posicion solicitada
	public void impCampo(int n) {
		ArrayList<T> nodo;
		Nodo<T> temp;
		if(this.retNodo(n)==null) {
			System.out.println("NO EXISTE CAMPO");
		}
		else {

		temp = this.retNodo(n);

		nodo = temp.getDato();

		for(int i = 0;i<nodo.size();i++){
			System.out.println("  " + nodo.get(i));
		}
		}
		
	/******AQUI TERMINA LO RELACIONADO CON LOS CAMPOS*/		
		
	}
	
	/*****AQUI COMIENZA LO RELACIONADO CON LOS REGISTROS*****/
	
	//Inserta un nuevo registro dentro de la tabla
	public void insertarRegistro(T[] arreglo) {
		T temp;
		int j=0;
		
		for(int i = 0; i<arreglo.length; i++) {
			temp = arreglo[i];
			this.modificarCampo(++j, temp);
		}	
	}
	
	
	//Actualiza un registro dentro de la tabla
	public void actualizarRegistro(int n, T[] arreglo) {
		T temp;
		int j = n-1;
		
		for(int i = 0; i<arreglo.length; i++) {
			temp = arreglo[i];
			this.actualizarCampo(j, i+1, temp);
		}
	}

	//AQUI TERMINA TODO LO NUEVO

	public Nodo<T> getHead() {
		return head;
	}

	public Nodo<T> getTail() {
		return tail;
	}

	private int conteo;

	/**
	 * Constructor de la ListaPrioridad
	 */
	public Tabla() {
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

	private void insertarVacia(Nodo<T> n) {
		this.head = n;
		this.tail = n;
	}

	private void insertarHeadLlena(Nodo<T> n) {
		Nodo<T> segundo = this.head;
		n.siguiente = segundo;
		this.head = n;
	}

	private void insertarTailLlena(Nodo<T> n) {
		Nodo<T> penultimo = this.tail;
		penultimo.siguiente = n;
		this.tail = n;
	}

	private Nodo<T> encontrarPenultimoNodo() {
		Nodo<T> penultimo = this.head;

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
	public void insertarHead(Nodo<T> n) {
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
	public void insertarTail(Nodo<T> n) {
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
	public void insertar(Nodo<T> n, Nodo<T> previo) {
		// TODO: Debe insertar el Nodo 'n' posterior al nodo 'previo'
	}

	/**
	 * Elimina el primer Nodo de la listaPrioridad enlazada (Head).
	 */
	public void eliminarHead() {
		Nodo<T> segundo = this.head.siguiente;
		this.head = segundo;

		decrementarCuenta();
	}

	/**
	 * Elimina el ultimo Nodo de la listaPrioridad enlazada (Tail).
	 */
	public void eliminarTail() {
		Nodo<T> penultimo = encontrarPenultimoNodo();
		this.tail = penultimo;
		penultimo.siguiente = null;

		decrementarCuenta();
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
		System.out.printf("Existen %d elementos:%n", this.conteo);

		Nodo<T> temp = this.head;

		while (temp != null) {
			if (temp == this.head) {
				System.out.printf("%s(H) -> ", temp);
			} else if (temp == this.tail) {
				System.out.printf("%s(T)%n", temp);
			} else {
				System.out.printf("%s -> ", temp);
			}

			temp = temp.siguiente;
		}
		System.out.println("");
	}


}
