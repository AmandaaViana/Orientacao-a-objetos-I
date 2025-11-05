import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ManipulacaoArquivos {
    public static void main(String[] args) throws Exception {
        //Entrada do Usuário (Margem de Lucro)
        BufferedReader leitorUsuario = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite a margem de lucro desejada (em %): ");
        String margemLucro = leitorUsuario.readLine();

        float margem = Float.parseFloat(margemLucro);//converte para float o valor digitado
        float fatorLucro = 1 + (margem / 100);

        leitorUsuario.close();
    
        //Manipulação dos Arquivos
        String arqEntrada = "preco_custo.csv";
        String arqSaida = "preco_venda.csv";

        BufferedReader arqLeitura = new BufferedReader(new FileReader(arqEntrada));
        BufferedWriter arqEscrita = new BufferedWriter(new FileWriter(arqSaida));

        arqEscrita.write("codigo;nome_produto;preco_venda");
        arqEscrita.newLine();

        arqLeitura.readLine(); // Pula o cabeçalho do arquivo de entrada

        //Preparação da Tabela e Início do Loop
        String linhaLida;
        while ((linhaLida = arqLeitura.readLine()) != null) {

            String[] campos = linhaLida.split(";"); //Separação dos Campos

            String codigo = campos[0];//Captura o Código (Posição 0)
            String nomeProduto = campos[2];//Captura o Nome do Produto (Posição 2)

            double precoCusto = Double.parseDouble(campos[3].replace(",", "."));
            
            double precoVenda = precoCusto * fatorLucro;
            
            // 5. Montagem da Linha de Saída          
            String precoVendaFormatado = String.format("%.2f", precoVenda); 
    
            String linhaEscrita = codigo + ";" + nomeProduto + ";" + precoVendaFormatado;
            
            arqEscrita.write(linhaEscrita);
            arqEscrita.newLine();
        }

        arqLeitura.close();
        arqEscrita.close();
    }

   
}