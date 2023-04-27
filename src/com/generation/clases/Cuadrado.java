package com.generation.clases;

import com.generation.interfaces.GeoFig;

public class Cuadrado implements GeoFig {
	private String name;
	private static String figure = "Cuadrado";
	private double lado;
	
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
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
		Cuadrado.figure = figure;
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	
	@Override
	public String getNombre() {
		return this.name;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.lado * 4);
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (int) Math.pow(2, this.lado);
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.figure;
	}
	
}
