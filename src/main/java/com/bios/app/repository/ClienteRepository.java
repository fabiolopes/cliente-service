package com.bios.app.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.bios.app.model.CNPJ;
import com.bios.app.model.Cliente;

import lombok.Data;

public class ClienteRepository {

	public static Cliente generateCliente() {
		Cliente cliente = new Cliente();
		cliente.setOrganizacao("TESLA MOTORS BRASIL");
		cliente.setNome("Carmem de Andrade");
		CNPJ cnpj1 = new CNPJ("86.837.086/0001-01", "General Motors");
		CNPJ cnpj2 = new CNPJ("86.837.086/0002-01", "Banco Itaú");
		CNPJ cnpj3 = new CNPJ("86.837.086/0011-01", "Telefônica Brasil");
		CNPJ cnpj4 = new CNPJ("86.837.086/0012-01", "Accenture Brasil");
		CNPJ cnpj5 = new CNPJ("86.837.086/0021-01", "Carrefour Brasil");
		CNPJ cnpj6 = new CNPJ("86.837.086/0022-01", "Atento Brasil");
		CNPJ cnpj7 = new CNPJ("86.837.086/0031-01", "Techmahindra Brasil");
		cliente.setCnpjs(Arrays.asList(cnpj1, cnpj2, cnpj3, cnpj4, cnpj5, cnpj6, cnpj7));
		return cliente;
	}
	
	public static List<String> getContasByCNPJ(String cnpj){
		List<ContasCNPJ> contasCNPJ = getContas();
		Optional<ContasCNPJ> findFirst = contasCNPJ.stream().filter(contaCNPJ -> contaCNPJ.cnpj.equals(cnpj)).findFirst();
		return findFirst.get().getContas();
	}
	
	public static List<String> getLinhasByCNPJ(String cnpj){
		List<LinhasCNPJ> linhasCNPJ = getLinhas();
		Optional<LinhasCNPJ> findFirst = linhasCNPJ.stream().filter(linhaCNPJ -> linhaCNPJ.cnpj.equals(cnpj)).findFirst();
		return findFirst.get().getLinhas();
	}
	
	public static List<String> getEnderecosByCNPJ(String cnpj){
		List<EnderecosCNPJ> enderecosCNPJ = getEnderecos();
		Optional<EnderecosCNPJ> findFirst = enderecosCNPJ.stream().filter(enderecoCNPJ -> enderecoCNPJ.cnpj.equals(cnpj)).findFirst();
		return findFirst.get().getEnderecos();
	}
	
	private static List<ContasCNPJ> getContas() {
		List<String> contas = new ArrayList<>();
		contas.add("02027625067");
		contas.add("02027625068");
		ContasCNPJ conta1 = new ContasCNPJ("86.837.086/0001-01", contas);
		contas = new ArrayList<>();
		contas.add("02027625069");
		contas.add("02027625070");
		ContasCNPJ conta2 = new ContasCNPJ("86.837.086/0002-01", contas);
		contas = new ArrayList<>();
		contas.add("02027625067");
		contas.add("02027625071");
		ContasCNPJ conta3 = new ContasCNPJ("86.837.086/0011-01", contas);
		contas = new ArrayList<>();
		contas.add("02027625072");
		contas.add("02027625073");
		ContasCNPJ conta4 = new ContasCNPJ("86.837.086/0012-01", contas);
		contas = new ArrayList<>();
		contas.add("02027625074");
		contas.add("02027625075");
		ContasCNPJ conta5 = new ContasCNPJ("86.837.086/0021-01", contas);
		contas = new ArrayList<>();
		contas.add("02027625076");
		contas.add("02027625077");
		ContasCNPJ conta6 = new ContasCNPJ("86.837.086/0022-01", contas);
		contas = new ArrayList<>();
		contas.add("02027625078");
		contas.add("02027625079");
		contas.add("02027625080");
		ContasCNPJ conta7 = new ContasCNPJ("86.837.086/0031-01", contas);
		return Arrays.asList(conta1, conta2, conta3, conta4, conta5, conta6, conta7);
	}
	
