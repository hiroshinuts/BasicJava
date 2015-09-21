package estudando.java.se;

/*
 * 
 * Podemos declarar arrays com quantas dimensoes forem necessarias. A quantidade de elementos em um Array é limitada pela quantidade de memoria 
 * disponivel no computador a ser executado.
 * 
 * EX: int [] [] tabela = new int[7][4]
 * 
 * int[][] tabela = new int[linhas] [colunas]
 * 
 * 00 1 2 3 4 5 6 7
 * 1  * * * * * * *
 * 2  * * * * * * *
 * 3  * * * * * * *
 * 
 * 
 * 
 * 
 * 
 */


public class ArraysMultidimensionais {
		
	public static void main(String[] args) {
		
		int [][] tabela = new int[5][10];
	//	tabela[0][0] = 25;
	//	System.out.println(tabela[0][0]); // imprime o conteudo da tabela na posicao [0][0]
	//	tabela[3][2] = 2;
	//	System.out.println(tabela[3][2]); // imprime o conteudo da tabela na posicao [3][2]
		
	//	System.out.println(tabela[0].length); // impreme quantos elementos possui de colunas
		
		for (int x = 0 ; x<tabela[0].length; x++) {
			System.out.println(tabela[0][x]); // imprime todos elementos da linha 0
		}
		
		System.out.println("-----------------------"); // separacao de exemplos
		
		tabela[0][0] = 0 ;
		tabela[0][1] = 1 ;
		tabela[0][2] = 2 ;
		tabela[0][3] = 3 ;
		tabela[0][4] = 4 ;
		tabela[0][5] = 5 ;
		tabela[0][6] = 6 ;
		tabela[0][7] = 7 ;
		tabela[0][8] = 8 ;
		tabela[0][9] = 9 ;
		
		for (int x = 0 ; x<tabela[0].length; x++) {
			System.out.println(tabela[0][x]); // imprime todos elementos da linha 0
			
		}
		System.out.println("----------------------------"); // separacao de exemplos
		
		
		int[][]  nums = { {1,2,3},{4,5,6}, {7,8,9} }; // declarando um array 3x3
		
		
		for (int x = 0; x< 3; x++) { //para imprimir todos os itens de um
			for(int y =0 ; y < 3 ; y++) // for dentro de um for
			System.out.print(nums[x][y]+ " "); // imprime todos itens de um array
			System.out.println(); // pula uma linha para ficar no formato 3x3
		}
		
		
		
	}

}
