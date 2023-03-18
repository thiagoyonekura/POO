/*Repetições
Desenvolva um programa em Java que leia um array com 20 números inteiros. O programa
deve imprimir os elementos do vetor exceto os elementos repetidos.*/

package Exercicios;
import java.util.Scanner;
public class Repeticoes {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		int num[] = new int[20];
		boolean b;
		for(int i=0; i < num.length; i++) {
			System.out.println("Digite o "+ i +"º número:");
			num[i] = leitor.nextInt();
		}
		for(int i=0; i < num.length; i++) {
			b = false;
			for(int j=0; j < i; j++) {
				if(num[i]==num[j]) {
					b = true;
					break;
				}
			}
		if(b == false) {
			System.out.println(num[i]);
		}
		}
	}
}
