import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploVet1 {
	
	public static void main (String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in)
		);
		//declara um vetor de int ja distribuindo os valores
		int[] vetValores = {2, 5, 3, 7, 4, 6, 8, 0};
		System.out.println("vetValores[0] = " + vetValores[0]);
		
		//declara um vetor de string com 12 posiçoes
		String meses[] = new String[12];
		meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Março";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";
		
		int num = -1;
		while(num !=0){
			System.out.println("Informe o numero do mes ou 0 para sair:  ");
			num = Integer.parseInt(reader.readLine());
			System.out.println("O mes é " + meses[num - 1]);
		}
	}
}

