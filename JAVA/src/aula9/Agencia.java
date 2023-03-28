package aula9;

public class Agencia {
	String cidade;
	String numAg;
	Funcionario funcAg;
	
	public String toString() {
		return "Cidade: " + this.cidade +
				"\t Número: " + this.numAg +
				"\nFuncionário: " + this.funcAg.toString();
	}
}
