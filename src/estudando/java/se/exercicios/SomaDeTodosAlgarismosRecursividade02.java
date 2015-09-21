package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * 
 * Faça um programa (COM RECURSIVIDADE) que peça para o usuario digitar um numero, em seguida faça a soma de todos os algarismos do numero
 * 
 * 
 * Exemplo :
 * 
 * 1111 = 1+1+1+1=4
 * 2090 = 2 + 0 + 9 + 0 = 11
 * 
 * 
 */



public class SomaDeTodosAlgarismosRecursividade02 {
	
	
	public static int somaAlgarismoC(int num) {
		// se a variavel num for igual a 10, significa
		// que nos ja somamos todos os algarismos
		if(num<10)
			return num;
		else
			return somaAlgarismoC(num/10)+num%10;
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero :");
		int num = new Scanner(System.in).nextInt();
		int soma= somaAlgarismoC(num);
		System.out.println("A soma dos algarismos é : "+ soma);
		
	}

}
