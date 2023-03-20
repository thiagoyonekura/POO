/*Horário
Desenvolva uma aplicação em Java, que receba do usuário o tempo em segundos e escreva
em horas, minutos e segundos.
*/

package exercicios;
import java.util.Scanner;
public class Horario {
		public static void main(String args[]) {
			int segundos=0, hora, min, seg;
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite os segundos:");
			segundos = leitor.nextInt();
			
			hora = segundos / 3600;
			min = segundos % 3600 / 60;
			seg = segundos % 3600 % 60;
			
			System.out.println(segundos + " segundos equivale a " + hora + " hora(s), " + min + " minutos e " + seg + " segundos.");
		}
}
