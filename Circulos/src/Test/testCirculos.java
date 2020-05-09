package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Circulos.Circulo;
import Circulos.Punto;
public class testCirculos {
	@Test
	public void intersectanTest() {
		
		/*Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		assertTrue(c1.intersectaCon(c2));*/

	Circulo c1 = new Circulo(new Punto(0, 0), 1);//Circulo cuadrante 1
	Circulo c2 = new Circulo(new Punto(1, 1), 1.5);//Circulo cuadrante 1
		
		Circulo c3 = new Circulo(new Punto(3, 2), 1.8);//Circulo cuadrante 1
		Circulo c4 = new Circulo(new Punto(-1, 3), 2.3);//Circulo cuadrante 2
		
		Circulo c5 = new Circulo(new Punto(1.2,-2.5), 3); //Circulo cuadrante 4
		Circulo c6 = new Circulo(new Punto(-4, -2.6), 2.5);//Circulo cuadrante 3
		
		Circulo c7 = new Circulo(new Punto(1.4, -3), 5.2);//Circulo cuadrante 4
		Circulo c8 = new Circulo(new Punto(-1, 5), 3.1); //Circulo cuadrante 2
		
		Circulo c9 = new Circulo(new Punto(2, -4), 1.5);//Circulo cuadrante 4
		Circulo c10 = new Circulo(new Punto(-1, -4), 1.5);//Circulo cuadrante 3
		
	}
}
//Myriam Gelinger - TallerAvanzada