package hilos;

public class Monitor {

	private Object monitor1 = new Object();
	private Object monitor2 = new Object();
	private String atributo1G1 = "A1 G1";
	private String atributo2G1 = "A2 G1";
	private String atributo1G2 = "A1 G2";
	private String atributo2G2 = "A2 G2";
	
	public static void main(String[] args) {
		
	}

	public String getAtributo1G1() {
		synchronized (monitor1) {
			return atributo1G1;
		}
	}

	public void setAtributo1G1(String atributo1g1) {
		synchronized (monitor1) {
			atributo1G1 = atributo1g1;
		}
	}

	public String getAtributo2G1() {
		synchronized (monitor1) {
			return atributo2G1;
		}
	}

	public void setAtributo2G1(String atributo2g1) {
		synchronized (monitor1) {
			atributo2G1 = atributo2g1;
		}
	}

	public String getAtributo1G2() {
		synchronized (monitor2) {
			return atributo1G2;
		}
	}

	public void setAtributo1G2(String atributo1g2) {
		synchronized (monitor2) {
			atributo1G2 = atributo1g2;
		}
	}

	public String getAtributo2G2() {
		synchronized (monitor2) {
			return atributo2G2;
		}
	}

	public void setAtributo2G2(String atributo2g2) {
		synchronized (monitor2) {
			atributo2G2 = atributo2g2;
		}
	}
	
}
