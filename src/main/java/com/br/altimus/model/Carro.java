package com.br.altimus.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDateTime dtCadastro;
	
	@NotBlank
	private String placa;
	
	@NotNull
	private String renavam;
	
	@Column(name = "modelo")
	private int modeloId;
	
	@ManyToOne
	@JoinColumn(name = "modelo", insertable = false, updatable = false)
	private Modelo modelo;
	
	@NotNull
	private float valor;
	
	@ManyToMany
    @JoinTable(name="opcional_carro", 
    joinColumns={@JoinColumn(name="carro_id")}, 
    inverseJoinColumns={@JoinColumn(name="opcional_id")})
	private List<Opcional> opcionais;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public int getModeloId() {
		return modeloId;
	}

	public void setModeloId(int modeloId) {
		this.modeloId = modeloId;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public List<Opcional> getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(List<Opcional> opcionais) {
		this.opcionais = opcionais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dtCadastro == null) ? 0 : dtCadastro.hashCode());
		result = prime * result + id;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + modeloId;
		result = prime * result + ((opcionais == null) ? 0 : opcionais.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((renavam == null) ? 0 : renavam.hashCode());
		result = prime * result + Float.floatToIntBits(valor);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (dtCadastro == null) {
			if (other.dtCadastro != null)
				return false;
		} else if (!dtCadastro.equals(other.dtCadastro))
			return false;
		if (id != other.id)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (modeloId != other.modeloId)
			return false;
		if (opcionais == null) {
			if (other.opcionais != null)
				return false;
		} else if (!opcionais.equals(other.opcionais))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (renavam == null) {
			if (other.renavam != null)
				return false;
		} else if (!renavam.equals(other.renavam))
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}
}
