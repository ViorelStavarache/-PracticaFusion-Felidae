package proyectoFusion;

public class Mascota {
	private String nombre;

	
	private int patas;
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Mascota(String nombre,int patas) {
		this.nombre = nombre;
		this.patas = patas;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Hola equipo! Soy " + this.nombre + " y te voy a contar algo o no y tengo " + this.patas);
	}
}
