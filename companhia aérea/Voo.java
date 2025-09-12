public class Voo {
    
    private int numVoo;
    private int qtdePassageiro;
    private String origem;
    private String destino;
    private String data;
    private Passageiro[] vetPassageiros;

    public Voo(){
        this.vetPassageiros = new Passageiro[50];
    }

    public int getNumVoo(){
        return numVoo;
    }
    public void setNumVoo(int numVoo){
        this.numVoo = numVoo;
    }
    
    public int getQtdePassageiro(){
        return qtdePassageiro;
    }
    public void setQtdePassageiro(int qtdePassageiro){
        this.qtdePassageiro = qtdePassageiro;
    }

    public String getOrigem(){
        return origem;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }

    public int getDestino(){
        return destino;
    }
    public void setDestino(int destino){
        this.destino = destino;
    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public Aluno getPassageiro(int pos) {
        return vetPassageiros[pos];
    }
    public void setPassageiro(Aluno a) { //Adiciona um novo aluno no vetor
        if(this.qtdePassageiros < 50){
            this.vetPassageiros[qtdePassageiros] = a;
            qtdePassageiros++;
        }
    }   


}
