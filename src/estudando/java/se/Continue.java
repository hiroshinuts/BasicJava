package estudando.java.se;

/*
 * 
 * A instrucao continue é utilizada dentro de um looping no momento em que desejarmos encerrrar um ciclo.
 * 
 * Ao contrario da instrucao break, que encerra o looping a instrucao continue encerra somente um unico ciclo
 * 
 */


public class Continue {
	
	public static void main(String[] args) {
		System.out.println("Imprime os numeros pares de 0 a 100");
		for(int i=0; i<=100; i++) {
			if (i % 2==0)
				System.out.println(i);
			else
				continue;
			System.out.println("*");
			System.out.println("*");
		}
		
	}

}
