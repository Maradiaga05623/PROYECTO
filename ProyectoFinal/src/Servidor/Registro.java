package Servidor;

public class Registro<T> {
	
	Tabla<T> tabla;
	
	public Registro() {
		
	}
	
	public void insertarRegistro(T[] arreglo) {
		T temp;
		int j=0;
		
		for(int i = 0; i<arreglo.length; i++) {
			temp = arreglo[i];
			this.tabla.modificarCampo(++j, temp);
		}
		
	}

}
