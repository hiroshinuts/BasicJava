package estudando.java.se;

public class OperadoresDeAtribuição {

	/*
	 * 
	 *  Valor atribuido pelo Java da direita para a esquerda. 
	 *  
	 *  Por exemplo : Somando 1 na variavael i = variavel i
	 *  
	 */
	
	
	
	public static void main(String[] args) {
		
	
		
	int i = 0;
	
	// i = i +1 ;
	
	i += 1;
	System.out.println(i);
	
	i = i+ 1 ;
	System.out.println(i);
	
	
	/*
	 * 
	 * Os operadores de atribuição
	 * 
	 * x += y;
	 * x -= y;
	 * 
	 * x *= y;
	 * x /= y;
	 * x %= y;
	 * 
	 * 
	 * 
	 */
	

	 // EXEMPLO
	
	int x = 12;
	int y = 4;
	
	x = 12;
	System.out.println( "Operador x += y é :"+ (x += y));
	
	x = 12;
	System.out.println("Operadorx -= y é :"+ ( x -= y));
	
	x = 12;
	System.out.println("Operadorx /= y é :"+ ( x /= y));
	
	x = 12;
	System.out.println("Operadorx * y é :"+ ( x *= y));
	
	
	
	}
}
