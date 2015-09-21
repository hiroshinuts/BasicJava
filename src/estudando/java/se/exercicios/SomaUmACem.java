package estudando.java.se.exercicios;

/*
 * 
 * Faça um programa q mostretodos os numerosde 1 até 100
 * 
 * 
 */


public class SomaUmACem {
	
	public static void main(String[] args) {
		
		int soma = 0;
		System.out.print("A soma dos 100 primeiros numeros é: ");
		
		for(int i = 0 ; i <= 100; i++)
			soma += i;
		System.out.println(soma);
		
		
		int ii = 0;
		int somaWhile = 0;
		while (ii <= 100) {
			somaWhile += ii;
			ii++;
			
		}
		
		System.out.println("A soma dos 100 primeiros numeros utilizando WHILE : " + somaWhile);
	}

}
