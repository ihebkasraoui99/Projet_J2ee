package com.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


@Entity
@DiscriminatorValue("A")
public class Administration extends Utilisateur{

	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void add_etudiant(Etudiant e)
	{
		EntityManagerFactory Emf=  Persistence.createEntityManagerFactory("Projet_J2ee");
		EntityManager Em = Emf.createEntityManager();
		EntityTransaction Et= Em.getTransaction();
		Em.persist(e);
		Et.commit();
		Em.close();
		Emf.close();
	}

}
