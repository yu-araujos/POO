package br.fiap.main;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;
import br.fiap.venda.Venda;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Yuri", 15000, Cargo.GERENTE);
		Venda venda = new Venda(funcionario, 15000);
		System.out.println(venda.calcularComissao());
	}
}
