package com.session;

import java.util.List;

import com.users.Etudiant;
import com.users.Utilisateur;

import jakarta.ejb.Local;

@Local
public interface AuthentificationServiceLocal {
	public Utilisateur authentifier(String login, String pwd);

	boolean existeEmail(String login);

	void sauvegarderUtilisateur(Utilisateur utilisateur);

	List<Etudiant> listerEtudiants();

	public Etudiant recherherEtudiant(String nom, String prenom);
}
