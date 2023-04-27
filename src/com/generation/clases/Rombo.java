package com.generation.clases;

import com.generation.interfaces.GeoFig;

public class Rombo implements GeoFig {
	private String name;
	private static String figure = "Rombo";
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;
	
	 
	public Rombo(String name, double diagonalMayor, double diagonalMenor, double lado) {
		super();
		this.name = name;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
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
		Rombo.figure = figure;
	}


	public double getDiagonalMayor() {
		return diagonalMayor;
	}


	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}


	public double getDiagonalMenor() {
		return diagonalMenor;
	}


	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Rombo [name=" + name + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor
				+ ", lado=" + lado + "]";
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return  this.name;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (4 * this.lado);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (this.diagonalMayor * this.diagonalMenor) / 2;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.figure;
	}
	
	
}
