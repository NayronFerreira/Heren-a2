package aplicacao;

import java.util.Scanner;

import entidade.Circulo;
import entidade.FormaAbs;
import entidade.Retangulo;
import entidade.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com informações das formas: ");
		System.out.println("Retângulo: ");
		System.out.print("Largura: ");
		double larg = leia.nextDouble();
		System.out.println("Altura: ");
		double alt = leia.nextDouble();
		FormaAbs retangulo = new Retangulo(Cor.BRANCO, larg, alt);
		System.out.println("Circulo: ");
		System.out.print("Raio: ");
		double raio = leia.nextDouble();
		
		FormaAbs circulo = new Circulo(Cor.PRETO, raio);
		
		System.out.println("Cor do Retangulo: "+ retangulo.getCor());
		System.out.println("Area do Retangulo: "+ retangulo.area());
		System.out.println("Cor do Circulo: "+ circulo.getCor());
		System.out.println("Area do Circulo: "+ circulo.area());		
		

		leia.close();
	}

}
