/*Datas
Desenvolva uma aplicação em Java, que receba como parâmetro um número inteiro relativo
a um mês do ano, retorne uma string com o nome deste mês por extenso e retorne uma
mensagem "Inválido!"para números que não reprentem um mês. Utilize o conceito de array
para solucionar o problema.*/

package exercicios;
import java.util.Scanner;
public class Datas {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // leitura do número do mês
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = leitor.nextInt();

        // array com os nomes dos meses
        String[] nomeMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // verificação e exibição do nome do mês
        if (mes >= 1 && mes <= 12) {
            String nomeMes = nomeMeses[mes - 1];
            System.out.println("O mês " + mes + " é " + nomeMes + ".");
        } else {
            System.out.println("Inválido!");
        }
    } 
}
