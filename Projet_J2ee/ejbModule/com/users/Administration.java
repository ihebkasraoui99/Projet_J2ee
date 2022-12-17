package com.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


@Entity
@DiscriminatorValue("admin")
public class Administration extends Utilisateur{

	public Administration(String email,String password, boolean active) {
		super(email,password,active);
		
	}
	public void activerCompte(Etudiant etd)
	{
		etd.setActive(true);
	}
	public void desactiverCompte(Etudiant etd)
	{
		etd.setActive(false);
	}

}
