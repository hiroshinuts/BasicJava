package estudando.java.se;


/*
 * 
 * forEACH (para cada)  um laço de repetição FOR ,para cada elemento da lista (EACH)
 * 
 * 
 *      for (<variavel> : <array>)
 * ex:  for ( int item : lista)
 * 
 * 		int [] lista = new int[2];
 * 		lista[0] = 10;
 * 		lista[1] = 20;
 *  	lista[3] = 30;
 *  
 *  	for( int item : lista) {
 *  		item ** indica o local de memoria da posicao lista[0]
 *  				indica o local  de memoria da posicao lista[1]
 *  				indica o local de memoria da posicao lista [2]
 *  
 *  	}
 * 
 * 
 * 
 */


public class forEach {
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
			nums[0] = 125;
			nums[1] = 5487;
			nums[2] = 45;
			nums[3] = 457;
			nums[4] = 887;
			nums[5] = 1;
			nums[6] = 4087;
			nums[7] = 1287;
			nums[8] = 5456;
			nums[9] = 789841;
		//////////////// MEDIA ARITMETICA
			
			int soma = 0;
			for(int item : nums) {
				soma += item;
				System.out.println(item); // imprime todos os valores de nums
			}
		
			float media = (float) soma /nums.length;
		
		System.out.println("A media aritmetica é : " +media); 
		
         //////////////// MENOR VALOR DA LISTA	
	int menor = 0;
	for(int item : nums) {
		if (item < menor || menor ==0)
		menor = item;
	}
	
	System.out.println("O menor valor da lista é: " + menor);
	
	/////////////////// MAIOR ITEM DA LISTA
	
	
	int maior = 0;
	
	for(int item : nums) {
		if (!(item < maior)|| maior==0)
		maior = item;
	}
	
	System.out.println("O menor valor da lista é: " + maior);
	
	
	////////////////////// OUTRA MANEIRA DE MAIOR
	
	int maiordois = 0;
			
	for (int item : nums) {
		if (item > maiordois)
			maiordois = item;
	}
			System.out.println("O maior valor da lista é :" + maiordois);
	
	}
	
}
