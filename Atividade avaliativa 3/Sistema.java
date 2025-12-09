import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {

    BufferedReader usuario = new BufferedReader(new InputStreamReader(System.in));
    Transportadora t = new Transportadora();

    public static void main(String[] args) throws Exception {
        
        Sistema sistema = new Sistema(); 
        boolean configCarregada = false;
    
        System.out.println("=== SISTEMA DE TRANSPORTADORA ===");
        
        while (!configCarregada) {
                System.out.print("Digite o arquivo de configuração: ");
                String config = sistema.usuario.readLine(); 
                configCarregada = sistema.t.carregarConfiguracoes(config); 
                
                if (!configCarregada) {
                    System.out.println("Falha ao carregar configurações. Tente novamente.");
                }
            }
        sistema.menu();
    }

    private void menu() throws Exception {
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println();
            System.out.println("--------Menu--------");
            System.out.println("1 - Importar arquivo de encomendas");
            System.out.println("2 - Exibir a lista de encomendas Normais");
            System.out.println("3 - Exibir a lista de encomendas Expressas");
            System.out.println("4 - Sair");
            System.out.println("--------------------");
            System.out.println("Escolha uma opção:");

            opcao = usuario.readLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do arquivo de dados de entrada:");
                    String arqDados = usuario.readLine();
                    t.importarDados(arqDados);
                    break;
                case "2":
                    exibirEN();
                    break;
                case "3":
                    exibirEE();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    break;

            }
        }
    }

    public void exibirEN() {
        System.out.println("\n=== ENCOMENDAS NORMAIS ===");
        System.out.println("Nro pedido | Data | Peso | Valor do Frete");
        
        for (int i = 0; i < t.getQtdEncomendasN(); i++) {
            EncomendaN encomenda = t.getEncomendaN(i);
            double frete = encomenda.calcularFrete();
            
            System.out.println(encomenda.getNumPedido() + ", " +
                               encomenda.getDataPostagem() + ", " + 
                               String.format("%.2f", encomenda.getPeso()) + ", R$ " + String.format("%.2f", frete));
            }
        }
    
    public void exibirEE() {
        System.out.println("\n=== ENCOMENDAS EXPRESSAS ===");
        System.out.println("Nro pedido | Data | Prazo | Peso | Fone | Frete");
        
        for (int i = 0; i < t.getQtdEncomendasE(); i++) {
            EncomendaE encomenda = t.getEncomendaE(i);
            if (encomenda != null) {
                double frete = encomenda.calcularFrete();
                System.out.println(encomenda.getNumPedido() + ", " + 
                                encomenda.getDataPostagem() + ", " +
                                encomenda.getPrazoEntrega() + ", " +
                                String.format("%.2f", encomenda.getPeso()) + ", " +
                                encomenda.getFone() + ", R$ " + String.format("%.2f", frete));
            }
        }
    }
}