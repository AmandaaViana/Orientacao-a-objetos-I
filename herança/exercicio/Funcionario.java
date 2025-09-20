package exercicio;

public class Funcionario extends Pessoa {
    private float salario;
    private String dataAdmissao;

    public Funcionario(){}

    public Funcionario(float s, String d,String nome, String cpf, String email, String fone){
        this.salario = s;
        this.dataAdmissao = d;
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setFone(fone);
    }
    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    
}
