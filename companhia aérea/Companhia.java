public class Companhia {
    
    private String nome;
    private String fone;
    private int qtdeVoos; 
    private Voo [] vetVoos;
    
    public Companhia(){
        this.vetVoos = new Voo[10];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getQtdeVoos() {
        return qtdeVoos;
    }
    public void setQtdeVoos(int qtdeVoos) {
        this.qtdeVoos = qtdeVoos;
    }
    
    public Voo getVoos(int pos){
        return vetVoos[pos];
    }
    public void setVoo(Voo v){
        if(this.qtdeVoos < 10){
            this.vetVoos[qtdeVoos] = v;
            qtdeVoos++;
        }
    }
}
