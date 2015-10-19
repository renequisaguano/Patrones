package Juego_Marcianos;

public class Jugador {
	
	private Marcianos marcianos;
	
	
	public Jugador(){
		marcianos=Marcianos.getMarcianos();
	}
	
	public void destruirMarciano(){
		Marcianos.derribaMarcianos();
	}

}
