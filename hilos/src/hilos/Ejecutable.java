package hilos;

public class Ejecutable implements Runnable {

	private String nombre;
	
	public Ejecutable(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		for(int k = 0; k < 100; k++) {
			System.out.println(nombre);
			Thread.yield(); // Volvemos el hilo al estado ready-to-run
		}
	}

}
