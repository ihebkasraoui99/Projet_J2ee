package com.session;

import com.users.Etudiant;
import com.users.Reclamation;

public interface ReclamationServiceLocal {
	void ajouterReclamation(Reclamation reclamation);
	void ajouterTypeReclamation(TypeReclamation typeReclamation);
	List<Reclamation> listerReclamations();
	List<TypeReclamation> listerTypeReclamations();
	boolean existeTypeReclalamtion(String type);
	TypeReclamation chercherTypeReclamationParType(String type);
	List<Reclamation> listerReclamationParEtudiant(Etudiant etudiant);

}
