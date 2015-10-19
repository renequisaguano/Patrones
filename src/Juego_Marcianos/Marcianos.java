package Juego_Marcianos;

public final class Marcianos {
	private static final Marcianos marcianos=new Marcianos();
	private static int cantidad;
	
	private Marcianos(){
		cantidad=10;
	}
	
	public static Marcianos getMarcianos(){
		return marcianos;
	}
	
	public static void derribaMarcianos(){
		
		if(cantidad>0){
			System.out.println("Soy el bueno, derribe un marciano");
			cantidad--;
		}
	}
	
	public static void crearMarcianos(){
		
		if(cantidad>0){
			System.out.println("Soy el malo, cree un marciano");
			cantidad++;
		
		}
		
	}
	
	
	public static void cuantosQuedan(){
		
		
		if(cantidad > 0){
			System.out.println("En el juego quedan: "+cantidad+" marcianos");			
		}else{
			System.out.println("Felicidades, has ganado");
		}		
	}

}
