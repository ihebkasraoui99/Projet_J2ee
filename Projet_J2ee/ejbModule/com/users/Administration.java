package com.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;




@Entity
@DiscriminatorValue("admin")
public class Administration extends Utilisateur{

	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}
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
