package aula10;

import java.util.ArrayList;
import java.util.Scanner;



public class Banco {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> lista = new ArrayList<>();
		Cliente a = new Cliente();
		Conta b = new Conta();
		int i = 0;
		String menu = "--- Banco ---\n"
				+ "1 - Cadastrar Conta \n"
				+ "2 - Cadastrar Cliente\n"
				+ "3 - Listar Contas \n"
				+ "4 - Listar Clientes \n"
				+ "5 - Editar Conta \n"
				+ "6 - Editar Cliente \n"
				+ "0 - Sair";
		int option = 0;
		do {
			System.out.println(menu);
			option = sc.nextInt();
			sc.reset();
			
			switch(option) {
				case 1:
					if(lista.size() != 0) {
						System.out.println("Lista de clientes: ");
						for(Cliente c : lista) {
							System.out.println(i + " - " + c.getNome());
							i++;
						}
						System.out.println("Digite o número do cliente que deseja criar a conta: ");
						i = sc.nextInt();
						lista.get(i);
						System.out.println("Digite o numero da conta");
						b.setNumero(sc.next());
						sc.reset();
						System.out.println("Digite a agencia");
						b.setAgencia(sc.next());
						sc.reset();
						b.setSaldo(0.0);
						b.setLimite(100.00);
						lista.get(i).setConta(b);
					}
					break;
				case 2:
					
					System.out.println("Digite o nome do cliente: ");
					a.setNome(sc.next());
					sc.reset();
					System.out.println("Digite o Cpf do titular: ");
					a.setCpf(sc.next());
					sc.reset();
					System.out.println("Digite endereço do titular: ");
					a.setEndereco(sc.next());
					sc.reset();
					System.out.println("Digite a data de nascimento: ");
					a.setNascimento(sc.next());
					sc.reset();
					lista.add(a);
					break;
				case 3:
					for(Cliente item : lista) {
						System.out.println(item);
						for(Conta cont: item.getConta()) {
							System.out.println(cont.toString());
						}
					}
					break;
				case 4: 
					for(Cliente item : lista) {
						System.out.println(item);
					}
					break;
				case 5: 
					System.out.println("EDITAR - Função não implementada");
					break;
				case 6: 
					System.out.println("EDITAR - Função não implementada");
					break;
				case 0:
					System.out.println("Encerrando o sistema...");
					break;
				default:
					System.out.println("Opção inválida");
			}
		}while(option != 0);
		sc.close();
	}
}
