package dados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(of = { "nome" })
@EqualsAndHashCode(of = "nome")
public class Cliente {

	private String nome;
	private LocalDate dataNascimento;
	private String cpf;

	private List<Conta> contas;

	/*
	 * Método que adiciona uma conta dentro da lista de contas do cliente.
	 * 
	 */

	public void adicionaConta(Conta conta) {
		if (contas == null) {
			contas = new ArrayList<>();
		}
		contas.add(conta);
	}

	/*
	 * Calcula o saldo de todas as contas do cliente
	 * 
	 * @return
	 */
	public Double calcularSaldoTotal() {
		// Double saldo =0.0;
		// for(Conta conta : contas){
		// saldo += conta.getSaldo();
		// }
		// return saldo;

		// .stream() - trabalha com listas
		// Pega a lista de contas mapea para double apenas o parametro
		// (getSaldo) e soma (.sum())
		return contas.stream().mapToDouble(Conta::getSaldo).sum();
	}

}
