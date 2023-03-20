/*Merge
Escreva uma aplicação Java que receba como parâmetros dois arrays contendo duas listas
de preços (ponto flutuante) que já estão classificadas em ordem crescente. A função deverá fazer
um merge do conteúdo dos dois arrays em um terceiro (array resultante) mantendo, porém, a
ordem crescente. Isto pode ser feito da seguinte forma (a explicação abaixo é apenas uma ajuda,
não é obrigatório segui-la fielmente):
• Inicialmente o programa se posiciona no início de ambos os arrays;
• Se o elemento atual do array 1 for menor que o elemento atual do array 2 ele é transferido para o array resultante e o programa se desloca para o próximo elemento do array
1 (entenda-se por elemento atual aquele em que o programa está posicionado naquele
determinado momento);
• Se o elemento do array 2 for menor que o elemento do array 1 ele é transferido para o
array resultante e o programa se desloca para o próximo elemento do array 2;
• Isto irá acontecer até que se chegue ao fim de um dos vetores;
• Neste momento o programa descarrega o restante do array que ainda não terminou no
array resultante e encerra a função.*/

package Exercicios;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
        double arr1[] = {1.2, 3.4, 5.6};
        double arr2[] = {2.1, 4.3, 6.5};
        double resultado[] = merge(arr1, arr2);
        System.out.println(Arrays.toString(resultado)); 
    }
    
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] resultado = new double[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            resultado[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            resultado[k++] = arr2[j++];
        }
        return resultado;
    }
}
