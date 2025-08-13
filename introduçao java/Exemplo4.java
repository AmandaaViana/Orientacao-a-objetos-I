public class Exemplo4 {
	
	public static void main (String[] args) {
		OperacaoMatematica opMat = new OperacaoMatematica();
		
		System.out.println("5 - 6 = " + opMat.menos(5,6));
		System.out.println("5 + 6 = " + opMat.somar(5,6));
		System.out.println("5 * 6 = " + opMat.vezes(5,6));
		System.out.println("5 / 6 = " + opMat.dividir(5,6));
	}
}

