package com.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Etudiant extends Utilisateur{
 private String nom;
 private String prenom;
 
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
public Etudiant(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}

}
