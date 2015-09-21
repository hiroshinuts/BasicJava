package estudando.java.se;

import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {
		
		Random numrandom = new Random(); // chama o objeto random
		System.out.println(numrandom.nextInt(10)); // imprime um numero inteiro de 0 a 9 
		System.out.println(numrandom.nextInt(10)+ 1); // imprimeu um numero de 0 a 9 e acrescenta 1 , para que nao apareca o 0 e o resultado seja 1 a 10
		
		/*
		 * Foi criado a condição for, para que o programa imprima um numero 10x um numero random, que seja de 1 a 10
		 * 
		 */
		
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(numrandom.nextInt(10)+1);
		}
		
		/*
		 * 
		 * Para realizar numeros com virgula , devemos nos atentar a 2 condições , modificando para .nextDouble ,apenas os numeros de 0,xxxxx serão
		 * impressos, para conseguir imprimir numeros aleatorios do tipo XX.XXXX devemos multiplicar pelo nivel alcançado, segue exemplo abaixo
		 * 
		 */
		
		System.out.println(numrandom.nextDouble() * 10); // imprime numeros aleatorios de 0 a 9,xxxxxx
		
		
		/*
		 * 
		 * Ainda podemos sortear entre verdadeiro e falso , utilizando na instrução .nextBoolean
		 * 
		 */
		
		
	}
	
}
