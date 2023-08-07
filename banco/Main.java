package treinoConta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta Conta = null;
		
		System.out.println("Este programa irá ler sua conta bancária.");
		System.out.println("Digite o seu nome: ");
		String nomeConta = leitura.nextLine();
		
		System.out.println("Digite o número da conta: ");
		int numeroConta = leitura.nextInt();
		
		System.out.println("Você deseja realizar seu primeiro depósito?");
		System.out.println("1 - SIM");
		System.out.println("2 - NÃO");
		
		boolean loop = true;
		
		while (loop == true) {
			int escolha = leitura.nextInt();
			
			if (escolha == 1) {
				System.out.println("Digite a quantidade de dinheiro que você quer depositar:");
				double depositoInicial = leitura.nextDouble();
				Conta = new Conta(nomeConta, numeroConta, depositoInicial);
				loop = false;
			}
			
			else if (escolha == 2) {
				Conta = new Conta(nomeConta, numeroConta);
				loop = false;
			}
			
			else {
				System.out.println("Por favor, digite apenas número 1(SIM) ou 2(NÃO).");
				continue;
			}
		}
		
		boolean loop2 = true;
		
		
		while (loop2 == true) {
			
			System.out.println(Conta);
			System.out.println();
			System.out.println(Conta.exibeMensagem());;
			System.out.println();
			
			int escolha2 = leitura.nextInt();
			
			if (escolha2 == 1) {
				System.out.println("Digite o valor que você quer depositar: ");
				double novoDeposito = leitura.nextDouble();
				Conta.deposito(novoDeposito);
		
				continue;
				
			}
			
			else if (escolha2 == 2) {
				System.out.println("Digite o valor que você quer sacar: ");
				double novoSaque = leitura.nextDouble();
				Conta.saque(novoSaque);
				
				continue;
			}
			
			else if (escolha2 == 3) {
				System.out.println("Saindo do programa...");
				loop2 = false;
			}
			
			else {
				System.out.println();
				System.out.println("Por favor tecle apenas uma das opções a seguir:");
				continue;
			}
		}

		leitura.close();
	}

}

