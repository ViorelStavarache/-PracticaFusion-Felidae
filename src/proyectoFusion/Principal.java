package proyectoFusion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato("Miriam");
		Marmota marmota = new Marmota("Haku");
		Pinguino pinguino = new Pinguino("Cristina");
		gato.MandarMensaje();
		marmota.MandarMensaje();
		pinguino.MandarMensaje(); 
	}

}
