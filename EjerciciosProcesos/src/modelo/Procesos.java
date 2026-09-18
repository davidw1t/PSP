package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Procesos {
	
	private long ultimoPid = 0;
	private long ultimoPidPadre = 0;
	private String ultimosCincoPids = "";
	
	public void lanzarTaskManager() {
		try {
			ProcessBuilder pb = new ProcessBuilder("taskmgr");
			Process proceso = pb.start();
			
		
			this.ultimoPid = proceso.pid();
			this.ultimoPidPadre = ProcessHandle.current().pid();

		} catch (IOException e) {
			System.out.println("Error al abrir TaskManager: " + e.getMessage());
		}
	}
	
	
	
	
	
	public String lanzarIpconfig() {
	    
	    StringBuilder resultadoTexto = new StringBuilder();
	    
	    try {
	       
	        ProcessBuilder pb = new ProcessBuilder("ipconfig");
	        Process proceso = pb.start();
	        
	        
	        this.ultimoPid = proceso.pid();
	        this.ultimoPidPadre = ProcessHandle.current().pid();
	        
	        
	        BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
	        String linea;
	        
	      
	        while ((linea = lector.readLine()) != null) {
	            resultadoTexto.append(linea).append("\n"); 
	        }
	        
	       
	        lector.close();

	    } catch (IOException e) {
	        return "Error al ejecutar ipconfig: " + e.getMessage();
	    }
	    
	
	    return resultadoTexto.toString();
}
	
	public String lanzarCincoProcesos() {
		StringBuilder pidsAcumulados = new StringBuilder();
		StringBuilder resultadoSimulacion = new StringBuilder();
		
		
		this.ultimoPidPadre = ProcessHandle.current().pid();
		
		
		for (int i = 1; i <= 5; i++) {
			try {
				
				ProcessBuilder pb = new ProcessBuilder("notepad");
				Process proceso = pb.start();
				
				pidsAcumulados.append(proceso.pid()).append(" ");
				
			
				resultadoSimulacion.append("Introduce una cadena...\n");
				resultadoSimulacion.append("Cadena escrita: Prueba ").append(i).append("\n");
				
				
				Thread.sleep(200); 
				
			} catch (IOException | InterruptedException e) {
				resultadoSimulacion.append("Error en vuelta ").append(i).append(": ").append(e.getMessage()).append("\n");
			}
		}
		
		
		this.ultimosCincoPids = pidsAcumulados.toString().trim();
		
		return resultadoSimulacion.toString();
	}

	
	
	

	public String getUltimoPid() {
		return String.valueOf(this.ultimoPid);
	}

	public String getUltimoPidPadre() {
		return String.valueOf(this.ultimoPidPadre);
	}

	public String getUltimosCincoPids() {
		return this.ultimosCincoPids;
	}
}
