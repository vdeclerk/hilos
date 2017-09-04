package hilos;

public class PrincipalHilos {

	public static void main(String[] args) throws InterruptedException {
		Ejecutable primero = new Ejecutable("Primero");
		Ejecutable segundo = new Ejecutable("Segundo");
		
		new Thread(primero).start();
		new Thread(segundo).start();
		
		Thread hiloSleep = new HiloSleep();
		Thread hiloWait  = new HiloWait();
		hiloSleep.start();
		hiloWait.start();
		hiloSleep.join();
		
		synchronized(hiloWait) {
			hiloWait.notify();
		}
		
	}

}
