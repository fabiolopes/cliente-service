package com.bios.app.model;

import java.util.List;

import lombok.Data;

public @Data class Cliente {
	private String nome;
	private String organizacao;
	private List<CNPJ> cnpjs;
}
