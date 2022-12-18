package com.service;

import com.session.AuthentificationServiceLocal;
import com.users.Administration;
import com.users.Etudiant;
import com.users.Utilisateur;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@Stateless
@WebService
public class AuthentificationServ {
	@EJB
	private AuthentificationServiceLocal metier;

	@WebMethod
	public void addEtudiant(@WebParam String nom, @WebParam String prenom, @WebParam String email,
			@WebParam String password, @WebParam boolean active) {
		Etudiant etd = new Etudiant(nom, prenom, email, password, active);
		metier.sauvegarderUtilisateur(etd);
	}

	public void addAdministrateur(@WebParam String email, @WebParam String password, @WebParam boolean active) {
		Utilisateur admin = new Administration(email, password, active);
		metier.sauvegarderUtilisateur(admin);
	}

	public void activerCompte(String nom, String prenom) {
		Etudiant etd = metier.recherherEtudiant(nom, prenom);
		Administration admin = new Administration("z", "z", true);
		admin.activerCompte(etd);
	}

	public void desactiverCompte(String nom, String prenom) {
		Etudiant etd = metier.recherherEtudiant(nom, prenom);
		Administration admin = new Administration("z", "z", true);
		admin.desactiverCompte(etd);
	}

	public Etudiant findEtd(String nom, String prenom) {
		return metier.recherherEtudiant(nom, prenom);
	}
}
