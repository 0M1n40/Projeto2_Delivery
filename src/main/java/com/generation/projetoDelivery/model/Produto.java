package com.generation.projetoDelivery.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotBlank (message = "O atributo nome é obrigatório!")
	    private String nome;
	    
	    @NotBlank (message = "O atributo Descrição é obrigatório!")
	    private String descricao;
	    
	    @NotNull (message = "O atributo preço é obrigatório!")
	    private BigDecimal preco;
	    
	    @NotNull (message = "O atributo estoque é obrigatório!")
	    private Double estoque;
	    
	    @ManyToOne 
	    @JsonIgnoreProperties("produto")
	    private Categoria categoria; 

	    @ManyToOne
	    @JsonIgnoreProperties("produto")
	    private Usuario usuario;

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public Double getEstoque() {
			return estoque;
		}

		public void setEstoque(Double estoque) {
			this.estoque = estoque;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
	    
	    
	
}
