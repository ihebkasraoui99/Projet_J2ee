package com.session;

import java.util.List;

import com.users.Administration;
import com.users.Etudiant;
import com.users.Utilisateur;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Stateless(name="AUTH")
public class AuthentificationServiceImpl implements AuthentificationServiceLocal {
	@ PersistenceContext(unitName = "Projet_J2ee")
	private EntityManager em;
	@Override
	public Utilisateur authentifier(String login, String pwd) {
		if(!existeEmail(login))
			return null;
		else;
			Query req=em.createQuery("select u from UTILISATEUR u where u.email=login , u.password=pwd");
			return (Utilisateur) req.getSingleResult();
	}

	@Override
	public boolean existeEmail(String login) {
		 Query query = em.createQuery("select u from UTILISATEUR u where u.email=login ");
		    Utilisateur utl = (Utilisateur) query.getSingleResult();
		    if (utl != null) {
		      return true;
		    }
		return false;
	}

	@Override
	public void sauvegarderUtilisateur(Utilisateur utilisateur) {
		em.persist(utilisateur);
		
	}

	@Override
	public List<Etudiant> listerEtudiants() {
		Query req=em.createQuery("select e form Etudiant");
		return req.getResultList();
	}

	
	public Etudiant recherherEtudiant(String nom,String prenom)
	{
		Query req=em.createQuery("select etd from Etudiant etd where etd.nom=nom");
		Etudiant etd=(Etudiant)req.getSingleResult();
		return etd;
	}
}
