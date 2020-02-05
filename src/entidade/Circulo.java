package entidade;

import entidade.enums.Cor;

public class Circulo extends FormaAbs {

	private double raio;

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return 3.14 * (Math.pow(raio, 2));
	}

}
