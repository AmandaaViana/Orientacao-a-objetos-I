public class Utilizador {
    public static void main(String[]args){
        System.out.println("[Relogio de pulso]");
        RelogiodePulso rp = new RelogiodePulso();
        System.err.println(rp.getHoras());
        System.err.println(rp.iniciarCronometro());

        //por padrao n se pode instanciar uma interface a menos que se 
        //faça na hora uma implementaçao dos metodos 
        //recurso de uso restrito
        Relogio r = new Relogio() {
            public String getHoras(){
                return "um horario qualquer";
            }
        };


        System.out.println("[Radio Relogio]");
        RadioRelogio rr = new RadioRelogio();
        System.err.println(rr.ligar());
        System.out.println(rr.getHoras());
        System.out.println(rr.trocarEstacao(101.8f));
        System.out.println(rr.desligar());
    }
}
