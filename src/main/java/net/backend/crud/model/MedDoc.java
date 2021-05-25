package net.backend.crud.model;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MedSpecialty")
public class MedDoc 
{
	
	/*Variáveis*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MedDoc_ID")
	private int MedDoc_ID;
	@Column(name="name")
	private String name;
	@Column(name="birthday")
	private Timestamp birthday;
	@Column(name="active")
	private boolean active;
	@Column(name="specialty")
	private ArrayList<MedSpecialty> specs;
	
	/*Getters e Setters*/
	public int getMedDoc_ID() {
		return MedDoc_ID;
	}
	public void setMedDoc_ID(int medDoc_ID) {
		MedDoc_ID = medDoc_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean ativo) {
		this.active = ativo;
	}
	public ArrayList<MedSpecialty> getSpecs() {
		return specs;
	}
	public void setSpecs(ArrayList<MedSpecialty> specs) {
		this.specs = specs;
	}
	
	
	
}
