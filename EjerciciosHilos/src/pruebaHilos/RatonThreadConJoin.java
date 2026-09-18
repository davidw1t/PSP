package pruebaHilos;

public class RatonThreadConJoin extends Thread{

	private String nombre = "";
	private int tiempo = 0;
	
		public RatonThreadConJoin ( String nombre, int tiempo) {
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
			RatonThreadConJoin raton1 = new RatonThreadConJoin("Levan", 4);
			RatonThreadConJoin raton2 = new RatonThreadConJoin("Aingeru", 2);
			RatonThreadConJoin raton3 = new RatonThreadConJoin("Asier", 5);
			
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