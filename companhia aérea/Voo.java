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
    public void setQtdePassageiro(int qtdePassageiros){
        this.qtdePassageiro = qtdePassageiros;
    }

    public String getOrigem(){
        return origem;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }

    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public Passageiro getPassageiro(int pos) {
        return vetPassageiros[pos];
    }
    public void setPassageiro(Passageiro p) { //Adiciona um novo passageiro no vetor
        if(this.qtdePassageiro < 50){
            this.vetPassageiros[qtdePassageiro] = p;
            qtdePassageiro++;
        }
    }   


}
