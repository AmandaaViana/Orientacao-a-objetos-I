public class OperacaoMatematica {
	
	public int somar (int num1, int num2){
		return num1 + num2;
	}
	public int menos (int num1, int num2){
		return num1 - num2;
	}
	public int vezes (int num1, int num2){
		return num1 * num2;
	}
	public float dividir (float num1, float num2){
		if(num2 == 0){
		return 0;
		}else{
		return num1 / num2;
		}
	}
}
