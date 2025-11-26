public class Loja {
    public static void main(String[] args){
        Vendedor v1 = new Vendedor();
        float comissao = v1.calcularComissao(500.50f);
        System.out.println("Comissao de venda 1: " + comissao);

        float comissao2 = v1.calcularComissao(500.50f, 0.15f);
        System.out.println("Comissao de venda 2: " + comissao2);
    }
}
