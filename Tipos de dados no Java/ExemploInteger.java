public class ExemploInteger{
	public static void main (String args[]) {
		String s1 = "10";
		System.out.println("s1: " + s1);
		
		//converter de string pr int
		int i1 = Integer.parseInt(s1);
		System.out.println("i1: " + i1);
		
		//converter de  Integer pr string
		Integer i2 = 5;
		s1 = i2.toString();
		s1 = Integer.toString(i2);
		//s1 = il.toString();//n e possivel pois il é um tipo primitivo
		
		//converter pr float
		float f1 = i2.floatValue() / 3;
		System.out.println("f1: " + f1);
		System.out.println("i1: " + String.format("%.2f", f1));
		
		//comparaçoes
		Integer i3 = 10;
		int i4 = 10;
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
	}
}

