package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * 
 * Faca um programa que mostre a soma de todos os numeros do intervalo pelo usuario.Logo
 * peça para que o usuario defina o inicio da contagem e em seguida,peça ao mesmo
 * que informe o final 
 * 
 * 
 */


public class SomaDeTodosNumerosNumIntervalo {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in)	;
	
	System.out.println("Digite o inicio do Intervalo: ");
	
	int inicio = in.nextInt();
	
	System.out.println("Digite o final do Intervalo");
	
	int fim = in.nextInt();
	
	int i = inicio;
	int soma = inicio;
	
	while(i < fim) {
		i++;
		soma+=i;
	}
	
	System.out.println(soma);
		
	}
	

}

/*
 * ENTENDENDO O CODIGO
 * 
 * 
 *  i   = 1
 * ini  = 1
 * soma = 1
 * fim  = 5
 * 
 * -------------------------------------------------------
 * 
 * variavel...............|    i    |      soma      |     soma + i  |      fim    |
 * valor inicial..........|    1    |       1        |      1 + 1    |        5    |
 * expressao..............| i = i+1 | soma=soma+i    |               |             |
 * -----------------------|---------|----------------|---------------|-------------|
 * 1 ciclo (i<5)..........|   i=1   |soma = 1        | 1 + 2 = 3     |    5        |
 * 2 ciclo (i<5)..........|   i=2   |soma = 3        | 3 + 3 = 6     |    5        |
 * 3 ciclo (i<5)..........|   i=3   |soma = 6        | 6 + 4 = 10    |    5        |
 * 4 ciclo (i<5)..........|   i=4   |soma = 10       | 10 + 5 = 15   |    5        |
 * ---------------------------------------------------------------------------------
 * 
 * 
 */
