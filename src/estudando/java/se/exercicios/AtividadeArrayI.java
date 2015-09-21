package estudando.java.se.exercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Peça para o usuario informar 7 numerose armazene-os em um array. Na sequencia:
 * 
 * 1) some todos os numeros e exiba na tela
 * 2) multiplique o indice pelo seu valor
 * 3) Calcule a media aritmetica
 */



public class AtividadeArrayI {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] valores = new int[7];
		// {0,1,2,3,4,5,6}
		
		for (int i=0; i < 7; i++) {
		System.out.printf("Digite o numero da posicao : [%d] " , i+1);
		valores [i] = in.nextInt();
		}
		//////// SOMA DOS ELEMENTOS
		int somaElementos = 0;
		for(int x =0 ; x < 7 ; x++) {
			somaElementos += valores[x];
			// Outra forma de mostrar a funcao a cima : somaElementos = somaElementos + valores[x];
			
		}
		
		System.out.printf("A soma dos elementos é: %d  \n ", somaElementos);
		
		/////// MULTIPLICACAO DOS ELEMENTOS
		
		for(int x =0 ; x < 7 ; x++) {
			int produto =valores[x] * x;
			System.out.printf("A multi. da soma dos elem. é: %d * %d = %d \n ",valores[x], x , produto);
		}
		
		// MEDIA ARITMETICA
		// MEDIA ARITMETICA = A SOMA DOS VALORES DIVIDIDO PELA QUANTIDADE
		
		double soma = somaElementos;
		double media = soma / 7.0;
		System.out.printf("A media aritmetica é : %f  \n ", media);
		
		
	}

}
