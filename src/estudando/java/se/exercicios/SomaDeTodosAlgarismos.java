package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * 
 * Faça um programa que peça para o usuario digitar um numero, em seguida faça a soma de todos os algarismos do numero
 * 
 * 
 * Exemplo :
 * 
 * 1111 = 1+1+1+1=4
 * 2090 = 2 + 0 + 9 + 0 = 11
 * 
 * 
 */

public class SomaDeTodosAlgarismos {
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero com 4 casas ");
		
		int num = new Scanner(System.in).nextInt();
		int soma = 0;
		
		//123 > se dividirmos por 10 , o resultado sera 12.easobra =3
		//(123 / 10) = 12 -> (123 % 10) = 3
		//(12 / 10) = 1 -> (12 % 10 ) = 2
		// (1 / 10) = 0 -> ( 1 % 10 ) = 1
		// 
		
		
		
		while(num>0) {
		//1) Obter o modulo do numero digitado
			int modulo = num % 10;
		//2) incrementar o modulo a nossa variavel soma
			soma += modulo;
		//3) dividir o numero por e atribuirmos a nossa variavel 'num'
			num /= 10; // num = num / 10;
		
		System.out.println("O valorde soma é : " + soma);
		}
		
		System.out.println("A soma dos algarismos é : " + soma);
	}

}
