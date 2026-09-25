package ejercicio2;

public class HiloRunnable implements Runnable{

	private String nombre="";
	private int tiempo=0;
	
	public HiloRunnable(String nombre, int tiempo) {
		this.nombre=nombre;
		this.tiempo=tiempo;
	}
	
	
	public void chequearVida() throws InterruptedException {
//		for (int i = 0; i < tiempo*10; i++) {
//			System.out.printf("Hilo %s contando: %d %n", nombre, i);
//			Thread.sleep(100);
//		}	
		System.out.printf("El hilo de %s ha empezado a contar %n",nombre);
		Thread.sleep(tiempo*100);
	}
	
	
	public void run() {
		try {
			chequearVida();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		HiloRunnable hr1 = new HiloRunnable("David",10);
		HiloRunnable hr2 = new HiloRunnable("Asier",30);
		
		
		Thread t1 = new Thread(hr1);
		Thread t2 = new Thread(hr2);
		
		
		t1.start();;
		t2.start();;
		
		while (t1.isAlive()||t2.isAlive()) {
		
				System.out.println("----------------------------");
				System.out.printf("Almenos un hilo sigue vivo %n");
				System.out.println("----------------------------");

				Thread.sleep(800);
			}
			
		
		System.out.println("Ambos hilos han muerto");
		
	}
	
}
