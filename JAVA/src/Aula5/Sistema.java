package Aula5;
import java.util.Scanner;
public class Sistema {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos da turma");
		int qtd = leitor.nextInt();
		leitor.reset();
		int indexMaior=0, indexMenor=0;
		String alunos[] = new String[qtd];
		double notas[][]= new double[qtd][3];
		for(int i=0; i < qtd; i++) {
			System.out.println("Digite o nome do aluno " + i);
			alunos[i] = leitor.next();
			leitor.reset();
			System.out.println("Digite a nota 1 do(a) aluno(a) "+ alunos[i]);
			notas[i][0]= leitor.nextDouble();
			leitor.reset();
			System.out.println("Digite a nota 2 do(a) aluno(a) \"+ alunos[i] ");
			notas[i][1]=leitor.nextDouble();
			leitor.reset();
			notas[i][2]= (notas[i][0]+ notas[i][1])/2;
			if(notas[i][2]< notas[indexMenor][2]) {
				indexMenor = i;
			}
			if(notas[i][2]> notas[indexMaior][2]){
				indexMaior = i;
			}
			System.out.println("A maior nota é do(a) aluno(a) "+ alunos[indexMaior] + "Nota: "+ notas[indexMaior][2]);
			System.out.println("A menor nota é do(a) aluno(a) "+ alunos[indexMenor] + "Nota: "+ notas[indexMenor][2]);
		}
		leitor.close();
	}
}
