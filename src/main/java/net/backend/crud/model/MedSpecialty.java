package net.backend.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedSpecialty 
{
	
	/*Variáveis*/
	@Id @NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MedSpecialty_ID")
	private Long MedSpecialty_ID;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="active")
	private Boolean active;

	/*Getters e Setters*/
	public Long getMedSpecialty_ID() {
		return MedSpecialty_ID;
	}
	public void setMedSpecialty_ID(Long medSpecialty_ID) {
		MedSpecialty_ID = medSpecialty_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
