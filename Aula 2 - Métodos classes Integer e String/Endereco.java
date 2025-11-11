public class Endereco {
    public static void main(String[] args) {
      
        String s1 = "IFPR - Campus Foz do Iguaçu - Avenida Araucária, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Paraná - (45)3422-5348";
        
        int posicaoCEP = s1.indexOf("CEP: ") + 5;
        int fimCEP = s1.indexOf(" - ", posicaoCEP); 
        String cep = s1.substring(posicaoCEP, fimCEP);
        
        int posicaoTelefone = s1.indexOf("(");
        String telefone = s1.substring(posicaoTelefone);
 
        String ultimos4Digitos = telefone.substring(telefone.length() - 4);
        
        int numero = Integer.parseInt(ultimos4Digitos);
        int resultado = numero / 2;
        
        System.out.println("String completa: " + s1);
        System.out.println("CEP do campus: " + cep);
        System.out.println("Telefone do campus: " + telefone);
        System.out.println("Últimos 4 dígitos do telefone: " + ultimos4Digitos);
        System.out.println("Resultado da divisão por 2: " + resultado);
    }
}