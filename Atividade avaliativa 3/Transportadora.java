import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Transportadora implements ImportacaoArquivos {
    private static int VETOR = 1000;

    //atributos
    private EncomendaN[] vetorEncomendas;
    private EncomendaE[] vetorEncomendasE;
    private int qtdEncomendasN;
    private int qtdEncomendasE;

    //construtor
    public Transportadora() {
        this.vetorEncomendas = new EncomendaN[VETOR];
        this.vetorEncomendasE = new EncomendaE[VETOR];
        this.qtdEncomendasN = 0;
        this.qtdEncomendasE = 0;
    }

    //métodos
    @Override
    public boolean carregarConfiguracoes(String arqConfig) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arqConfig));
            String linha = leitor.readLine(); // Pula cabeçalho

            while ((linha = leitor.readLine()) != null) {
                String[] parte = linha.split(";");
                String sigla = parte[1]; // sigla tipo: EN ou EE 
                double preco = Double.parseDouble(parte[2]);

                if (sigla.equals("EN")) {
                    EncomendaN.setPrecoKg(preco);
                } else if (sigla.equals("EE")) {
                    EncomendaE.setPrecoKgE(preco);
                }
            }
            leitor.close();
            System.out.println("Configurações carregadas!");
            return true;
        } catch (IOException e) {
            System.err.println("ERRO ao importar dados: " + e.getMessage());
            return false;
        }
    }

    @Override
    public void importarDados(String arqDadosEntrada) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arqDadosEntrada));
            leitor.readLine(); // Pula cabeçalho

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] parte = linha.split(";");
                String tipo = parte[2]; // Tipo de encomenda: EN ou EE

                    if (tipo.equals("EN") && qtdEncomendasN < VETOR) {
                            // Cria encomenda normal
                            String numPedido = parte[0].trim();
                            String data = parte[1].trim();
                            double peso = Double.parseDouble(parte[4].trim());

                            EncomendaN encomenda = new EncomendaN(numPedido, data, peso);
                            vetorEncomendas[qtdEncomendasN] = encomenda;
                            qtdEncomendasN++;

                        } else if (tipo.equals("EE") && qtdEncomendasE < VETOR) {
                            // Cria encomenda expressa
                            String numPedido = parte[0].trim();
                            String data = parte[1].trim();
                            double peso = Double.parseDouble(parte[4].trim());
                            int prazo = Integer.parseInt(parte[3].trim());
                            String fone = parte[5].trim();
                            
                            EncomendaE encomenda = new EncomendaE(numPedido, data, peso, prazo, fone);
                            vetorEncomendasE[qtdEncomendasE] = encomenda;
                            qtdEncomendasE++;
                        }
            }
            leitor.close();
            System.out.println("Dados importados com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao importar dados: " + e.getMessage());
        }
    }
    
    // getters e setters
    public EncomendaN getEncomendaN(int indice) {
        if (indice >= 0 && indice < getQtdEncomendasN()) {
            return vetorEncomendas[indice];
        }
        return null;
    }

    public EncomendaE getEncomendaE(int indice) {
        if (indice >= 0 && indice < getQtdEncomendasE()) {
            return vetorEncomendasE[indice];
        }
        return null;
    }

    public EncomendaN[] getVetorEncomendas() {
        return vetorEncomendas;
    }
    public void setVetorEncomendas(EncomendaN[] vetorEncomendas) {
        this.vetorEncomendas = vetorEncomendas;
    }

    public EncomendaE[] getVetorEncomendasE() {
        return vetorEncomendasE;
    }
    public void setVetorEncomendasE(EncomendaE[] vetorEncomendasE) {
        this.vetorEncomendasE = vetorEncomendasE;
    }

    public int getQtdEncomendasN() {
        return qtdEncomendasN;
    }
    public void setQtdEncomendasN(int qtdEncomendasN) {
        this.qtdEncomendasN = qtdEncomendasN;
    }

    public int getQtdEncomendasE() {
        return qtdEncomendasE;
    }
    public void setQtdEncomendasE(int qtdEncomendasE) {
        this.qtdEncomendasE = qtdEncomendasE;
    }
}
