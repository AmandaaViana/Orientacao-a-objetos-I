public class ExemploInteger{
	public static void main(String args[]){
		String s1 = "10";
		System.out.println("s1: " + s1);
		
		//converter string para int
		int i1 = Integer.parseInt(s1);
		System.out.println("i1: " + i1);
		
		//converter de Integer para String
		Integer i2 = 5;
		s1 = i2.toString();
		s1 = Integer.toString(12);
		s1 = i1.toString(); //não e possível pois il é tipo primitivo
		
		
		//converter de Integer para Floart
		float f1 - 12.floatValue() / 3.
		System.out.println("f1: " + f1);
		System.out.println("f1: " + String.format("%.02f", f1));
		
		//comparações
		Integer i3 = 10;
		int i4 = 10;
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
	}
	
}

