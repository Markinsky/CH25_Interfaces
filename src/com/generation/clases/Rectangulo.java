package com.generation.clases;

import com.generation.interfaces.GeoFig;

public class Rectangulo implements GeoFig{
	private String name;
	private static String figure = "Rectangulo";
	private double base;
	private double altura;
	

	public Rectangulo(String name, double base, double altura) {
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
		Rectangulo.figure = figure;
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
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}


	@Override
	public String getNombre() {
		return this.name;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((2*this.base)+(2*this.altura));
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.base * this.altura;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.figure;
	}
	
	
}
