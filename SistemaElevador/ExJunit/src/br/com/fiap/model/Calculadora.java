package br.com.fiap.model;

public class Calculadora {
	private double resultado;
	
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	
	public double Somar(double valor1, double valor2) {
		return this.resultado = valor1 + valor2;
	}
	
	public double Subtrair(double valor1, double valor2) {
		return this.resultado = valor1 - valor2;
	}
}
