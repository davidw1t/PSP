package ejercicio1;

public class Contador extends Thread{

	private String nombre="";
	
	public Contador(String nombre){
		this.nombre=nombre;
	}
	
	
	public void contarSegundo() throws InterruptedException {
		
		System.out.printf("La persona %s ha empezado a contar %n", nombre);
		
		for (int i = 1; i < 1000; i++) {
			
			int contador=i;
			
			if (contador>0&&contador<1000&&contador%100==0) {
				System.out.printf("%s va por el numero %s %n", nombre, contador);
			}
		    try {
		        Thread.sleep(1); 
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		
		
		System.out.printf("La persona %s ha terminado de contar %n", nombre);
	}
	
	
	public void run() {
		try {
			contarSegundo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Contador c1 = new Contador("David");
		Contador c2 = new Contador("Levan");
		
		c1.setPriority(MAX_PRIORITY);
		c2.setPriority(MIN_PRIORITY);
		
		c1.start();
		c2.start();
		
		
		
		c1.join();
		c2.join();
	}
	
	
}
