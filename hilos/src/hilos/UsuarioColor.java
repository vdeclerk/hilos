package hilos;

public class UsuarioColor {

	public static void  main(String[] args) {
		Color rojo = new Color("Rojo", 255, 0, 0);
		Color violeta = rojo.invertir();
		Color blanco = new Color("Blanco", 255, violeta.getVerde(), violeta.getAzul());
		
	}
}
