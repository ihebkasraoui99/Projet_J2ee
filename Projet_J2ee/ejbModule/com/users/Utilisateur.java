package com.users;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.InheritanceType;
	@Entity
	@Inheritance(strategy=InheritanceType.JOINED)
	@DiscriminatorColumn(name="utilisateur_type")
public abstract class Utilisateur  {
	private int idUtilisateur;
	private String email;
	private String password;
	private boolean active;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(int idUtilisateur, String email, String password, boolean active) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.password = password;
		this.active = active;
	}

}
