import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExCores {
    public static void main(String[] args) throws Exception {
        String saidaCor = "saidaCor.html";
        BufferedWriter gravarCor = new BufferedWriter(new FileWriter(saidaCor));
        String linha = "Cor;Código Hexadecimal";
        gravarCor.write(linha);
        gravarCor.newLine();

        for(int i = 0; i < 16; i++){
            int red = 1;
        }
    }
}
