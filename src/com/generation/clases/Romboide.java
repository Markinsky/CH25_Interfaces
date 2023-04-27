package com.generation.clases;

import com.generation.interfaces.GeoFig;

public class Romboide implements GeoFig {
	private String name;
	private static String figure = "Romboide";
	private double base;
	private double altura;
	

	public Romboide(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getFigure() {
		return figure;
	}

	public static void setFigure(String figure) {
		Romboide.figure = figure;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Romboide [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	
	@Override
	public String getNombre() {
		return this.name;
	}
	@Override
	public double getArea() {
		return (this.base * this.altura);
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return ((2 * this.altura)+(2 * this.base));
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.figure;
	}
	
	
}
