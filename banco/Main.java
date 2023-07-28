package banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta Conta = null;
		
		System.out.println("Bem vindo a sua conta bancária, como primeiro acesso me digite seu número: ");
		int numeroConta = leitura.nextInt();
		System.out.println("Qual o seu nome? ");
		leitura.nextLine();
		String nomeConta = leitura.nextLine();
		
		System.out.println("Você quer realizar seu primeiro depósito?");
		System.out.println("1 -> para SIM");
		System.out.println("0 -> para NÃO");
		System.out.println();
		
		boolean continuarLoop = true; //sustentar meu loop kkkkkkkkkk
		
		while (continuarLoop == true) {
			
			int primeiroDeposito = leitura.nextInt();
			
			if (primeiroDeposito == 0) {
				Conta = new Conta(numeroConta, nomeConta);
				System.out.println(Conta);
				continuarLoop = false;
			}
			else if (primeiroDeposito == 1) {
				System.out.print("Digite a quantidade que você quer depositar em reais: $");
				double depositoInicial = leitura.nextDouble();
				System.out.println("Deposito realizado com sucesso!");
				Conta = new Conta(numeroConta, nomeConta, depositoInicial);
				System.out.println(Conta);
				continuarLoop = false;
			}
			else {
				System.out.println();
				System.out.println("Por favor, digite 0 para SIM ou 1 para NÃO. Tente novamente.");
				continuarLoop = true;
			}
		}
		
		System.out.println();
		System.out.println("Digite um valor para se fazer um deposito na sua conta:");
		double valorDepositado = leitura.nextDouble();
		Conta.deposito(valorDepositado);
		System.out.println();
		System.out.println("- INFORMAÇÕES ATUALIZADAS -");
		System.out.println(Conta);
		
		System.out.println();
		System.out.println("Digite um valor para se fazer um saque na sua conta:");
		double valorSacado = leitura.nextDouble();
		Conta.saque(valorSacado);
		System.out.println();
		System.out.println("- INFORMAÇÕES ATUALIZADAS -");
		System.out.println(Conta);
		
		leitura.close();
	}

}
