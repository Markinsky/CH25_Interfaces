package com.generation.printeable;

import com.generation.interfaces.GeoFig;

public class Print {
	
	public static void show(GeoFig g) {
		System.out.println("+========================================");
		System.out.println("La figura es: " + g.getType());
		System.out.println("El nombre de la figura es: " + g.getNombre());
		System.out.println("El area es: " + String.format("%.2f", g.getArea()));
		System.out.println("El perimetro es: " + String.format("%.2f", g.getPerimetro()));
		System.out.println("+========================================");
	}
}
