public class ExemploString{
	public static void  main(String args[]){
		String str1 , str2, str3;
		str1 = "Um texto qualquer ...    ";
		System.out.println("[" + str1 + "]");
		str1 = str1.trim();
		System.out.println("após o trim [" + str1 + "]");
		System.out.println("Tamanho do str1: " + str1.length());
	}

}
