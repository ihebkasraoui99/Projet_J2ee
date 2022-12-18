package com.service;

import java.util.List;

import com.session.ReclamationServiceLocal;
import com.users.Etudiant;
import com.users.Reclamation;
import com.users.TypeReclamation;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@Stateless
@WebService
public class ReclamationServ {
	@EJB
	private ReclamationServiceLocal metier;

	@WebMethod
	public void addReclamation(@WebParam String titre, @WebParam String descr) {
		Reclamation rec = new Reclamation(titre, descr);
		metier.ajouterReclamation(rec);
	}

	@WebMethod
	public void addtypeReclamation(@WebParam String type) {
		TypeReclamation tyrec = new TypeReclamation(type);

		metier.ajouterTypeReclamation(tyrec);
	}

	@WebMethod
	public List<Reclamation> listerReclamations() {

		return metier.listerReclamations();
	}

	@WebMethod
	public List<TypeReclamation> listerTypeReclamations() {

		return metier.listerTypeReclamations();
	}

	@WebMethod
	public boolean existeTypeReclalamtion(@WebParam String type) {
		return metier.existeTypeReclalamtion(type);
	}

	@WebMethod
	public TypeReclamation chercherTypeReclamationParType(@WebParam String type) {

		return metier.chercherTypeReclamationParType(type);
	}

	@WebMethod
	public List<Reclamation> listerReclamationParEtudiant(@WebParam Etudiant etudiant) {

		return metier.listerReclamationParEtudiant(etudiant);
	}
}
