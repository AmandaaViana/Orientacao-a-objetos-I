public class Exemplo3 {
	
	public static void main (String[] args) { //javac Exemplo3.java compila
		String cliente = "Amanda";            //java Exemplo3 pr executar
		
		Pet pet1 = new Pet();//instancia um objeto da classe pet
		pet1.especie = "Cadela";
		pet1.nome = "Lia";
		pet1.idade = 9;
		
		System.out.println("O cliente é " + cliente + "possui um pet chamado " + pet1.nome + " que é " + pet1.especie + " e tem " + pet1.idade + " anos.");
		
		Pet pet2 = new Pet();
		pet2.especie = "Gato";
		pet2.nome = "Miau";
		pet2.idade = 10;
	}
}

