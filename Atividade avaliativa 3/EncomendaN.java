public class EncomendaN {

    private static double precoKg; //armazena o preco por kg da encomenda
    private String numPedido;
    private String dataPostagem;
    private double peso;
    
    //construtor
    public EncomendaN(String numPedido, String dataPostagem, double peso) {
        this.numPedido = numPedido;
        this.dataPostagem = dataPostagem;
        this.peso = peso;
    }

    //metodo de calculo do frete
    public double calcularFrete(){
        return this.peso * precoKg;
    }

    public String toString(){
        return String.format("Nro Pedido: %s, Peso: %.2f Kg, Valor do Frete: R$ %.2f", 
                             numPedido, peso, calcularFrete());
    }

    public static void setPrecoKg(double precoKg) {
        EncomendaN.precoKg = precoKg;
    }
    public static double getPrecoKg() {
        return precoKg;
    }

    
    public String getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }
    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

}
