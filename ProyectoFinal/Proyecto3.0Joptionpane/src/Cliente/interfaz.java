package Cliente;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Servidor.Tabla;

public class interfaz {

	
	
	
	public static void main(String[] args) {
		
		Tabla<Object> alumno = new Tabla<Object>();
		Object[] arreglo = null;
		
		
		int opcion= 0; 
		
		int opcion2=0;
		
		Object pantalla = "";
		
		int registro = 1 ; 
	
		while(opcion != 7){
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
	                    "Menu de Opciones\n\n"
	                    + "1. TABLA  \n"
	                    + "2. Insertar   Registro\n "
	                    + "3. Actualizar Registro \n"
	                    + "4. Eliminar   Registro\n"
	                    + "5. Modificar  Registro\n"
	                    + "6. Mostrar    Registros\n"
	                    + "7. Salir.\n\n"));
						
					switch(opcion) {
					
					case 1:
						
						while (opcion2 !=5) {
							try { 
								opcion2 =Integer.parseInt(JOptionPane.showInputDialog(null,
					                    "Menu de Opciones\n\n"
					    	                    + "1. Agregar   Campo \n"
					    	                    + "2. Modificar Campo \n "
					    	                    + "3. Eliminar  Campo \n"
					    	                    + "4. Mostrar Tabla\n" 
					    	                    + "5. Salir\n"));
					    	                
					    	    switch(opcion2) {
					    	    
					    	    case 1: 
					    	    	
					    	    	alumno.agregarCampo();
					    	    	//Agregar Campo a la tabla 
					    	    	pantalla = JOptionPane.showInputDialog(null, 
		                            "Ingrese el nombre de el campo ");
					    	    	
					    	    	alumno.modificarCampo(registro, pantalla);
					    	    	
					    	    	//alumno.impCampo(1);
						 
					    	    	 pantalla = JOptionPane.showInputDialog(null, 
					                            "Tipo de dato de del campo") ;

					    	    	 break; 
					    	    	 
					    	    	 
					    	    case 2:
					    	    	
					    	    	//Modificar campo
					    	    	break; 
					    	    	
					    	    case 3 : 
					    	    	//eliminar campo
					    	    	break ;
					    	    	
					    	    case 4:
					    	    	//salir 
					    	    	alumno.impCampo(registro);
					    	    	break;
					    	    case 5:
					    	    	break;
					    	    default : 
					    	    		JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve intentar nuevamente.");
				                    break;	
					    	    }
						 
							}catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Error:"+e);
							}
				
						}
						
	                    break;
	                    
					case 2:
						pantalla = (JOptionPane.showInputDialog(null, 
	                            "Porfavor ingresa el articulo"));
						//tienda.PromoverProducto(pantalla);
						break;
					case 3:
						
						//tienda.Display();
						break;
					case 4:
					registro = Integer.parseInt(JOptionPane.showInputDialog(null, 
	                            "Porfavor ingrese el codigo del producto",JOptionPane.INFORMATION_MESSAGE));
					//	tienda.BuscarProducto(registro);
						break;
					case 5:
						
						
					case 6: 
						
					case 7 : 
						break ; 
		
						
	                    
					default: 
						JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve intentar nuevamente.");
	                    break;
						
					}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error:"+e);

				
			}
			
		
		
	}

	}
}
