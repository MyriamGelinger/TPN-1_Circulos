package Circulos;

public class Circulo{
	 private Punto centro;
	 private double radio;
	 public Circulo(Punto centro, double radio) {
	 this.centro = centro;
	 this.radio = radio;
	 }
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() { 
		return Math.PI*radio*radio; 
		}
	public double perimetro() { 
		return 2*Math.PI*radio; 
		}
	public boolean intersectaCon(Circulo c2) {
	System.out.println(this.centro.distancia(c2.centro));
	if(this.centro.distancia(c2.centro)> this.radio + c2.radio) {		
		 System.out.println("*****No intersectan******");
		 return false;
		 }	
	else
		if(this.centro.distancia(c2.centro)< this.radio + c2.radio){
			System.out.println(" ****Intersectan******");
		return true;
		}
	
		return false;
		// TODO Auto-generated method stub		
	}
 }
//Myriam Gelinger
