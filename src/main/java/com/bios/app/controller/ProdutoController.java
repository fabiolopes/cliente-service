package com.bios.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.bios.app.repository.ProdutoRepository.*;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	@GetMapping
	public ResponseEntity<?> getProduct(){
		try {
			return ResponseEntity.ok(getProdutos());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Deu ruim. "+e);
		}
	}
	
}
