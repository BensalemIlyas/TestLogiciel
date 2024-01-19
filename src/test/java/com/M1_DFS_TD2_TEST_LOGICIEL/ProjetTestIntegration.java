package com.M1_DFS_TD2_TEST_LOGICIEL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.boot.test.context.SpringBootTest;

@ConfigurationProperties("projet")
@SpringBootTest

class ProjetTestIntegration {
	
	
	
	@Autowired
	Projet projet; 
	
	@Test
	void ajoutTacheAuProjet() {
		String titre = "titre";
		String description = "description";
		String resultAjouterTache = projet.ajouterTache(titre, description);
		assertEquals("Tache créer avec succès : " + titre, resultAjouterTache);
		Tache nouvelleTache = new Tache(titre,description);
		assertTrue(projet.getGestionTaches().getTaches().containsKey(nouvelleTache));
		assertTrue(projet.getTaches().contains(nouvelleTache));
	}

}
