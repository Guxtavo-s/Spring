package com.generation.FarmaciaGen.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank(message="Este campo é obrigatório!")
	@Size(max=30, message="Este campo tem no máximo 30 caracteres.")
	private String nome;
	
	@NotBlank(message="Este campo é obrigatório!")
	private int quantidade;
	
	@NotBlank(message="Este campo é obrigatório!")
	@Size(max=30, message="Este campo tem no máximo 30 caracteres.")
	private BigDecimal quilograma;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private BigDecimal preco;
	
	@Size(max = 100, message = "O atributo foto deve conter no mínimo 05 e no máximo 100 caracteres.")
	private String foto;

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

	/*public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao; 
	} */

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getQuilograma() {
		return quilograma;
	}

	public void setQuilograma(BigDecimal quilograma) {
		this.quilograma = quilograma;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
