package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import Creacion.Singleton;

public class Patrones {

	@Test
	public void test() {
		Singleton miSingleton=Singleton.obtenerSingleton();
		Singleton miSingleton2=Singleton.obtenerSingleton();
		Singleton miSingleton3=Singleton.obtenerSingleton();
		Singleton miSingleton4=Singleton.obtenerSingleton();		
		miSingleton4.vecesLlamado();	
	}

}
