/* Fibonacci
Os valores de Fibonacci formam uma sequência em que cada número é igual à soma dos
dois anteriores. Os dois primeiros elementos da sequência são, por padrão iguais a 1, como no
exemplo abaixo:
Ex: 1 1 2 3 5 8 13 ...
Desenvolva uma aplicação em Java que receba um número inteiro e informe se ele
faz parte da sequência de Fibonacci.*/

package exercicios;

import java.util.Scanner;

/*
 * public class Fibonacci { public static void main(String args[]) {
 * 
 * Scanner leitor = new Scanner(System.in);
 * System.out.println("Digite um número inteiro: "); int numero =
 * leitor.nextInt();
 * 
 * if (ehFibonacci(numero)) { System.out.println(numero +
 * " faz parte da sequência de Fibonacci."); } else { System.out.println(numero
 * + " não faz parte da sequência de Fibonacci."); } }
 * 
 * public static boolean ehFibonacci(int numero) { int anterior = 0; int atual =
 * 1; int proximo = 0;
 * 
 * while (proximo < numero) { proximo = anterior + atual; anterior = atual;
 * atual = proximo; }
 * 
 * return proximo == numero;
 * 
 * } }
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int num = leitor.nextInt();

        leitor.close();

        int fib1 = 1, fib2 = 1, fibonacci = 0;
        boolean checar = false;

        while(fibonacci <= num){
            if(fibonacci == num){
                checar = true;
                break;
            }
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        if(checar){
            System.out.print(num + " faz parte da sequência de Fibonacci.");
        }else {
            System.out.print(num + " não faz parte da sequência de Fibonacci.");
        }
    }
}



      
  