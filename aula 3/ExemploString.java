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
	}
}

