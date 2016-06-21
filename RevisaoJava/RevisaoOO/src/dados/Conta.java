package dados;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "numero")
@ToString(of = "numero")
public class Conta {

	private Integer numero;
	private Double saldo = 0.0;
	private Cliente cliente;
	private Agencia agencia;

	public void depositar(double valor) {

	}

	public boolean sacar(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;

	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
