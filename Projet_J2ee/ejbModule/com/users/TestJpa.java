package com.users;

import jakarta.persistence.EntityTransaction;

import com.users.Administration;
import com.users.Etudiant;

import jakarta.persistence.EntityManager;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class TestJpa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory Emf=  Persistence.createEntityManagerFactory("Projet_J2ee");
		EntityManager Em = Emf.createEntityManager();
		EntityTransaction Et= Em.getTransaction();
		
		Et.begin();
		Etudiant e=new Etudiant("a","vvv");
		Administration a =new Administration();
		a.add_etudiant(e);
		
		
	
		Et.commit();
		
	
		Em.close();
		Emf.close();
	}
}
