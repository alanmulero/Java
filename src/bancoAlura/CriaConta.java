package bancoAlura;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 50;
		primeiraConta.deposita(100);
		System.out.println("Saldo Primeira conta "+primeiraConta.saldo);
		
		// Criando segunda conta.
		Conta segundaConta = new Conta();
		segundaConta.deposita(1000);
		segundaConta.idade =15;
		segundaConta.transfere(200, primeiraConta);
		System.out.println(segundaConta.idade);
		System.out.println("Saldo segunta: " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		
		// Terceira conta.
		Cliente novaContaAlan = new Cliente();
		novaContaAlan.nome = "Alan Teste Nova Conta";
		novaContaAlan.cpf = "12345678-9";
		novaContaAlan.profissao = "programador junior";
		Conta contaDoAlan = new Conta();
		contaDoAlan.deposita(700);
		// ligando Conta com Cliente.
		contaDoAlan.titular = novaContaAlan;
		contaDoAlan.transfere(200, segundaConta);
		System.out.println("Saldo segunta: " + segundaConta.saldo);
		System.out.println("Saldo alan " + contaDoAlan.saldo);
		
		System.out.println(contaDoAlan.titular.nome);
		System.out.println(contaDoAlan.titular.cpf);
		System.out.println(contaDoAlan.titular.profissao);

		
	}
	

}
