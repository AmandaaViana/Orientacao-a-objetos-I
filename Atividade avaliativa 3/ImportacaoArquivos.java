public interface ImportacaoArquivos {
    boolean carregarConfiguracoes(String arqConfig);//carrega os preços do frete
    void importarDados(String arqDadosEntrada);//carrega os pedidos dos clientes
} 
