package hilos;

public class HiloWait extends Thread {

	@Override
	public void run() {
		System.out.println("Estoy por esperar");
		esperar();
		System.out.println("¡Por fin!");
	}
	
	private synchronized void esperar() {
		try {
			wait(); // Solo se puede llamar dentro de un bloque synchronized
			        // Se usa para esperar un evento definido
		} catch (InterruptedException e) {
			System.out.println("Fui interrumpido: " + getName());
		}
	}
}
