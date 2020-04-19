package com.bios.app.model;

import java.util.List;

import lombok.Data;

public @Data class CNPJ {
	private String value;
	private String razaoSocial;
	private List<String> contas;
	
	public CNPJ(String value, String razaoSocial) {
		this.value = value;
		this.razaoSocial = razaoSocial;
	}

	public CNPJ() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
