package estudando.java.se;


/*
 *  Break é utilizado dentro de um looping no momento em que desejamos encerrar o mesmo, Ou seja,nao precisamos esperar a condicao ser finalizada,
 *  podemos interromper o laço a qualquer momento.
 * 
 * 
 * 
 */

public class Break {
	
	public static void main(String[] args) {
		
		labelForI : for (int i = 0 ; i <= 10 ; i++) { // primeiro bloco
			
				for(int j = 0 ; j <= 10 ; j++) { //for dentro de outro for
					System.out.println("O valor de i="+i+" O valor de J é:" +j);
					if(j==9 && i==3)
						break labelForI;
					
				}
			
		}
		
		System.out.println("----------------------");
		
	}

}
