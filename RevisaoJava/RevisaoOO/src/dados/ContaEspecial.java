package dados;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaEspecial extends Conta {
	private Double limite;

	@Override
	public boolean sacar(Double valor) {
		if ((getSaldo() + limite) > valor) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;

	}
}
