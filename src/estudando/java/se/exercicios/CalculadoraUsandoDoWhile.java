package estudando.java.se.exercicios;

import java.util.Scanner;

public class CalculadoraUsandoDoWhile {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x = 0; // onde iremos armazenar a operaçao a realizar
		double num1, num2, resultado;
		num1 = num2 = resultado = 0;
		
		do {
		
	
			System.out.println("1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) multiplicar");
			System.out.println("4) duvidir");
			System.out.println("0) para sair");
	
			System.out.println("Digite o Codigo da Operação:");
			x = in.nextInt();
	
			if (x != 0) { // verifica se o usuario deseja sair do programa
	
				System.out.println("Digite o primeiro numero: ");
				num1 = in.nextDouble();
	
				System.out.println("Digite o segundo numero: ");
				num2 = in.nextDouble();
	
				if (x == 1) { // somar
					resultado = num1 + num2;
				} else {
					if (x == 2) {// subtrair
						resultado = num1 - num2;
					} else {
						if (x == 3) {// multiplicar
							resultado = num1 * num2;
						} else {
							if (x == 4) {
								resultado = num1 / num2;
							}
						}
	
					}
				}
				System.out.println();
				System.out.println("O resultado da operação é: " + resultado);
				System.out.println("----------");
				System.out.println();
			}
		
		}while(x!=0);
	}
}	
		

	
