package pruebaHilos;

public class RatonRunnable implements Runnable{

	private String nombre = "";
	private int tiempo = 0;
	
		public RatonRunnable ( String nombre, int tiempo) {
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
			RatonRunnable raton1 = new RatonRunnable("Levan", 4);
			RatonRunnable raton2 = new RatonRunnable("Aingeru", 2);
			RatonRunnable raton3 = new RatonRunnable("Asier", 5);
			
			new Thread(raton1).start();
			new Thread(raton2).start();
			new Thread(raton3).start();
			
			System.out.printf("Todos los ratones han comido %n");
	}
}