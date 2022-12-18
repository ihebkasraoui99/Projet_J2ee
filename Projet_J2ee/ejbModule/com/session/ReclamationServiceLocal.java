package com.session;

import java.util.List;

import com.users.Etudiant;
import com.users.Reclamation;
import com.users.TypeReclamation;

import jakarta.ejb.Local;

@Local
public interface ReclamationServiceLocal {
	void ajouterReclamation(Reclamation reclamation);

	void ajouterTypeReclamation(TypeReclamation typeReclamation);

	List<Reclamation> listerReclamations();

	List<TypeReclamation> listerTypeReclamations();

	boolean existeTypeReclalamtion(String type);

	TypeReclamation chercherTypeReclamationParType(String type);

	List<Reclamation> listerReclamationParEtudiant(Etudiant etudiant);

}
