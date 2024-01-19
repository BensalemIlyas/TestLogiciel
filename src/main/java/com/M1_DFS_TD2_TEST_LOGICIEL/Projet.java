package com.M1_DFS_TD2_TEST_LOGICIEL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Projet {
	
	private String nom;
	private List<Tache> taches = new ArrayList<>();
	private GestionTaches gestionTaches = new GestionTaches();
	
	
	public Projet(String nom) {
		super();
		this.nom = nom;
	}
	
	
	public List<Tache> getTaches() {
		return taches;
	}
	
	public GestionTaches getGestionTaches() {
		return gestionTaches;
	}


	public String ajouterTache(String titre, String description) {
		taches.add(new Tache(titre, description));
		return gestionTaches.ajouterTache(titre, description);
	}

}
