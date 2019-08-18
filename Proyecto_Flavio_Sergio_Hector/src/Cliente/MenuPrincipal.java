/****ELABORADO POR****/

/*
 *Flavio CÈsar Betanco Amaya		
 *Sergio Enrique PÈrez Figueroa            
 *HÈctor David Maradiaga GarcÌa           
*/


package Cliente;

import Servidor.Tabla;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flavio Betanco
 */
public class MenuPrincipal extends javax.swing.JFrame {

	public Tabla<Object> tabla;
	public String campoCant;
	private int cCrearTab = 0;
	private int cImpTab = 0;
	private int cCreCamp = 0;
	private int cInsReg = 0;
	private int m = 0;
	private int k = 0;

	public MenuPrincipal() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);

		tabla = new Tabla<Object>();

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jLTabla = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLCampo = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLRegistro = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLTitutoTab = new javax.swing.JLabel();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMCrearTabla = new javax.swing.JMenu();
		jMCrearCampo = new javax.swing.JMenu();
		jMModificarCampo = new javax.swing.JMenu();
		jMEliminarCampo = new javax.swing.JMenu();
		jMInsertarRegistro = new javax.swing.JMenu();
		jMEliminarRegistro = new javax.swing.JMenu();
		jMActualizarRegistro = new javax.swing.JMenu();
		jMImpTabla = new javax.swing.JMenu();
		jMenu1 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Men√∫ Principal"));

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
		jLabel1.setText("Sistema Gestor de Bases de Datos No Persistente");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(102, 102, 102)
						.addComponent(jLabel1)
						.addContainerGap(361, Short.MAX_VALUE))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1)
						.addContainerGap(21, Short.MAX_VALUE))
				);

		jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen"));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {

				},
				new String [] {

				}
				));
		jTable1.setToolTipText("");
		jScrollPane1.setViewportView(jTable1);

		jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
		jLabel4.setText("Estructura de la Tabla");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
						.addContainerGap(107, Short.MAX_VALUE)
						.addComponent(jLabel4)
						.addGap(82, 82, 82))
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addGroup(jPanel5Layout.createSequentialGroup()
										.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLTabla)
												.addComponent(jLCampo)
												.addComponent(jLRegistro))
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap())
				);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLTabla)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jLCampo)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jLRegistro)
						.addGap(43, 43, 43)
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {

				},
				new String [] {

				}
				));
		jScrollPane2.setViewportView(jTable2);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
						.addContainerGap())
				);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
						.addContainerGap())
				);

		jLTitutoTab.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGap(723, 723, 723)
										.addComponent(jLTitutoTab)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLTitutoTab)
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
				);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		jMCrearTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CrearTabla.jpg"))); // NOI18N
		jMCrearTabla.setText("Crear Tabla");
		jMCrearTabla.setMargin(new java.awt.Insets(5, 10, 10, 30));
		jMCrearTabla.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickCrearTabla(evt);
			}
		});
		jMenuBar2.add(jMCrearTabla);

		jMCrearCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agrregar.png"))); // NOI18N
		jMCrearCampo.setText("Crear Campo");
		jMCrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickCrearCampo(evt);
			}
		});
		jMenuBar2.add(jMCrearCampo);

		jMModificarCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ModificarCampo.png"))); // NOI18N
		jMModificarCampo.setText("Modificar Campo");
		jMModificarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickModCampo(evt);
			}
		});
		jMenuBar2.add(jMModificarCampo);

		jMEliminarCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
		jMEliminarCampo.setText("Eliminar Campo");
		jMEliminarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickElimCampo(evt);
			}
		});
		jMenuBar2.add(jMEliminarCampo);

		jMInsertarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agrregar.png"))); // NOI18N
		jMInsertarRegistro.setText("Insertar Registro");
		jMInsertarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickInsertRegistro(evt);
			}
		});
		jMenuBar2.add(jMInsertarRegistro);

		jMEliminarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
		jMEliminarRegistro.setText("Eliminar Registro");
		jMEliminarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickElimRegistro(evt);
			}
		});
		jMenuBar2.add(jMEliminarRegistro);

		jMActualizarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ActualizarRegistro.png"))); // NOI18N
		jMActualizarRegistro.setText("Actualizar Registro");
		jMActualizarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickActRegistro(evt);
			}
		});
		jMenuBar2.add(jMActualizarRegistro);

		jMImpTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Imprimir.png"))); // NOI18N
		jMImpTabla.setText("Imprimir Tabla");
		jMImpTabla.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickImpTabla(evt);
			}
		});
		jMenuBar2.add(jMImpTabla);

		jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.jpg"))); // NOI18N
		jMenu1.setText("Salir");
		jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clickCerrar(evt);
			}
		});
		jMenuBar2.add(jMenu1);

		setJMenuBar(jMenuBar2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void clickCrearTabla(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCrearTabla

		if (cCrearTab == 0) {
			String respuesta = JOptionPane.showInputDialog("Ingrese el nombre de la Tabla");

			while ((respuesta == null) || (respuesta.equals(""))) {
				respuesta = JOptionPane.showInputDialog("Es obligatorio ingresar el nombre, ingreselo de nuevo");
			}
			tabla = new Tabla<Object>(respuesta);
			JOptionPane.showMessageDialog(null, "Tabla " + this.tabla.getNombre() + " creada");

			jLTabla.setText("**Se creo la tabla " + this.tabla.getNombre());
			jLTitutoTab.setText("Tabla " + this.tabla.getNombre());

			jMCrearTabla.setEnabled(false);
			cCrearTab++;
		} else {
			JOptionPane.showMessageDialog(null, "Ya se creo una tabla con el nombre " + tabla.getNombre());
		}


	}//GEN-LAST:event_clickCrearTabla

	private void clickCrearCampo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCrearCampo
		String nombre;
		String descripcion;
		String tipoDato;
		DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
		String[] nombreCampo;

		if (this.cCrearTab == 0) {
		JOptionPane.showMessageDialog(null, "Primero debe crear una tabla!");//modificado el 17/08/19 11:06pm
		} else if (this.tabla.countRegistros == 0) {

			nombre = JOptionPane.showInputDialog("Ingrese el nombre del campo ");
			descripcion = JOptionPane.showInputDialog("Ingrese la descripci√≥n del campo ");
			tipoDato = JOptionPane.showInputDialog("Ingrese el tipo de dato del campo ");

			if (m == 0) {
				tabla.agregarCampo("registroId", "Id. Registro", "Int");
			}
			tabla.agregarCampo(nombre, descripcion, tipoDato);
			JOptionPane.showMessageDialog(null, "Campo " + nombre + " agregado correctamente");

			modelo.setRowCount(0);
			modelo.setColumnCount(0);
			nombreCampo = tabla.campoDef.getNombre();
			for (int j = 0; j < this.tabla.count(); j++) {

				modelo.addColumn(nombreCampo[j]);

			}

			jLCampo.setText("**Se cre√≥ el campo " + nombre);
			m++;
		} else {
			JOptionPane.showMessageDialog(null, "Ya no puede agregar mas campos");
		}


	}//GEN-LAST:event_clickCrearCampo

	private void clickCerrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickCerrar
		this.dispose();
	}//GEN-LAST:event_clickCerrar

	private void clickInsertRegistro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickInsertRegistro

		if (this.cCrearTab == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear una tabla");
		} else if (this.tabla.count() == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear al menos un campo");
		} else {
			String[] nombreCampo = this.tabla.campoDef.getNombre();
			Object[] arreglo;
			arreglo = new Object[nombreCampo.length];

			for (int j = 0; j < arreglo.length; j++) {
				if (j == 0) {
					arreglo[j] = ++k;
					j++;
				}
				String entrada;
				entrada = JOptionPane.showInputDialog("Ingrese el " + nombreCampo[j]);
				arreglo[j] = entrada;
			}

			this.tabla.insertarRegistro(arreglo);

			JOptionPane.showMessageDialog(null, "Registro Insertado correctamente");
			this.clickImpTabla(evt);
			jMCrearCampo.setEnabled(false);
			jMEliminarCampo.setEnabled(false);
			jMModificarCampo.setEnabled(false);
			jLRegistro.setText("**Se ingreso un nuevo registro ");
			cInsReg++;
		}

	}//GEN-LAST:event_clickInsertRegistro

	private void clickImpTabla(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickImpTabla

		DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
		modelo.setRowCount(0);
		modelo.setColumnCount(0);
		String[] nombreCampo = tabla.campoDef.getNombre();

		if (this.cImpTab == 0) {

			for (int j = 0; j < tabla.count(); j++) {

				modelo.addColumn(nombreCampo[j]);

			}

			for (int j = 0; j < tabla.countRegistros; j++) {

				((DefaultTableModel) jTable2.getModel()).addRow(tabla.retRegistro(j));
			}
		} else {

			for (int j = 0; j < tabla.count(); j++) {

				modelo.addColumn(nombreCampo[j]);

			}

			for (int j = 0; j < tabla.countRegistros; j++) {
				((DefaultTableModel) jTable2.getModel()).addRow(tabla.retRegistro(j));
			}
		}

		this.cImpTab++;
	}//GEN-LAST:event_clickImpTabla

	private void clickElimRegistro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickElimRegistro

		if (this.tabla.countRegistros == 0) {
			JOptionPane.showMessageDialog(null, "No existen registros");
		} else {
			String entrada;
			entrada = JOptionPane.showInputDialog("Ingrese el numero de registro que desea eliminar");
			int regElim = Integer.parseInt(entrada);

			if (regElim <= 0) {
				JOptionPane.showMessageDialog(null, "El registro " + regElim + " no existe");
			} else if (this.tabla.countRegistros > 0) {

				if (regElim <= this.tabla.countRegistros) {
					this.tabla.eliminarRegistro(regElim);

					this.clickImpTabla(evt);
					jLRegistro.setText("**Registro eliminado ");
					JOptionPane.showMessageDialog(null, "Registro eliminado");
				} else {
					JOptionPane.showMessageDialog(null, "El registro " + regElim + " No existe");
				}

			} else {
				JOptionPane.showMessageDialog(null, "No existen registros");
			}

		}
	}//GEN-LAST:event_clickElimRegistro

	private void clickElimCampo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickElimCampo
		DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
		String[] nombreCampo;

		if (this.cCrearTab == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear una tabla");
		} else if (this.tabla.count() == 0) {
			JOptionPane.showMessageDialog(null, "Error, no ha creado ningun campo");
		} else if (this.tabla.countRegistros > 0) {
			JOptionPane.showMessageDialog(null, "Ya no puede eliminar algun campo");
		} else {
			String entrada;
			entrada = JOptionPane.showInputDialog("Ingrese el numero del campo que desea eliminar");

			int num = Integer.parseInt(entrada);

			if (num == 1) {
				JOptionPane.showMessageDialog(null, "No puede eliminar el campo registroId");
			} else if (num > this.tabla.count() || num <= 0) {
				JOptionPane.showMessageDialog(null, "No exite el campo " + num);
			} else {
				this.tabla.eliminarCampo(num);
				JOptionPane.showMessageDialog(null, "Campo Eliminado");

				modelo.setRowCount(0);
				modelo.setColumnCount(0);
				nombreCampo = tabla.campoDef.getNombre();
				for (int j = 0; j < this.tabla.count(); j++) {

					modelo.addColumn(nombreCampo[j]);

				}

				jLCampo.setText("**Se elimino un campo ");
			}
		}
	}//GEN-LAST:event_clickElimCampo

	private void clickActRegistro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickActRegistro

		if (this.cCrearTab == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear una tabla");
		} else if (this.tabla.count() == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear al menos un campo");
		} else {
			String[] nombreCampo = this.tabla.campoDef.getNombre();

			Object[] arreglo;
			arreglo = new Object[this.tabla.count()];
			String entrada;
			int num;

			entrada = JOptionPane.showInputDialog("Ingrese el Id del registro que desea actualizar");
			num = Integer.parseInt(entrada);
			for (int i = 1; i < arreglo.length; i++) {

				entrada = JOptionPane.showInputDialog("Ingrese el " + nombreCampo[i]);
				arreglo[i] = entrada;
			}

			this.tabla.actualizarRegistro(num, arreglo);
			this.clickImpTabla(evt);
			jLRegistro.setText("**Se actualiz√≥ el registro " + num);
			JOptionPane.showMessageDialog(null, "Registro actualizado");
		}


	}//GEN-LAST:event_clickActRegistro

	private void clickModCampo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickModCampo
		DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

		String entrada;
		String nombre;
		String descripcion;
		String tipoDato;
		int num;
		String[] nombreCampo;

		if (this.cCrearTab == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear una tabla");
		} else if (this.tabla.count() == 0) {
			JOptionPane.showMessageDialog(null, "Error, debe crear al menos un campo");
		} else if (this.tabla.countRegistros > 0) {
			JOptionPane.showMessageDialog(null, "Ya no puede modificar algun campo");
		} else {
			entrada = JOptionPane.showInputDialog("Ingrese el numero de campo que desea modificar ");
			num = Integer.parseInt(entrada);

			if (num == 1) {
				JOptionPane.showMessageDialog(null, "No puede modificar el campo registroId");
			} else if (num > this.tabla.count() || num <= 0) {
				JOptionPane.showMessageDialog(null, "No exite el campo " + num);
			} else {

				nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
				descripcion = JOptionPane.showInputDialog("Ingrese la descripcion ");
				tipoDato = JOptionPane.showInputDialog("Ingrese el tipo de dato ");
				this.tabla.modificarCampo(num, nombre, descripcion, tipoDato);

				modelo.setRowCount(0);
				modelo.setColumnCount(0);
				nombreCampo = tabla.campoDef.getNombre();
				for (int j = 0; j < this.tabla.count(); j++) {

					modelo.addColumn(nombreCampo[j]);

				}
				jLCampo.setText("**Campo modificado ");
			}
		}

	}//GEN-LAST:event_clickModCampo

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MenuPrincipal().setVisible(true);
			}
		});


	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLCampo;
	private javax.swing.JLabel jLRegistro;
	private javax.swing.JLabel jLTabla;
	private javax.swing.JLabel jLTitutoTab;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenu jMActualizarRegistro;
	private javax.swing.JMenu jMCrearCampo;
	private javax.swing.JMenu jMCrearTabla;
	private javax.swing.JMenu jMEliminarCampo;
	private javax.swing.JMenu jMEliminarRegistro;
	private javax.swing.JMenu jMImpTabla;
	private javax.swing.JMenu jMInsertarRegistro;
	private javax.swing.JMenu jMModificarCampo;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	// End of variables declaration//GEN-END:variables
}
