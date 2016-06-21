package dados;

import java.util.Collection;

public class CalculadoraSaldoBanco {

	private Double saldo = 0.0;

	public void calcula(Collection<Conta> contas) {
		contas.forEach(conta -> calcula(conta));
	}

	public void calcula(Conta conta) {
		saldo += conta.getSaldo();
	}

	public Double getSaldo() {
		return saldo;
	}

}
