public class EncomendaE extends EncomendaN {
    
    private static double precoKgE; //armazena o preco por kg da encomenda 
    private int prazoEntrega;
    private String fone;

     //construtor herdado de encomenda normal
    public EncomendaE(String numPedido, String dataPostagem, double peso, int prazoEntrega, String fone) {
        super(numPedido, dataPostagem, peso);
        this.prazoEntrega = prazoEntrega;
        this.fone = fone;
    }

    @Override //polimorfismo de sobreposição 
    public double calcularFrete(){
        
        double valorBase = this.getPeso() * precoKgE; 
        
        if (prazoEntrega <= 2) {   //regra especifica
            return valorBase * 1.25;  
        }
    
    return valorBase;
    }

    @Override
    public String toString() {
        return String.format("Nro Pedido: %s (EXP), Peso: %.2f Kg, Valor do Frete: R$ %.2f", 
                             getNumPedido(), getPeso(), calcularFrete());
    }

    public static void setPrecoKgE(double precoKgE) {
        EncomendaE.precoKgE = precoKgE;
    }
    public static double getPrecoKgE() {
        return precoKgE;
    }   
    
    public int getPrazoEntrega() {
        return prazoEntrega;
    }
    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
}
