package Circulos;
import java.awt.Component;
import java.util.Scanner;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n Ingrese coordenadas del Centro del circulo 1:\n");
		Scanner reader = new Scanner(System.in);
		double x1= reader.nextDouble();	
		double y1= reader.nextDouble();
		Punto p1=new Punto(x1,y1);
		
		System.out.println("Ingrese el radio 1");
		double r1=reader.nextDouble();
		System.out.print("\n Ingrese coordenadas del Centro del circulo 2:\n");
		Scanner reader1 = new Scanner(System.in);
		double x2= reader1.nextDouble();	
		double y2= reader1.nextDouble();
		Punto p2=new Punto(x2,y2);
		
		System.out.println("Ingrese el radio 2");
		double r2=reader1.nextDouble();
		Circulo c1= new Circulo(p1, r1); 
		Circulo c2= new Circulo(p2,r2);
		System.out.println("Areas");
        System.out.println(c1.area());
        System.out.println(c2.area()); //calculo area de c1 y c2
        System.out.println("Distancia");
        //System.out.println(p1.distancia(p2));
        if(c1.intersectaCon(c2)) {System.out.println("*****Intersectan******");}
           else System.out.println("****NO intersectan*****");
    } 
        
	}

//Myriam Gelinger