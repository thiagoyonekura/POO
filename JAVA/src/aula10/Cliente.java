package aula10;

import java.util.Calendar;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private String nascimento;
	private ArrayList<Conta> listaConta= new ArrayList<>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getNascimento() {
		return this.nascimento;
	}
	public void setConta(Conta a) {
		listaConta.add(a);
	}
	public String getConta(int i) {
		String texto = listaConta.get(i).toString();
		return texto;
	}
	public String toString() {
		
		String texto = "Cliente: " + this.nome + "\t CPF: " + this.cpf + "\t Endereço: " +
				this.endereco + "\t Data de nascimento: " + this.nascimento;
		return texto;
	}
}
