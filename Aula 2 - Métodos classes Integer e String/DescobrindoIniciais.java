public class DescobrindoIniciais {
    public static void main(String[] args) {
      
        String nomeCompleto = "Ana Carolina Souza";
        String iniciais = "";
        int cont = 1;
        
        iniciais += nomeCompleto.substring(0, 1);
        
        for (int i = 0; i < nomeCompleto.length(); i++) {
            if (nomeCompleto.substring(i, i + 1).equals(" ")) {
                iniciais += nomeCompleto.substring(i + 1, i + 2);
                cont++;
            }
        }
        
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Iniciais: " + iniciais);
        System.out.println("Total de palavras: " + cont);
    }
}
