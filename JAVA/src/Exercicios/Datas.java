/*Datas
Desenvolva uma aplicação em Java, que receba como parâmetro um número inteiro relativo
a um mês do ano, retorne uma string com o nome deste mês por extenso e retorne uma
mensagem "Inválido!"para números que não reprentem um mês. Utilize o conceito de array
para solucionar o problema.*/

package Exercicios;
import java.util.Scanner;
public class Datas {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		int d;
		String mes[] = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
		};
			System.out.println("Digite um número inteiro relativo a um mês do ano: ");
			d = leitor.nextInt();
			if(d<1 || d>12) {
				System.out.println("Inválido!");
			}
		
	}
}
