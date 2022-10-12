package bancoAlura;
// Criando a referencia diretamente, sem criar a conta cliente.
public class TestaMetodoSemCliente {
	public static void main(String[] args) {
		Conta contaDaDiloca = new Conta();
		contaDaDiloca.deposita(11);
		System.out.println(contaDaDiloca.saldo);
		// Criando a associação diretamente.
		contaDaDiloca.titular = new Cliente();//Conexão com Cliente foi feita aqui.
		contaDaDiloca.titular.nome = "Diloquinha da silva";
		contaDaDiloca.titular.cpf = "69874-89";
		contaDaDiloca.titular.profissao = "Professora";
		System.out.println(contaDaDiloca.titular.nome);
		System.out.printf("Profissão:  %s e CPF: %s ", contaDaDiloca.titular.profissao,contaDaDiloca.titular.cpf);
	}

}
