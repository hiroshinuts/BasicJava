package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * 	Reescreva o codigo a seguir a fim de se utilizar o minimo de linhas possiveis:
 * 
 *  Notas
 *  1) Amontoar linhas nao soluciona o problema. O codigo a seguir nao é simplificação e sim confusao
 *  
 *   int x = 0 , x = System.out.println("Digite um numero);
 * 
 * 2) Escreva de forma tal a utilizar somente 4 linhas
 * 
 * 
 * Codigo Fonte
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.println("Simplificando exmpressoes para reduzir o numero de linhas");
 * int x = 0;
 * x = in.nextInt();
 * if ( x > 10) {
 * 	System.out.println("O numero digitado é maior do que 10");
 * }else{
 * 	System.out.println("O numero digitado é menor do que 10!);
 * }
 * 
 * 
 */

public class Simplificacao {

	public static void main(String[] args) {

		System.out.println("Simplificando exmpressoes para reduzir o numero de linhas");

		int x = new Scanner(System.in).nextInt(); //OPCAO 1

		String s = (x > 10) ? "maior" : "menor";

		System.out.println("O numero digitado é " + s + " do que 10");
		
		//////////////////////////////////
		//OPCAO 2
		
		
		
	//	System.out.println("Simplificando exmpressoes para reduzir o numero de linhas");

	//	String a = (new Scanner(System.in).nextInt() > 10) ? "maior" : "menor";

    //	System.out.println("O numero digitado é " + a + " do que 10");
		
		
		
	}

	
	
	
	
	
}
