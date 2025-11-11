public class Decisao {
	
	public static void main (String args[]) {
		
		if(args.length < 2){
			System.out.println("Precisa de 2 paramentros.");
			System.exit(0);
			}
		int val1 = Integer.parseInt(args[0]);//converte string pr int
		int val2 = Integer.parseInt(args[1]);
		
		OperacaoMatematica opMat = new OperacaoMatematica();
		
		System.out.println(args[0] + "*" + args[1] + "= " opMat.vezes(val1,val2));
	}
}

