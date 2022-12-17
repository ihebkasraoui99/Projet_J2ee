package com.session;

import java.util.ArrayList;
import java.util.List;

import com.users.Etudiant;
import com.users.Reclamation;
import com.users.TypeReclamation;
import com.users.Utilisateur;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
@Stateless(name = "RE")
public class ReclamationServiceImpl implements ReclamationServiceLocal {
	@PersistenceContext(unitName = "Projet_J2ee")
	private EntityManager em;
	@Override
	public void ajouterReclamation(Reclamation reclamation) {
		em.persist(reclamation);
		
	}

	@Override
	public void ajouterTypeReclamation(TypeReclamation typeReclamation) {
		em.persist(typeReclamation);
		
	}

	@Override
	public List<Reclamation> listerReclamations() {
		Query req=em.createQuery("select r form Reclamation");
		return req.getResultList();
	}

	@Override
	public List<TypeReclamation> listerTypeReclamations() {
		Query req=em.createQuery("select t form TypeReclamation");
		return req.getResultList();
	}

	@Override
	public boolean existeTypeReclalamtion(String type) {
		Query query = em.createQuery("select t from TypeReclamation t where t.type=type ");
	    TypeReclamation tr = (TypeReclamation) query.getSingleResult();
	    if (tr != null) {
	      return true;
	    }
	return false;
	}
	

	@Override
	public List<Reclamation> listerReclamationParEtudiant(Etudiant etudiant) {
		
		return null;
	}
	
}
