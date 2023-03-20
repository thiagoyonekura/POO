/*Desenvolva uma aplicação em Java, simulando uma rotina de venda. Onde para cada
produto informado, leia: nome, preço e quantidade, escreva o nome do produto comprado e
o valor total a ser pago, considerando que são oferecidos descontos pelo número de unidades
compradas, segundo a tabela abaixo:
Quatidade Desconto
<= 10 unidades 0%
11 a 20 unidades 10%
21 a 50 unidades 20%
>50 unidades 25%
*/
package Exercicios;
import java.util.Scanner;
public class ProdutosEDescontos {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorTotal = 0;

        System.out.println("SIMULANDO UMA ROTINA DE VENDA! \n");

        while (true) {
            System.out.print("Digite o nome do produto ou 'sair' para encerrar a venda: ");
            String nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o preço unitário do produto: ");
            double preco = Double.parseDouble(leitor.nextLine());

            System.out.print("Digite a quantidade comprada do produto: ");
            int quantidade = Integer.parseInt(leitor.nextLine());

            double valorItem = preco * quantidade;
            double desconto = 0;

            if (quantidade <= 10) {
                desconto = 0;
            } else if (quantidade <= 20) {
                desconto = 0.1;
            } else if (quantidade <= 50) {
                desconto = 0.2;
            } else {
                desconto = 0.25;
            }

            double valorComDesconto = valorItem - (valorItem * desconto);

            System.out.println("\nProduto: " + nome);
            System.out.println("Valor total: R$" + valorComDesconto);

            valorTotal += valorComDesconto;
        }

        System.out.println("\nValor total da venda: R$" + valorTotal);
    }
}