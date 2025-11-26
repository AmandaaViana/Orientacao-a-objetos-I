public class ContaCorrente {
    
    private String numeroConta;
    private String nomeCliente;
    private double saldo;

    //depositar 
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    //sacar
    public boolean sacar(double valor){
        boolean resultado = false;
        double taxa = 0.005d;
        if (this.saldo >= (valor + (valor * taxa))) {
            this.saldo
            resultado = true;
        }
        return resultado;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    
}
