package dados;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		CalculadoraSaldoBanco calculadora = new CalculadoraSaldoBanco();

		Agencia agenciaXanxere = new Agencia();
		agenciaXanxere.setNomeAgencia("Banco do Brasil XXE");
		agenciaXanxere.setNumeroAgencia(546);

		Cliente andre = new Cliente();
		andre.setCpf("987.654.321-01");
		andre.setNome("Andre");
		andre.setDataNascimento(LocalDate.of(1980, 9, 27));

		Conta conta = new Conta();
		conta.setNumero(10);
		conta.setCliente(andre);
		conta.setAgencia(agenciaXanxere);
		conta.depositar(1000.0);
		conta.sacar(700.0);
		andre.adicionaConta(conta);
		calculadora.calcula(conta);

		System.out.println("Nome Cliente: " + andre.getNome());
		System.out.println("Numero: " + conta.getNumero());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Nome agencia: " + conta.getAgencia().getNomeAgencia());

		// Heranca
		ContaPoupanca contaPou = new ContaPoupanca();
		contaPou.setCliente(andre);
		contaPou.setAgencia(agenciaXanxere);
		contaPou.setNumero(3456);
		contaPou.setRendimento(1.0);
		contaPou.depositar(349.0);
		contaPou.sacar(120.0);
		// Adiciona na lista de constas do ande a contaPou
		andre.adicionaConta(contaPou);

		System.out.println("numero:" + contaPou.getNumero());
		System.out.println("saldo:" + contaPou.getSaldo());

		ContaEspecial contaEsp = new ContaEspecial();
		contaEsp.setCliente(andre);
		contaEsp.setAgencia(agenciaXanxere);
		contaEsp.setNumero(3456);
		contaEsp.setLimite(1000.0);
		contaEsp.depositar(349.0);
		contaEsp.sacar(700.0);
		// Adiciona na lista de constas do ande a contaEsp
		andre.adicionaConta(contaEsp);

		System.out.println("numero:" + contaEsp.getNumero());
		System.out.println("saldo:" + contaEsp.getSaldo());

		System.out.println();

		Conta conta2 = new Conta();
		conta2.setNumero(3456);

		if (conta2.equals(contaEsp)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

		Set<Conta> contas = new HashSet<>();
		contas.add(contaEsp);
		contas.add(conta2);

//		contas.forEach();

	}

}