	private static List<LinhasCNPJ> getLinhas() {
		List<String> linhas = new ArrayList<>();
		linhas.add("(11) 99658-1124");
		linhas.add("(11) 99548-5542");
		LinhasCNPJ linha1 = new LinhasCNPJ("86.837.086/0001-01", linhas);
		linhas = new ArrayList<>();
		linhas.add("(11) 97452-9871");
		linhas.add("(11) 96623-4717");
		LinhasCNPJ linha2 = new LinhasCNPJ("86.837.086/0002-01", linhas);
		linhas = new ArrayList<>();
		linhas.add("(11) 93321-4696");
		linhas.add("(11) 96548-8953");
		LinhasCNPJ linha3 = new LinhasCNPJ("86.837.086/0011-01", linhas);
		linhas = new ArrayList<>();
		linhas.add("(11) 91232-8858");
		linhas.add("(11) 93639-8899");
		LinhasCNPJ linha4 = new LinhasCNPJ("86.837.086/0012-01", linhas);
		linhas = new ArrayList<>();
		linhas.add("(11) 96589-4563");
		linhas.add("(11) 96589-7894");
		LinhasCNPJ linha5 = new LinhasCNPJ("86.837.086/0021-01", linhas);
		linhas = new ArrayList<>();
		linhas.add("(11) 93325-4215");
		linhas.add("(11) 93325-3693");
		LinhasCNPJ linha6 = new LinhasCNPJ("86.837.086/0022-01", linhas);
		linhas = new ArrayList<>();
		linhas.add("(11) 99635-7412");
		linhas.add("(11) 99635-2589");
		linhas.add("(11) 99635-8963");
		LinhasCNPJ linha7 = new LinhasCNPJ("86.837.086/0031-01", linhas);
		return Arrays.asList(linha1, linha2, linha3, linha4, linha5, linha6, linha7);
	}
	
	private static List<EnderecosCNPJ> getEnderecos() {
		List<String> enderecos = new ArrayList<>();
		enderecos.add("Rua 1");
		enderecos.add("Rua 2");
		EnderecosCNPJ endereco1 = new EnderecosCNPJ("86.837.086/0001-01", enderecos);
		enderecos = new ArrayList<>();
		enderecos.add("Rua 3");
		enderecos.add("Rua 4");
		EnderecosCNPJ endereco2 = new EnderecosCNPJ("86.837.086/0002-01", enderecos);
		enderecos = new ArrayList<>();
		enderecos.add("Rua 5");
		enderecos.add("Rua 6");
		EnderecosCNPJ endereco3 = new EnderecosCNPJ("86.837.086/0011-01", enderecos);
		enderecos = new ArrayList<>();
		enderecos.add("Rua 7");
		enderecos.add("Rua 8");
		EnderecosCNPJ endereco4 = new EnderecosCNPJ("86.837.086/0012-01", enderecos);
		enderecos = new ArrayList<>();
		enderecos.add("Rua 9");
		enderecos.add("Rua 10");
		EnderecosCNPJ endereco5 = new EnderecosCNPJ("86.837.086/0021-01", enderecos);
		enderecos = new ArrayList<>();
		enderecos.add("Rua 11");
		enderecos.add("Rua 12");
		EnderecosCNPJ endereco6 = new EnderecosCNPJ("86.837.086/0022-01", enderecos);
		enderecos = new ArrayList<>();
		enderecos.add("Rua 13");
		enderecos.add("Rua 14");
		enderecos.add("Rua 15");
		EnderecosCNPJ endereco7 = new EnderecosCNPJ("86.837.086/0031-01", enderecos);
		return Arrays.asList(endereco1, endereco2, endereco3, endereco4, endereco5, endereco6, endereco7);
	}
	
	public static @Data class ContasCNPJ{
		private String cnpj;
		private List<String> contas;
	
		public ContasCNPJ(String cnpj, List<String> contas) {
			super();
			this.cnpj = cnpj;
			this.contas = contas;
		}
	}
	
	public static @Data class LinhasCNPJ{
		private String cnpj;
		private List<String> linhas;
	
		public LinhasCNPJ(String cnpj, List<String> linhas) {
			super();
			this.cnpj = cnpj;
			this.linhas = linhas;
		}
	}
	
	public static @Data class EnderecosCNPJ{
		private String cnpj;
		private List<String> enderecos;
	
		public EnderecosCNPJ(String cnpj, List<String> enderecos) {
			super();
			this.cnpj = cnpj;
			this.enderecos = enderecos;
		}
	}
}
