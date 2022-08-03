package br.fiap.venda;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;

public class Venda {
	private Funcionario funcionario;
	private double valor;
	
	public Venda(Funcionario funcionario, double valor) {
		super();
		this.funcionario = funcionario;
		this.valor = valor;
	}
	
	public double calcularComissao() {
		double comissao = 0;
		Cargo cargo = funcionario.getCargo();
		if(cargo == Cargo.ATENDENTE) {
			comissao = valor * 0.10;
		} else if (cargo == Cargo.VENDEDOR) {
			comissao = valor * 0.15 + 5;
		} else if (cargo == Cargo.GERENTE){
			comissao = valor * 0.20 + 10;
		}
		return comissao;
	}
}
