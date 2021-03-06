package com.equipamentos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="EQUIPAMENTO")
public class Equipamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_equipamento;
	
	@NotNull
	private String tipo;
	
	@NotNull
	private String marca;
	
	@NotNull
	private String problema;

	public long getId() {
		return id_equipamento;
	}

	public void setId(long id) {
		this.id_equipamento = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public Equipamento(@NotNull String tipo, @NotNull String marca, @NotNull String problema) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.problema = problema;
	}
	
   public Equipamento() {
		
	}
	
	
	
	
	

}
