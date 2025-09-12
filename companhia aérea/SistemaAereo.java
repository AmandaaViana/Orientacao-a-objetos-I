import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaAereo {
    BufferedReader reader;
    Companhia c1;
    public static void main(String[] args) throws Exception {
        SistemaAereo sa = new SistemaAereo();
        sa.c1 = new Companhia();
        sa.reader = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Nome da Companhia: ");
        sa.c1.setNome(sa.reader.readLine());
        System.out.println("Telefone: ");
        sa.c1.setFone(sa.reader.readLine());
        sa.menu();
    }
    private void menu() throws Exception{
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("----------------------------");
            System.out.println("[1] Cadastrar vôo");
            System.out.println("[2] Listar vôos");
            System.out.println("[3] Consultar um determinado vôo");
            System.out.println("[4] Sair"); 
            opcao = this.reader.readLine();
            switch(opcao){
                case "1":
                
                    break;
                case "2":
                
                    break;
                case "3":
                
                    break;
                default:
                    break;
            
            }
        }
    }
    
}

