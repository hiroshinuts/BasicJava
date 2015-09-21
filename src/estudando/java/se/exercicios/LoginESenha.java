package estudando.java.se.exercicios;

import java.util.Scanner;

/*
 * 
 * Desenvolva um pequeno programa de login e senha. Para isso, peça ao usuario para digitar o seu login e armazene em uma variavel. Em seguida, peça para
 * o usuario digitar a sua senha e armazena em uma outra variavel. Por fim, verifique se o login e a senha são iguais aqueles definidos por vc
 * 
 * DICA : Voce pode utilizar para login e senha o seu nome e a senha o seu cpf
 * 
 * 
 */



public class LoginESenha {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu login: ");
		String login = in.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senha = in.nextLine();
		
		if(login.equals("rafael") && senha.equals("228543008-66")){ // não podemos usar == , devemos usar o equals , pois estamos comparando uma estancia com uma string
			System.out.printf("Usuario %s logado com sucesso", login);
		}else {
			System.out.println("Login ou senha invalidos!");
		}
		
		
		
	}
	
	
}
