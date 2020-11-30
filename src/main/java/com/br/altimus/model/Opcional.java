package com.br.altimus.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "opcional")
public class Opcional {
	
	@Id
	private int id;
	
	@NotNull
	private String opcional;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOpcional() {
		return opcional;
	}

	public void setOpcional(String opcional) {
		this.opcional = opcional;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((opcional == null) ? 0 : opcional.hashCode());
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
		Opcional other = (Opcional) obj;
		if (id != other.id)
			return false;
		if (opcional == null) {
			if (other.opcional != null)
				return false;
		} else if (!opcional.equals(other.opcional))
			return false;
		return true;
	}
}
