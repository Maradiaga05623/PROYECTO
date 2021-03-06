/****ELABORADO POR****/

/*
 *Flavio C�sar Betanco Amaya		
 *Sergio Enrique P�rez Figueroa            
 *H�ctor David Maradiaga Garc�a           
*/


package Servidor;

import java.util.ArrayList;

import Servidor.CampoDefinicion.*;

public class Tabla<T> {

	private Nodo<T> head;
	private Nodo<T> tail;
	private String nombre;

	public int countRegistros;
	public CampoDefinicion<T> campoDef;

	//TODO LO NUEVO A PROGRAMAR
	//Devuelve el nombre de la tabla
	public String getNombre() {
		return nombre;
	}

	//Contructor de la tabla, recibe el nombre e inicializa el objeto(Lista) campoDef
	public Tabla(String nombre) {
		this.nombre = nombre;
		this.campoDef = new CampoDefinicion<T>();
		this.reiniciarRegistros();
		this.reiniciarCuenta();
	}

	/**
	 * **AQUI COMIENZA TODO LO RELACIONADO CON LOS CAMPOS*****
	 *
	 */
	//Agrega un campo a la tabla y una definicion de campo
	public void agregarCampo(String nombre, T descripcion, T tipoDato) {

		this.crearCampoDef(nombre, descripcion, tipoDato);

		ArrayList<T> campo = new ArrayList<T>();

		Nodo<T> n = new Nodo<T>(campo);

		this.insertarTail(n);

	}

	//Metodo privado para crear una definici�n de campo
	private void crearCampoDef(String nombre, T descripcion, T tipoDato) {
		NodoCampo<T> nodo = new NodoCampo<T>(nombre, descripcion, tipoDato);
		this.campoDef.crear(nodo);
	}

	//Agrega un valor al campo, dependiendo del numero de campo
	public void modDatoCampo(int n, T dato) {
		ArrayList<T> nodo;
		Nodo<T> temp;

		temp = this.retNodo(n);
		nodo = temp.getDato();

		nodo.add(dato);

	}

	//Modifica un valor de un campo.
	public void actualizarCampo(int r, int n, T dato) {
		ArrayList<T> nodo;
		Nodo<T> temp;

		temp = this.retNodo(n);
		nodo = temp.getDato();

		nodo.set(r, dato);
	}

	//Elimina el dato del campo seleccioneado 
	public void elimDatoCampo(int n, int j) {
		ArrayList<T> nodo;
		Nodo<T> temp;

		temp = this.retNodo(n);
		nodo = temp.getDato();

		nodo.remove(j - 1);

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
			this.decrementarCuenta();
		}

		this.campoDef.eliminar(n);

		return eliminado;
	}

	//Modifica una deficion de campo
	public void modificarCampo(int n, String nombre, T descripcion, T tipoDato) {
		this.campoDef.setNombre(n, nombre);
		this.campoDef.setDescripcion(n, descripcion);
		this.campoDef.setTipoDato(n, tipoDato);
	}

	//Devuelve el nodo(Campo) de acuerdo en la posicion de la lista
	public Nodo<T> retNodo(int n) {
		Nodo<T> temp = this.head;
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

	//Imprime el campo que esta en la posicion solicitada
	public void impCampo(int n) {
		ArrayList<T> nodo;
		Nodo<T> temp;

		temp = this.retNodo(n);

		nodo = temp.getDato();

		for (int i = 0; i < nodo.size(); i++) {
			System.out.println("  " + nodo.get(i));
		}

		/**
		 * ****AQUI TERMINA LO RELACIONADO CON LOS CAMPOS****
		 */
	}

	/**
	 * ***AQUI COMIENZA LO RELACIONADO CON LOS REGISTROS****
	 */
	//Inserta un nuevo registro dentro de la tabla
	public void insertarRegistro(T[] arreglo) {
		T temp;
		int j = 0;

		for (int i = 0; i < arreglo.length; i++) {
			temp = arreglo[i];
			this.modDatoCampo(++j, temp);
		}

		this.incrementarRegistros();
	}

	//Actualiza un registro dentro de la tabla
	public void actualizarRegistro(int n, T[] arreglo) {
		T temp;
		int j = n - 1;

		for (int i = 1; i < arreglo.length; i++) {
			temp = arreglo[i];
			this.actualizarCampo(j, i + 1, temp);
		}
	}

	//Elimina un registro dentro de la tabla
	public void eliminarRegistro(int n) {

		for (int i = 2; i <= this.conteo; i++) {
			this.elimDatoCampo(i, n);
		}

		this.decrementarRegistros();

	}

	//Retorna el registro en un arreglo
	public Object[] retRegistro(int n) {
		Object[] arreglo = new Object[this.conteo];
		ArrayList<T> nodo;
		Nodo<T> temp;
		int j = 0;
		for (int i = 1; i <= this.conteo; i++) {
			temp = this.retNodo(i);
			nodo = temp.getDato();
			arreglo[j] = nodo.get(n);
			j++;
		}

		return arreglo;

	}

	/**
	 * ***AQUI TERMINA LO RELACIONADO CON LOS REGISTROS****
	 */
	//AQUI TERMINA TODO LO NUEVO
	public Nodo<T> getHead() {
		return head;
	}

	public Nodo<T> getTail() {
		return tail;
	}

	private int conteo;

	/**
	 * Constructor de la Tabla
	 */
	public Tabla() {
		this.head = null;
		this.tail = null;
		reiniciarCuenta();
		this.countRegistros = 0;
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

	private void reiniciarRegistros() {
		this.countRegistros = 0;
	}

	private void incrementarRegistros() {
		this.countRegistros++;
	}

	private void decrementarRegistros() {
		this.countRegistros--;
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

}
