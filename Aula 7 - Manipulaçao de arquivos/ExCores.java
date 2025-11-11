import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExCores {
    public static void main(String[] args) throws Exception {
        String saidaCor = "saidaCor.html";
        BufferedWriter gravarCor = new BufferedWriter(new FileWriter(saidaCor));
        String linha = "<html> <table width=\"400\" align=\"center\" border=\"1\">";
        gravarCor.write(linha);
        linha = "<tr><th>COR</th><th>HEXADECIMAL</th></tr>";
        gravarCor.write(linha);

        for(int i = 0; i < 16; i++){
            int red = 1;
            String hexRed = Integer.toHexString(red);
            for(int j = 0; j < 16; j++){
                int green = j;
                String hexGreen = Integer.toHexString(green);

                for(int k = 0; k < 16; k++){
                    int blue = k;
                    String hexBlue = Integer.toHexString(blue);

                    String cor = hexRed + "0" + hexGreen + "0" + hexBlue + "0";

                    linha = "<tr>";
                    gravarCor.write(linha);
                    gravarCor.newLine();

                    linha = "<td bgcolor='#" + cor + "'></td>" + "<td>" + cor + "</td>";
                    gravarCor.write(linha);
                    gravarCor.newLine();

                    linha = "</tr>";
                    gravarCor.write(linha);
                    gravarCor.newLine();
                }
            }
     }

        linha = "</table><html>";
        gravarCor.write(linha);
        gravarCor.newLine();
        gravarCor.close();
    }
 }
