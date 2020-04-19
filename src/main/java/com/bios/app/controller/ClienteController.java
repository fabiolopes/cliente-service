package com.bios.app.controller;

import static com.bios.app.repository.ClienteRepository.*;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins="*")
public class ClienteController {

	@GetMapping
	public ResponseEntity<?> getCliente(){
		System.out.println("/cliente Acessado em " + LocalDateTime.now());
		try {
			return ResponseEntity.ok(generateCliente());
		}catch (Exception e) {
			return ResponseEntity.badRequest().body("Deu ruim hein. "+e.getStackTrace());
		}
	}
	
	@GetMapping(path= "/conta/{cnpj:.+}")
	public ResponseEntity<?> getContaByCNPJ(@PathVariable String cnpj){
		System.out.println("/cliente/"+cnpj+" Acessado em " + LocalDateTime.now());
		try {
			return ResponseEntity.ok(getContasByCNPJ(cnpj.replace("_", "/")));
		}catch (Exception e) {
			return ResponseEntity.badRequest().body("Deu ruim hein. "+e.getStackTrace());
		}
	}
	
	@GetMapping(path= "/linha/{cnpj:.+}")
	public ResponseEntity<?> getLinhaByCNPJ(@PathVariable String cnpj){
		System.out.println("/linha/"+cnpj+" Acessado em " + LocalDateTime.now());
		try {
			return ResponseEntity.ok(getLinhasByCNPJ(cnpj.replace("_", "/")));
		}catch (Exception e) {
			return ResponseEntity.badRequest().body("Deu ruim hein. "+e.getStackTrace());
		}
	}
	
	@GetMapping(path= "/endereco/{cnpj:.+}")
	public ResponseEntity<?> getEnderecoByCNPJ(@PathVariable String cnpj){
		System.out.println("/endereco/"+cnpj+" Acessado em " + LocalDateTime.now());
		try {
			return ResponseEntity.ok(getEnderecosByCNPJ(cnpj.replace("_", "/")));
		}catch (Exception e) {
			return ResponseEntity.badRequest().body("Deu ruim hein. "+e.getStackTrace());
		}
	}
}
