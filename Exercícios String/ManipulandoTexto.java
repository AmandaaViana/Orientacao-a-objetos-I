public class ManipulandoTexto {
    public static void main(String args[]) {
      
      String str1 = "A linguagem Java é poderosa e ";
      String str2 = "plataforma";
      String str3 = "";
      
      System.out.println("Frase original: " + str1); 
      
      str1 = str1.replace("linguagem", str2);
      
      str3 = str1; 
      System.out.println("Resultado final: " + str3);
    }
}