package exercicio;

public class Vendedor extends Funcionario {
    private String usuario;
    private String senha;
    private String comissao;
    private int totalVendas;

    public Vendedor(String u, String s, String c, int t, float salario, String dataAdmissao,String nome, String cpf, String email, String fone){
        this.usuario = u;
        this.senha = s;
        this.comissao = c;
        this.totalVendas = t;
        super.setSalario(salario);
        super.setDataAdmissao(dataAdmissao);
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setFone(fone);
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getComissao() {
        return comissao;
    }
    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    

}
