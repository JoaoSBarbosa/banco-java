package exercicio3;

public class Conta {
	String titular;
	int numero;
	double saldo, limite;
	
	Conta(){
		
	}

	Conta(int numero, String titular, double saldo, double limite) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(double valor) {

		if (valor > saldo) {
			System.out.println(
					"\n            #SAQUE NÃO REALIZADO \nSaldo insuficiente !\n===================="
					+ "========================================");
			return false;
		} else if (valor > limite) {
			System.out.println(
					"\n            #SAQUE NÃO REALIZADO \n Valor de saque maior do que o limite !\n====================="
					+ "=======================================");
			return false;
		} else if (valor <= 0) {
			System.out.println(
					"              #SAQUE NÃO REALIZADO# \n\n Valor solicitado precisa ser maior do que 0\n====================="
					+ "=======================================");
			return false;

		} else
			saldo -= valor; // saldo = saldo -valor;
		System.out.println("\n");
		System.out.println("** Saque de R% " + valor
				+ " reais realizado com sucesso ! **\n============================================================");
		return true;

	}

	boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		saldo += valor;
		System.out.println(
				"============================================================\n               **DEPOSITO REALIZADO** \n\n - Valor: R% "
						+ valor + "\n============================================================");

		return true;
	}

	boolean transferir(Conta destino, double valor) {
		if (valor <= 0) {
			System.out.println(
					"                  ERRO AO TRANSFERIR !\n Valor menor ou igual a 0\n============================================================");
			return false;
		} else if (valor > saldo) {
			System.out.println(
					"                  ERRO AO TRANSFERIR!\n Saldo insuficiente\n============================================================");
			return false;
		} else if (valor > limite) {
			System.out.println(
					"                  ERRO AO TRANSFERIR!\n Valor maior do que o limite\n============================================================");
			return false;
		} else
			System.out.println(
					"============================================================\n      **TRANSFERENCIA REALIZADA COM SUCESSO** \n\n - Conta:"
							+ destino.numero + "\n - Titular: " + destino.titular + "\n - Valor: " + valor
							+ "\n============================================================");
		destino.saldo += valor;
		return true;
	}

	void info() {
		System.out.println("*************************");
		System.out.println("Titular da Conta: " + titular);
		System.out.println("Numero da Conta: " + numero);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("*************************");
	}
}
