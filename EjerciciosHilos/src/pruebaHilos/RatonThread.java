package pruebaHilos;

public class RatonThread extends Thread{

	private String nombre = "";
	private int tiempo = 0;
	
		public RatonThread ( String nombre, int tiempo) {
				super();
				this.nombre=nombre;
				this.tiempo=tiempo;
		}
	
	
		public void comer() {
			
			try {
				System.out.printf("El raton %s empieza a comer %n", nombre);
				Thread.sleep(tiempo*1000);
				System.out.printf("El raton %s ha terminado de comer %n", nombre);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void run() {
			comer();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RatonThread raton1 = new RatonThread("Levan", 4);
			RatonThread raton2 = new RatonThread("Aingeru", 2);
			RatonThread raton3 = new RatonThread("Asier", 5);
			
			raton1.start();
			raton2.start();
			raton3.start();
			System.out.printf("Todos los ratones han comido %n");
	}
}