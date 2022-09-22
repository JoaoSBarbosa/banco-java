package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("\n                    Bem-Vindo a sua conta \n                   "
				+ "Insira uma nova conta:");
		System.out.println("\n<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n");
		
		System.out.print("Titular da Conta: ");
		Scanner leia = new Scanner(System.in);
		Conta c3 = new Conta();
		c3.titular= leia.next();
		System.out.print("Número da Conta: ");
		c3.numero=leia.nextInt();
		
		System.out.print("Saldo da Conta: ");
		c3.saldo=leia.nextDouble();
		System.out.print("Limite da Conta: ");
		c3.limite=leia.nextDouble();
		System.out.println("\nConta adicionada com sucesso !\n");
		
		
		
		Conta c1 = new Conta(102,"Super Mario",20000,500);
		Conta c2 = new Conta(105,"Sonic",3000,300);
		
		System.out.println("\n============================================================");
		c1.sacar(0);
		c1.depositar(500);
		c1.transferir(c2, 300);
		c1.info();
		System.out.println();
		c2.info();
		c3.info();

	}
}

