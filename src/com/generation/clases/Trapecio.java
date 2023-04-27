package com.generation.clases;

import com.generation.interfaces.GeoFig;

public class Trapecio implements GeoFig{
	private String name;
	private static String figure = "Trapecio";
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double ladoD;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	
	public Trapecio(String name, double ladoA, double ladoB, double ladoC, double ladoD, double baseMayor,
			double baseMenor, double altura) {
		super();
		this.name = name;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
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
		Trapecio.figure = figure;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double getLadoD() {
		return ladoD;
	}

	public void setLadoD(double ladoD) {
		this.ladoD = ladoD;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", ladoD="
				+ ladoD + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura + "]";
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.ladoA + this.ladoB + this.ladoC + this.ladoD );
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (this.altura*(this.baseMayor + this.baseMenor))/2;
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.figure;
	}
	
	
}
