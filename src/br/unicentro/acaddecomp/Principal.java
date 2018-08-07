package br.unicentro.acaddecomp;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.soma(4);
		calc.subtracao(3);
		calc.soma(8);
		calc.multiplicacao(2);
		calc.divisao(12);
		System.out.println(calc);
		calc.restaurarMemento();
	}
}
