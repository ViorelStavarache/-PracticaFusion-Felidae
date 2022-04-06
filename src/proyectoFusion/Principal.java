package proyectoFusion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato("Miriam", "Hembra");
		Marmota marmota = new Marmota("Haku", "Hembra");
		Pinguino pinguino = new Pinguino("Cristina", "Hembra");
		gato.MandarMensaje();
		marmota.MandarMensaje();
		pinguino.MandarMensaje(); 
	}

}
