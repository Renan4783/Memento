package br.unicentro.acaddecomp;

import java.util.*;

public class Calculadora {

	Deque<Memento> memory = new ArrayDeque<>();
	private double valor;
	private String operacao;
	
	public double soma(double valor1){
		valor = valor + valor1 ;
		operacao = "Soma";
		salvarMemento();
		return valor;
	}
	
	public double subtracao(double valor1){
		valor = valor - valor1;
		operacao = "Subtracao";
		salvarMemento();
		return valor;
	}
	
	public double multiplicacao(double valor1){
		valor = valor * valor1;
		operacao = "Multiplicacao";
		salvarMemento();
		return valor;
	}
	
	public double divisao(double valor1){
		valor = valor / valor1;
		operacao = "Divisao";
		salvarMemento();
		return valor;
	}
	
	public void salvarMemento(){
		memory.push(new Memento(valor, operacao));
	}
	
	public void restaurarMemento(){
		Memento locale;
		System.out.println("");
		System.out.println("Ultimas operacoes: ");
		while (memory.size()>0){
			locale = memory.pop();
			System.out.println(locale);
		}
	}
	
	public String toString(){
		return ("Operacao: " + operacao + " Valor: " + valor);
	}
	
	private class Memento{

		private double valor;
		private String operador;
		
		public Memento(double valor, String operador) {
			this.valor = valor;
			this.operador = operador;
		}

		public double getValor() {
			return valor;
		}
		
		public String toString(){
			return ("Operacao: " + operador + " Valor: " + valor);
		}
	}
}
