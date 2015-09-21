package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que peça para o usuario informar qual tabuada o mesmo deseja ver e armazene
 * o numero em uma variavel. Em seguida, imprima a tabuada na tela se utilizando da instrucao FOR
 * Para imprimir a tabuada ,siga o modelo abaixo:
 * 
 * Por Favor Informe qual a tabuada voce deseja:
 * 
 * Ax x B10 = C10
 * Ax x B9 = C9
 * Ax x B8 = C8
 * 
 * Notas :
 * 1) A,B e C representam, respectivamente:
 * 
 * A - numero da tabuada desejada pelo usuario
 * B - numero aser incrementado
 * C - resultado da expressao A x B = C
 * 
 * 
 * Exemplo :
 * 
 * 5 x 10 = 50
 * 5 x 9 = 45
 * 5 x 8 = 40
 * 
 */


public class TabuadaAoAvesso {
	
	public static void main(String[] args) {
		
		
		System.out.println("Digite a tabuada que voce deseja: ");
		Scanner in = new Scanner(System.in);
		int tabuada = in.nextInt();
		
		for (int i = 10 ; i >= 1 ; i--) {
			
			System.out.println(tabuada + " x " + i + " = " + (tabuada *  i));
		}
		
		
	}
	

}
