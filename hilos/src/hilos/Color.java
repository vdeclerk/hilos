package hilos;

public class Color {

	private String nombre;
	private int rojo;
	private int verde;
	private int azul;
	
	public Color(String nombre,
			     int rojo,
			     int verde, 
			     int azul) {
		this.nombre = nombre;
		this.rojo = rojo;
		this.verde = verde;
		this.azul = azul;
	}
	
	public Color invertir() {
		return new Color("El inverso de " + nombre, 255 - rojo, 255 - verde, 255 - azul);
	}
	
	public synchronized int getColor() {
		return rojo << 16 + verde << 8 + azul;
	}

	public synchronized String getNombre() {
		return nombre;
	}
	/*
	public synchronized void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public synchronized void setRojo(int rojo) {
		this.rojo = rojo;
	}

	public synchronized void setVerde(int verde) {
		this.verde = verde;
	}

	public synchronized void setAzul(int azul) {
		this.azul = azul;
	}
	*/

	public int getRojo() {
		return rojo;
	}

	public int getVerde() {
		return verde;
	}

	public int getAzul() {
		return azul;
	}
	
}
