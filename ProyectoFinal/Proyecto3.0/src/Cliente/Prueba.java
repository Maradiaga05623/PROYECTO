package Cliente;

import Servidor.Tabla;
public class Prueba {

	public static void main(String[] args) {
		

		Tabla<Object> alumno = new Tabla<Object>();
		Object[] arreglo = null;


		alumno.agregarCampo();
		alumno.agregarCampo();
		alumno.agregarCampo();


		/*alumno.campo.add(12);
		alumno.campo.add(24);
		alumno.campo.add(30);
		alumno.campo.add(30);

		alumno.campo2.add("Flavio");
		alumno.campo2.add("Sergio");*/

		System.out.println("hay " + alumno.count());

		alumno.modificarCampo(1, 20);
		alumno.modificarCampo(1, 20);
		alumno.modificarCampo(2, "Sergio");
		alumno.modificarCampo(2, "Flavio");
		alumno.modificarCampo(3, "20161005353");
		alumno.modificarCampo(3, "20161005454");
   System.out.println("*************************");

		alumno.impCampo(1);
		alumno.impCampo(2);
		alumno.impCampo(3);
		
		alumno.eliminarCampo(3);
		
		alumno.impCampo(1);
		alumno.impCampo(2);
		alumno.impCampo(3);
		
		System.out.println("hay " + alumno.count());
		
		
		//Para agregar registros
		arreglo =new Object[alumno.count()];
		arreglo[0] = "27";
		arreglo[1] = "Hector";
		arreglo[2] = "19981002000";
		
		
		alumno.insertarRegistro(arreglo);
		
		
		arreglo[0] = "09";
		arreglo[1] = "Milton";
		arreglo[2] = "20001000929";
		
		alumno.insertarRegistro(arreglo);
		
	
		System.out.println("hay " + alumno.count());
		
		alumno.impCampo(1);
		alumno.impCampo(2);
		alumno.impCampo(3);
		
		arreglo[0] = "26";
		arreglo[1] = "Cristhian";
		arreglo[2] = "19941002602";
		
		alumno.actualizarRegistro(3, arreglo);
		
		System.out.println("******el Ultimo******");
		alumno.impCampo(1);
		alumno.impCampo(2);
		alumno.impCampo(3);
		





	}

}
