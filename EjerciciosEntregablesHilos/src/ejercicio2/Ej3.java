package ejercicio2;

public class Ej3 extends Thread{

	private String nombre="";
	
	public Ej3(String nombre) {
		this.nombre=nombre;
	}
	
	
	public void hacerTareas() throws InterruptedException {
		System.out.printf("%s ha empezado a hacer las tareas %n",nombre);
		Thread.sleep(40);
		
		for (int i = 1; i <= 3; i++) {
			System.out.printf("%s ha terminado la tarea %s %n",nombre, i);
			Thread.sleep(20);
		}
	}
	
	
	public void run(){
		try {
			hacerTareas();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Ej3 e1 = new Ej3("David");		
		Ej3 e2 = new Ej3("Levan");
		Ej3 e3 = new Ej3("Asier");
		
		
		
		e1.start();		
		e2.start();		
		e3.start();
		
	
	}
	
}
