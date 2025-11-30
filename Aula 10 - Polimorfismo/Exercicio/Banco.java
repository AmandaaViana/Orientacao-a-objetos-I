public class Banco {
    public static void main(String[] args) {
        System.out.println("[Conta Corrente]");
        ContaCorrente cc1 = new ContaCorrente();
        cc1.depositar(1000);
        System.out.println("saldo: " + cc1.getSaldo());
        boolean sacou = cc1.sacar(100);
        if(sacou){
            System.out.println("Sacou 100");
        }else{
            System.out.println("Não foi possível sacar");
        }
        System.out.println("Saldo: " + cc1.getSaldo());
        sacou = cc1.sacar(900);
        if(sacou){
            System.out.println("Sacou 900");
        }else{
            System.out.println("Não foi possível sacar");
        }
        System.out.println("Saldo: " + cc1.getSaldo());

        System.out.println("[Conta Especial]");
        ContaEspecial ce1 = new ContaEspecial();
        ce1.depositar(2000);
        System.out.println("saldo: " + ce1.getSaldo());
        sacou = ce1.sacar(100);
        if(sacou){
            System.out.println("Sacou 100");
        }else{
            System.out.println("Não foi possível sacar");
        }
        System.out.println("Saldo: " + ce1.getSaldo());

        sacou = ce1.sacar(100, 0.001d);
        if(sacou){
            System.out.println("Sacou 100");
        }else{
            System.out.println("Não foi possível sacar");
        }
        System.out.println("Saldo: " + ce1.getSaldo());
    }
}
