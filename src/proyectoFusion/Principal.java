package proyectoFusion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato("Miriam",4);
		Marmota marmota = new Marmota("Haku",14);
		Pinguino pinguino = new Pinguino("Cristina",2);
		gato.MandarMensaje();
		marmota.MandarMensaje();
		pinguino.MandarMensaje(); 
	}

}
