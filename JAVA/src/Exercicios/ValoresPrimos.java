/*Valores Primos
Desenvolva uma aplicação Java que receba X números inteiros em um array e indique
quais deles são números primos, para isto utilize um módulo que recebe como parâmetro o
número e retorna verdadeiro se ele for primo e falso caso contrário. Receba também um valor
inteiro N pelo teclado e imprima os N primeiros números primos do array.*/

package Exercicios;
import java.util.Scanner;
public class ValoresPrimos {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // leitura do array
        System.out.print("Digite o tamanho do array: ");
        int n = leitor.nextInt();
        int[] array = new int[n];
        System.out.print("Digite os " + n + " números inteiros: ");
        for (int i = 0; i < n; i++) {
            array[i] = leitor.nextInt();
        }

        // exibição dos números primos no array
        System.out.print("Números primos no array: ");
        for (int i = 0; i < n; i++) {
            if (primo(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // exibição dos N primeiros números primos do array
        System.out.print("Digite o valor de N para exibir os N primeiros números primos do array: ");
        int N = leitor.nextInt();
        int count = 0;
        for (int i = 0; i < n && count < N; i++) {
            if (primo(array[i])) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
    }

    public static boolean primo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
