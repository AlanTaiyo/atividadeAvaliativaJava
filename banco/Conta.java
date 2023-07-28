package banco;

public class Conta {
	private int numeroConta;
	private String nomeConta;
	private double saldoConta;

	public Conta(int numeroConta, String nomeConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeConta = nomeConta;
		deposito(depositoInicial);
	}

	public Conta(int numeroConta, String nomeConta) {
		this.numeroConta = numeroConta;
		this.nomeConta = nomeConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double dinheiroDepositado) {
		saldoConta += dinheiroDepositado;
	}

	public void saque(double dinheiroSacado) {
		saldoConta -= dinheiroSacado + 5.0;
	}

	public String toString() {
		return "Número da conta: " + numeroConta 
		+ "\nNome: " + nomeConta
		+ "\nSaldo: $" + String.format("%.2f", saldoConta);
	}
}
