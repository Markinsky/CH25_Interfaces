package com.generation.clases;

import com.generation.printeable.Print;

public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		Cuadrado cuadrado = new Cuadrado("ejemplo 1", 5);
		//Cuadrado cuadradoB = new Cuadrado("ejemplo 2", 4);
		Rectangulo rect = new Rectangulo("Rectangulo 1", 2, 2);
		Rombo rambo = new Rombo("Rombo 1", 10, 2, 2);
		Romboide rombi = new Romboide("Romboide 1", 2,2);
		Trapecio trapi = new Trapecio("Trapecio", 5, 5, 10, 10, 10, 5, 10);
		Print.show(cuadrado);
		Print.show(rect);
		Print.show(rambo);
		Print.show(rombi);
		Print.show(trapi);
		//imprimirCalculo(t1); imprimirCalculo(t2);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Triangulo t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras