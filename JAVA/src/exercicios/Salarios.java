/*Salários
Para fazer um levantamento estatístico dos salários de seus funcionários, uma empresa
precisa de um programa em Java que leia uma lista contendo os salários dos funcionários da
empresa. Este programa deve exibir quantos funcionários ganham salário acima da média.
Considerando que não há um número fixo de funcionários, o programa deve perguntar no início
da execução: quantos funcionários possui.*/

package exercicios;

import java.util.Scanner;

public class Salarios {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // leitura do número de funcionários
        System.out.print("Digite o número de funcionários: ");
        int numFuncionarios = leitor.nextInt();

        // declaração do array de salários
        double[] salarios = new double[numFuncionarios];

        // leitura dos salários
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i+1) + ": ");
            salarios[i] = leitor.nextDouble();
        }

        // cálculo da média dos salários
        double media = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            media += salarios[i];
        }
        media = media / numFuncionarios;

        // contagem de funcionários com salário acima da média
        int acimaMedia = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            if (salarios[i] > media) {
                acimaMedia++;
            }
        }

        // exibição do resultado
        System.out.println("Média salarial: " + media);
        System.out.println("Funcionários com salário acima da média: " + acimaMedia);
    }
	
}

