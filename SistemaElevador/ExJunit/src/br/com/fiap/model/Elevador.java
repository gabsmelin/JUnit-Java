package br.com.fiap.model;

public class Elevador extends Calculadora {
	private int id;
	private double cargaMaxima = 200;
	private double cargaAtual;
	private boolean sinalAlerta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	Calculadora C = new Calculadora();
	
	public double entrarNoElevador(double peso) {
		this.cargaAtual = C.Somar(this.cargaAtual, peso); 
		return this.cargaAtual;
	}
	
	public double sairDoElevador(double peso) {
		this.cargaAtual = C.Subtrair(this.cargaAtual, peso);
		return this.cargaAtual;
	}
	
	public boolean avaliarPeso() {
		if(this.cargaAtual > this.cargaMaxima) {
			return sinalAlerta = true;
		}
		return sinalAlerta = false;
	}
}
