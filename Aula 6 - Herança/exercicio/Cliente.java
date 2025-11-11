package exercicio;

public class Cliente extends Pessoa {
    private String dataCompra;
    private float valorCompra;

    public Cliente(){}

    public Cliente(String d, float v,String nome, String cpf, String email, String fone){
        this.dataCompra = d;
        this.valorCompra = v;
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setFone(fone);
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

}
