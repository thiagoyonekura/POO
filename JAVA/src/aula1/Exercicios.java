package aula1;

import java.util.Scanner;

public class Exercicios {
	/*Duas palavras são anagramas se contiverem as mesmas letras, mas em uma ordem diferente. Aqui estão alguns exemplos de pares de anagramas:
	"alergia" e "regalia".
	"carro" e "corar".
	"muro" e "rumo".
	Para uma determinada entrada de dois textos, devolver "É um anagrama" se os dis textos forem anagramas. */
	
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Vamos verificar se duas palavras são anagramas.\n"
				+ "Digite uma palavra:");
	
		String s1 = leitor.next();
		System.out.print("Digite outra palavra:");
		String s2 = leitor.next();
		
		if(isAnagrama(s1,s2)) {
			System.out.println("É um anagrama!");
		}else {
			System.out.println("Não é um anagrama!");
			}
	}

	private static boolean isAnagrama(String s1, String s2) {
		int resultado = 0;
		
		for(int i = 0; i <s1.length(); i++) {
			resultado = resultado ^ s1.charAt(i);
		}
		for(int i = 0; i <s2.length(); i++) {
			resultado = resultado ^ s2.charAt(i);
			
		}
		return (resultado == 0);
		}
		
	

}