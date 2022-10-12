package bancoAlura;

public class Conta {
	double saldo;
	int idade;
	Cliente titular; // mudou se String para Cliente, o nome da classe criada.

	// Metodo para deposito.
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// Metodo para sacar.
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// Metodo para transferemcia.
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);
			return true;

		} else {
			return false;
		}
	}

}
