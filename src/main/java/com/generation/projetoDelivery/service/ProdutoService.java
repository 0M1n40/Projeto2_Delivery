package com.generation.projetoDelivery.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.projetoDelivery.model.Produto;
import com.generation.projetoDelivery.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;


    public Produto aplicarDesconto(Long produtoId, BigDecimal percentualDesconto) {
    	
        if (percentualDesconto.compareTo(BigDecimal.ZERO) < 0 || percentualDesconto.compareTo(BigDecimal.valueOf(100)) > 0) 
            throw new IllegalArgumentException("O percentual de desconto deve estar entre 0 e 100.");
        
        Produto produto = produtoRepository.findById(produtoId)
                .orElseThrow(() -> new RuntimeException("O produto digitado não foi encontrado."));
        
        if (!"Pizza".equals(produto.getCategoria().getNome()))
        	throw new RuntimeException("Aqui só damos descontos para pizzas."); 

    	BigDecimal fatorDesconto = BigDecimal.valueOf(100).subtract(percentualDesconto).divide(BigDecimal.valueOf(100));

        BigDecimal precoAtual = produto.getPreco();
        BigDecimal precoComDesconto = precoAtual.multiply(fatorDesconto);

        produto.setPreco(precoComDesconto);

        return produtoRepository.save(produto);
    }
}