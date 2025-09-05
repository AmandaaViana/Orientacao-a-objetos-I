public class ExemploString{
	public static void main (String args[]) {
		String str1, str2, str3;
		str1 = "Um texto qualquer...   ";
		System.out.println("[" + str1 + "]");
		str1 = str1.trim();
		System.out.println("Apos o trim[" + str1 + "]");
		System.out.println("Tamanho do str1: " + str1.length());
		
		//subtituir um substring dentro de um string
		str2 = str1.replace("texto", "teste");
		System.out.println("[" + str2 + "]");
		str2 = str2.replace("t", "AAA");
		System.out.println("[" + str2 + "]");
		
		//extrair um substring 
		str2 = str1.substring(6, 10);//6 inclusive ,10 exclusive
		System.out.println("[" + str2 + "]");
		
		//procurar substring
		str1 =  "amandaviana.ahv@gmail.com";
		int posicao = str1.indexOf("@");
		System.out.println("@ esta na posiçao " + posicao);
		System.out.println("Usuario: " + str1.substring(0, str1.indexOf("@")));
		String dominio = str1.substring(str1.indexOf("@") + 1, str1.length());
		System.out.println("Dominio: " + dominio.toUpperCase());
		/*toUpperCase() = transformar para maiusculas
		 *toLoweCase() = transformar para minusculas
		 */
		 
		 //converter de outros tipos de string
		 int valor = 5;
		 str3 = String.valueOf(valor);
		 System.out.println("Srt3: " + str3);
		 
		 //quebrar um String em valor
		 String valores = "4/7/22/7/0/5";
		 String[] arrayValores = valores.split("/");
		 System.out.println("arrayValores[1] = " + arrayValores[1]);
		 
		 //percorra o vetor  arrayValores mostrando tds os valores na tela
		
	}
}

