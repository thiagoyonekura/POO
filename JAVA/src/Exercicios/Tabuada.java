package Exercicios;

public class Tabuada {
	/*public static void main(String args []) {
		System.out.println("------------------------Código Tabuada!!!-------------------\n");
		
		
		//*for(int i =1; i<=10; i++ ){
		
			int num1=1;
			int num2 =2;
			int num3 =3;
			int num4 =4;
			int num5 =5;
			System.out.println(num1 +" x " +i+ " = "+(num1*i)  + "\t"+ ( num2 +" x " +i+ " = "+(num2*i) + "\t" + (num3 + " x " +i+ " = "+(num3 *i) 
					+ "\t"+(num4 + " x " +i+ " = "+ (num4*i) + "\t"+(num5 + " x " +i+ " = "+ (num5*i))))));
			
		}
		
		System.out.println(" ");
		for(int i=1; i<=10; i++) {
			int num6 =6;
			int num7 =7;
			int num8 =8;
			int num9 =9;
			int num10 =10;
			
			
			System.out.println(num6 + " x "+i+" = "+ (num6 *i)+"\t"+(num7+ " x "+i+ " = "+(num7*i)+"\t"+(num8+ " x "+i+" = "+(num8*i)
					+ "\t"+(num9 +" x "+i+" = "+(num9*9)+"\t"+(num10 +" x "+i+" = "+(num10*i))))));
		}
	}*/


public static void main(String args[]) {
	System.out.println("------------------------Código Tabuada!!!-------------------\n");
	
	
	for (int i=0; i<=10; i++) {
		int j=i;
		
		System.out.println(1 +" x "+i+" = "+j*1+"\t"+ (2 +" x "+i+" = "+j*2)+"\t"+(3+ " x "+i+" = "+ j*3+"\t"+(4+" x "+ i+" = "+ j*4+"\t"+ 5+ " x "+i+" = "+j*5)));
	}
	
	System.out.println("");
	for( int i=0; i<=10;i++) {
		int v=i;
		System.out.println(6+ " x "+ i+" = "+v*6+"\t"+(7+ " x "+ i+" = "+ v*7+"\t"+ 8+ " x "+i+" = "+v*8+"\t"+ 9+" x "+ i+" = "+ v*9+"\t"+(10+" x "+ i+ " = "+ v*10)));
	}
}
}
