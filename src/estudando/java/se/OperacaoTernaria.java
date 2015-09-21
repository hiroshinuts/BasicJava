package estudando.java.se;

import java.util.Scanner;

/*
 * Operação Ternaria é uma estrutura utilizada para simplificar o codigo , onde testamos  uma condição e retornamos um valor
 * 
 * 
 *  Definição 
 *  
 *  <variavel> = (condicao) ? <valor1> : <valor2>;
 *  
 *  Lê-se
 *  
 *  <variavel> = (true) SE <valor1> SENAO <valor2>;
 * 
 * 
 */

public class OperacaoTernaria {

	public static void main(String[] args) {

	  ///////////// utilizando a instrucao IF convencional	
		int a , b ;
		String valor;
		a = 5;
		b = 5;
		
		if (a==b) {
			valor = "verdadeiro";
		}else {
			valor = "falso";
		}
		
		System.out.println(valor);
		
	/////////////// utilizando operacao ternaria
		
		valor = (a!=b) ? "verdadeiro" : "falso";
		
		System.out.println(valor);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o seu dia da semana Preferido?");
		System.out.println("Digite 1 para segunda e 7 para domingo");
		int num = in.nextInt();
		String dia = (num==1) ? "segunda" :
					 (num==2) ? "terça" :
				     (num==3) ? "Quarta" :
					 (num==4) ? "Quinta" :
					 (num==5) ? "Sexta" :
					 (num==6) ? "Sabado" :
					 (num==7) ? "Domingo" :
						        "Dia Invalido";
		
		System.out.println("O dia escolhido foi :"+dia);
		
		
		
		// METODO UTILIZANDO SWITCH CASE
		
		/**
		 * System.out.println("Qual o seu dia da semana Preferido?");
		 * System.out.println("Digite 1 para segunda e 7 para domingo");
		 * int num = in.nextInt();
		 * 
		 * 
		 * switch (num) {
		 *   case 1 : dia = "segunda";
		 * 	 case 2 : dia = "terça";
		 *   case 3 : dia = "Quarta";
		 *   case 4 : dia = "Quinta";
		 *   case 5 : dia = "Sexta";
		 *   case 6 : dia = "Sabado";
		 *   case 7 : dia = "Domingo";
		 *   default: dia = "Dia Invalido";
		 * 
		 */
						
		
		
		
		
	}

}
