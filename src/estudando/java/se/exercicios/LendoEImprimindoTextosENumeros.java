package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que peçao nome ,idade e cidade de nascimento do usuario.Em seguida, imprima a frase abaixo colocando as tags"s
 * 
 *<nome> , <idade>, <cidade> , pelo nome , idade e cidade informada.
 *
 * "Ola , Meu nome é <nome>, sou natural de <cidade> , tenho <idade> anos e estou aprendendo a programar"
 */

public class LendoEImprimindoTextosENumeros {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite seu nome:");

		String nome = in.next();

		System.out.println("Digite sua idade");

		int idade = in.nextInt();

		System.out.println("Digite sua cidade");

		String cidade = in.next();

		System.out.print("Ola, Meu nome é " + nome);
		System.out.print(",sou natural de " + cidade);
		System.out.print(", tenho " + idade);
		System.out.print(" anos e estou aprendendo a programar");

	}
}
