package Circulos;

public class Punto {
 private double x;
 private double y;

 public Punto(double x, double y) {
  this.x = x;
  this.y = y;
  }
 
 public double distancia(Punto b) {
   return Math.sqrt(Math.pow(this.x-b.x, 2) + Math.pow(this.y-b.y, 2));
  }
	 //set y get para atributos privados
 public void setX(double x) {
   this.x = x;//Setea x
  }
 public double getX() {		
   return this.x; //Devuelve el valor de X
 }
public void setY(double y) {
   this.y = y;
  }
	
public double getY() { 
   return this.y;
  }
}
//Myriam Gelinger
