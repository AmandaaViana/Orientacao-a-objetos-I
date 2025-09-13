import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaAereo {
    BufferedReader reader;
    Companhia comp;
    public static void main(String[] args) throws Exception {
        SistemaAereo sa = new SistemaAereo();
        sa.comp= new Companhia();
        sa.reader = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Informe o nome da Companhia: ");
        sa.comp.setNome(sa.reader.readLine());
        sa.menu();
    }
    private void menu() throws Exception{
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("--------Menu--------");
            System.out.println("1 - Cadastrar voo");
            System.out.println("2 - Listar voos");
            System.out.println("3 - Consultar um voo");
            System.out.println("4 - Sair"); 
            System.out.println("--------------------");
            opcao = this.reader.readLine();
            switch(opcao){
                case "1":
                    cadastrar();
                    break;
                case "2":
                    listar();
                    break;
                case "3":
                
                    break;
                default:
                    break;
            
            }
        }
    }
    //cadastrar voo
    private void cadastrar() throws Exception{
        Voo v = new Voo();
        System.out.println("-----Cadastro de Voo-----");
        System.out.println("Numero do Voo");
        v.setNumVoo(Integer.parseInt(reader.readLine()));

        System.out.println("Informe a origem do voo");
        v.setOrigem(reader.readLine());
        System.out.println("Informe o destino do voo");
        v.setDestino(reader.readLine());
        System.out.println("Informe a data do voo");
        v.setData(reader.readLine());

        System.out.println("-------Passageiros-------");
        for(int i = 0; i < 50; i++){
            System.out.println("Nome do passageiro");
            String nome = reader.readLine();
            if (nome.equals("")) {
                break;
            }
            Passageiro p = new Passageiro();
            p.setNome(nome);
            System.out.println("Informe a data de nascimento:");
            p.setNascimento(reader.readLine());
            System.out.println("Informe a nacionalidade:");
            p.setNacionalidade(reader.readLine());
            System.out.println("Informe o passaporte:");
            p.setpassaporte(reader.readLine());
            System.out.println("Informe o e-mail:");
            p.setEmail(reader.readLine());
            System.out.println("Informe o telefone:");
            p.setFone(reader.readLine());
        }
        comp.setVoo(v);
    }
    //listar voos
    private void listar() {
        System.out.println("-----Lista dos voos-----");

        if (qtdeVoo == 0 ){
            System.out.println("Nenhum voo disponivel");
            return;
        }
        for(int i = 0; i < comp.getQtdeVoos(); i++){
            Voo v = comp.getVoos(i);
            System.out.println("Origem:" + v.getOrigem() + 
                               "Destino:" + v.getDestino() + 
                               "Data:" + v.getData());
        }
    }
    //consultar o voo
    private void consultar(){
        System.out.println("Consultar");
        System.out.println("Qual voo deseja ver:");

    }
    
}

