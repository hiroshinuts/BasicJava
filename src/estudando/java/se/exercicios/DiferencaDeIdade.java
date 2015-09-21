package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * Escreva um pequeno software que peça a sua idade e a idade de sua mãe. Em seguida, imprima na tela as 3 informações
 * 
 * 
 * 1) a sua idade
 * 2) a idade de sua mãe
 * 3) minha mae é <anos> mais velha que eu
 * 
 * NOTA : substitua o texto <anos> pela diferença de idade entre a sua idade e de sua mae
 * 
 */

public class DiferencaDeIdade {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		
		int idade = in.nextInt();
		
		System.out.println("Digite a idade de sua mãe:");
		
		int mae = in.nextInt();
		
		int soma = mae - idade;
		
		System.out.println("A minha idade é " + idade);
		System.out.println("A idade de minha mãe é " + mae);
		System.out.printf("Minha mae é %s anos mais velha do que eu" , soma );
		
		
		
	}

}
