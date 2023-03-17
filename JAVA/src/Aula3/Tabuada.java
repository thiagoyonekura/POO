package Aula3;
import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		int n;
		System.out.println("Digite um numero de 1 a 10:");
		n = leitor.nextInt();
		if(n==0) {
			System.out.println("Digite um número diferente de 0");
		} else {
			for(int i=1; i<=10; i++) {
				System.out.println(n+ " x "+ i+ " = "+ n*i);
			}
			
		}
	}
}
