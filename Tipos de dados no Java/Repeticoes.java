public class Repeticoes{
	public static void main (String args[]) {
	int qtde = 5;
	
	//para
	System.out.println("Repetiçao do tipo for: ");
		for (int i = 0; i < qtde; i++){
			System.out.println(i);
			}//poderia ser (int i = 10;  i > qtde; i--)

	//enquanto
	System.out.println("Repetiçao do tipo while: ");
	int cont = 0;
		while (cont <= qtde){
			System.out.println(cont);
			cont++;
			}
		
	//faça enquanto
	System.out.println("Repetiçao do tipo do-while: ");
	int cont = 0;
		do{
			System.out.println(cont);
			cont++;
			} while (cont <= qtde);
	
}
