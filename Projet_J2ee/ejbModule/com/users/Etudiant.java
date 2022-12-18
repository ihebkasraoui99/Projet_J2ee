package com.users;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Utilisateur{
 private String nom;
 private String prenom;
 @OneToMany
 private List<Reclamation> reclamations = new ArrayList<Reclamation>();
 
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Etudiant(String nom, String prenom,String email,String password, boolean active) {
	super(email,password,active);
	this.nom = nom;
	this.prenom = prenom;
}
public Etudiant() {
	super();
	// TODO Auto-generated constructor stub
}
public Etudiant(String email, String password, boolean active) {
	super(email, password, active);
	// TODO Auto-generated constructor stub
}

}
