public class Vendedor {

    //sobrecarga de metodo / overload
    public float calcularComissao(float venda){
        float comissao = (venda * 0.05f) + 20.0f;
        return comissao;
    }

    public float calcularComissao(float venda, float perc){
        float comissao = venda * perc;
        return comissao;
    }
}
