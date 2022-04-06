package proyectoFusion;

public class Mascota {
	private String nombre;
	
	
	private double peso;
	
	public Mascota(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void MandarMensaje() {
		System.out.println("Hola equipo! Soy " + this.nombre + " y te voy a contar algo o no y peso " + this.peso + " kg");
	}
}
