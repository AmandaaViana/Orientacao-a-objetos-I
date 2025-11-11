import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ManipulacaoArquivos {
    public static void main(String[] args) throws Exception {
        //Entrada do Usuário (Margem de Lucro)
        BufferedReader leitorUsuario = new BufferedReader(new InputStreamReader(System.in));

        String arqEntrada;
        String arqSaida;

        System.out.println("----- SISTEMA DE CÁLCULO DE PREÇO DE VENDA -----\n");
        System.out.print("Digite o nome do arquivo de entrada: (Padrão: preco_custo.csv) ");
        arqEntrada = leitorUsuario.readLine();
        if (arqEntrada.isEmpty()) {
            arqEntrada = "preco_custo.csv";
        }

        System.out.println("\nDigite a margem de lucro desejada (em %): ");
        String margemLucro = leitorUsuario.readLine();

        System.out.print("\nDigite o nome do arquivo de saída: (Padrão: preco_venda.csv) ");
        arqSaida = leitorUsuario.readLine();
        if (arqSaida.isEmpty()) {
            arqSaida = "preco_venda.csv";
        }

        leitorUsuario.close();

        float margem = Float.parseFloat(margemLucro);//converte para float o valor digitado
        float fatorLucro = 1 + (margem / 100);
    
        //Manipulação dos Arquivos
        BufferedReader arqLeitura = new BufferedReader(new FileReader(arqEntrada));
        BufferedWriter arqEscrita = new BufferedWriter(new FileWriter(arqSaida));
        BufferedWriter arqCompra = new BufferedWriter(new FileWriter("comprar.csv"));

        arqEscrita.write("codigo;nome_produto;preco_venda");
        arqEscrita.newLine();

        arqLeitura.readLine(); // Pula o cabeçalho do arquivo de entrada

        //Cabeçalho do Arquivo de Compras
        arqCompra.write("codigo;estoque;nome_produto;preco_custo;categoria");
        arqCompra.newLine();

        //loop e logiaca de estoque
        String linhaLida;
        while ((linhaLida = arqLeitura.readLine()) != null) {

            String[] campos = linhaLida.split(";"); //Separação dos Campos

            //Captura dos Campos
            String codigo = campos[0];
            int estoque = Integer.parseInt(campos[1]); 
            String nomeProduto = campos[2];
            double precoCusto = Double.parseDouble(campos[3].replace(",", "."));
            String categoria = campos[4]; 

            double precoVenda = precoCusto * fatorLucro;
            
            //Montagem da Linha de Saída          
            String precoVendaFormatado = String.format("%.2f", precoVenda); 
    
            String linhaEscrita = codigo + ";" + nomeProduto + ";" + precoVendaFormatado;
            
            arqEscrita.write(linhaEscrita);
            arqEscrita.newLine();

            if (estoque < 10) { //Para o arquivo de compra
                
                String precoCustoFormatado = String.format("%.2f", precoCusto); 
                String linhaCompra = codigo + ";" + estoque + ";" + nomeProduto + ";" + precoCustoFormatado + ";" + categoria;
                
                arqCompra.write(linhaCompra);
                arqCompra.newLine();
            }
        }

        arqLeitura.close();
        arqEscrita.close();
        arqCompra.close(); 
        
        System.out.println("\n----- PROCESSAMENTO CONCLUÍDO -----");
        System.out.println("Arquivo de vendas gerado: " + arqSaida);
        System.out.println("Arquivo de produtos para compra gerado: comprar.csv\n");
    }
}