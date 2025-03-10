package com.generation.clases;

import com.generation.interfaces.GeoFig;

public class Triangulo implements GeoFig{
	private String name;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String name, double base, double altura, double lado) {
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return (getBase() * getAltura())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() + getLado() + getLado());
	}// calcularPerimetro
		
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Triángulo [name=" + name + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.calcularArea();
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.calcularPerimetro();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}//class Triangulo
