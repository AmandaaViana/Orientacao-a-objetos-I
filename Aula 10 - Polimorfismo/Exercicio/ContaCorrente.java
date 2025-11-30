
public class ContaCorrente {
    private String numeroConta;
    private String nomeCliente;
    private double saldo;

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(String nc){
        this.numeroConta = nc;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setNomeCliente(String cli){
        this.nomeCliente = cli;
    }    

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double s){
        this.saldo = s;
    } 

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        boolean resultado = false;
        double taxa = 0.005d;
        if(this.saldo >= (valor + (valor * taxa))){
            this.saldo = this.saldo - valor - (valor * taxa);
            resultado = true;
        }
        return resultado;
    }
}
