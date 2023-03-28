package aula9;

public class Sistema {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("1234"); 
		Funcionario func2 = new Funcionario("09090909", 2350.9 ); // usando construtor com 2 parametros
		
		func1.setNome("Thiago");
		func1.setUltimoCod();
		
		func2.setNome("Helton");
		func2.setUltimoCod();
		
		System.out.println("F1: " + func1.getNome() + " último Cod " + func1.getUltimoCod());
		System.out.println("F2: " + func2.getNome() + " último Cod " + func2.getUltimoCod());
		
		Funcionario func3 = new Funcionario("7878787");
		System.out.println("F3: " + func3.getNome() + " último Cod " + func3.getUltimoCod());
		
		func1.setSalarioBase(1700.9);
		
		System.out.println("Participação de lucros do Funcionario 1 é " + func1.calculaPl(10));
		func1.toString();
		
		Agencia ag1 = new Agencia();
		ag1.funcAg = func1;
		// Implemente um modo de visualizar todos os dados de agência
		// Inclusive os dados dos funcionários
		
		System.out.println(ag1.toString());
	} 
}
