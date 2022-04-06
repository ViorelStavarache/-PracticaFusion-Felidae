package proyectoFusion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato("Miriam",2.65);
		Marmota marmota = new Marmota("Haku",58.62);
		Pinguino pinguino = new Pinguino("Cristina",0.8);
		gato.MandarMensaje();
		marmota.MandarMensaje();
		pinguino.MandarMensaje(); 
	}

}
