package entidade;

import entidade.enums.Cor;

public class Retangulo extends FormaAbs {

	private double largura;
	private double altura;

	public Retangulo(Cor cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double area() {

		return altura * largura;
	}

}
