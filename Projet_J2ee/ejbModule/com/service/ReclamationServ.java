package com.service;

import com.session.ReclamationServiceLocal;
import com.users.Reclamation;
import com.users.TypeReclamation;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.jws.WebService;

@Stateless
@WebService
public class ReclamationServ {
	@EJB
	private ReclamationServiceLocal metier;
	
	
	
	
}
