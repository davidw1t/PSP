package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Procesos; 
import vista.ventanaPrincipal;

public class ControladorProcesos {

	private ventanaPrincipal vista;
	private Procesos modelo;

	
	public ControladorProcesos(ventanaPrincipal vista, Procesos modelo) {
		this.vista = vista;
		this.modelo = modelo;

		conectarBotones();
	}

	private void conectarBotones() {
		
		// ==========================================
		// ACCIÓN DEL BOTÓN 1: Administrador de Tareas
		// ==========================================
		vista.getBtnProceso1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.lanzarTaskManager(); 
				
				// CAMBIO: Ponemos el nombre en el cuadro de arriba
				vista.setNombreProceso1("taskmgr");
				
				vista.setPidProceso1(modelo.getUltimoPid());
				vista.setPidPadreProceso1(modelo.getUltimoPidPadre());
			}
		});

		// ==========================================
		// ACCIÓN DEL BOTÓN 2: ipconfig
		// ==========================================
		vista.getBtnProceso2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoConsola = modelo.lanzarIpconfig(); 
				
				// CAMBIO: Ponemos el nombre en el cuadro de arriba
				vista.setNombreProceso2("ipconfig");
				
				vista.setPidProceso2(modelo.getUltimoPid());
				vista.setPidPadreProceso2(modelo.getUltimoPidPadre());
				vista.setTextoResultado1(textoConsola); 
			}
		});

		// ==========================================
		// ACCIÓN DEL BOTÓN 3: Lanzar 5 procesos Prueba
		// ==========================================
		vista.getBtnProceso3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoSimulacion = modelo.lanzarCincoProcesos(); 
				
				// CAMBIO: Ponemos el nombre en el cuadro de arriba
				vista.setNombreProceso3("notepad (Prueba)");
				
				vista.setPidProceso3(modelo.getUltimosCincoPids());
				vista.setPidPadreProceso3(modelo.getUltimoPidPadre());
				vista.setTextoResultado2(textoSimulacion); 
			}
		});
	}
}

