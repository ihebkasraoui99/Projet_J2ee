package com.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Reclamation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String titre;
	String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Reclamation(String titre, String description) {
		super();
		
		this.titre = titre;
		this.description = description;
	}
	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
