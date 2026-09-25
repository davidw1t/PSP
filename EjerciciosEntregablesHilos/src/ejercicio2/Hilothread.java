package ejercicio2;

public class Hilothread extends Thread{

	private String nombre="";
	private int tiempo=0;
	
	public Hilothread(String nombre,int tiempo) {
		this.nombre=nombre;
		this.tiempo=tiempo;
	}
	
	
	public void contarHastaMuerte()  {
		
		System.out.printf("El hilo de %s ha empezado a contar%n", nombre);
		try {
			Thread.sleep(tiempo*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		contarHastaMuerte();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Hilothread hr1= new Hilothread("David", 50);		
		Hilothread hr2= new Hilothread("Jon", 30);
		
		
		hr1.start();;
		hr2.start();;
		
		
		while (hr1.isAlive()||hr2.isAlive()) {
			if(hr1.isAlive()&&hr2.isAlive()) {
				System.out.println("----------------------------");
				System.out.printf("Ambos siguen vivo %n");
				System.out.println("----------------------------");
				
			}else if(!hr1.isAlive()&&hr2.isAlive()) {
				String nombre2=hr2.nombre;
				System.out.println("----------------------------");
				System.out.printf("Solo el hilo %s sigue vivo %n",nombre2);
				System.out.println("----------------------------");
				
			}else if(hr1.isAlive()&&!hr2.isAlive()) {
				String nombre1=hr1.nombre;
				System.out.println("----------------------------");
				System.out.printf("Solo el hilo %s sigue vivo %n",nombre1);
				System.out.println("----------------------------");
				
			}
			Thread.sleep(800);
		}
		
	
	System.out.println("Ambos hilos han muerto");
	}
	
	
}
