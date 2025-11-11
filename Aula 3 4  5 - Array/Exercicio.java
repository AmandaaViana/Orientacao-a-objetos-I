import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Exercicio {
    public static void main (String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in)
		);
        
        int[] vetA = new int[4];
        String[] vetB = new String[4];

        System.out.println("Informe 4 valores inteiros para o vetor A:");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("vetA[" + i + "]: ");
            
            // Wrapper Integer, conversão de String -> int
            vetA[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("\nInforme as 4 palavras para o vetor B:");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("vetB[" + i + "]: ");
            vetB[i] = (reader.readLine());
        }

        System.out.println("\nResultado:");
        for (int i = 0; i < vetA.length; i++) {
            String palavra = vetB[i].toUpperCase();
            for (int j = 0; j < vetA[i]; j++) {
                System.out.print(palavra + " ");
            }
        }

    }
}

