package pruebaHilos;

public class RatonThreadConJoinYPriority extends Thread{

	private String nombre = "";
	private int tiempo = 0;
	
		public RatonThreadConJoinYPriority ( String nombre, int tiempo) {
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
			RatonThreadConJoinYPriority raton1 = new RatonThreadConJoinYPriority("Levan", 4);
			RatonThreadConJoinYPriority raton2 = new RatonThreadConJoinYPriority("Aingeru", 4);
			RatonThreadConJoinYPriority raton3 = new RatonThreadConJoinYPriority("Asier", 5);
			
			raton2.setPriority(MAX_PRIORITY);
			raton1.setPriority(MIN_PRIORITY);
			raton3.setPriority(MIN_PRIORITY);
			
			raton1.start();
			raton2.start();
			raton3.start();
			
			
			try {
				raton1.join();
				raton2.join();
				raton3.join();
			} catch (InterruptedException e) {
				
			}
				System.out.printf("Todos los ratones han comido %n");
			
			
		
	}
}