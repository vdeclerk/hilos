package hilos;

public class HiloSleep extends Thread {

	private final String[] mensaje = {"Este es", "un mensaje", "desde un hilo", "que duerme"};
	
	@Override
	public void run() {
		for(String linea : mensaje) {
			System.out.println(linea);
			dormir();
		}
	}
	
	private void dormir() {
		try {
			sleep(1000); // Se usa para esperar un tiempo determinado
		} catch (InterruptedException e) {
			System.out.println("Fui interrumpido: " + getName());
		}
	}
}
