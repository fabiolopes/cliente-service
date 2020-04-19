package com.bios.app.repository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

	private static List<String> produtos;
	
	static {
		produtos = new ArrayList<>();
		produtos.add("Móvel");
		produtos.add("Voz Fixa");
		produtos.add("Internet");
		produtos.add("Dados Avançados");
		produtos.add("Voz Avançada");
		produtos.add("Rede Inteligente");
		produtos.add("Solução de Voz");
		produtos.add("Internet Corporativa");
		produtos.add("TV");
	}
	
	public static List<String> getProdutos(){
		return produtos;
	}
	
}
