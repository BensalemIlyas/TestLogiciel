package com.M1_DFS_TD2_TEST_LOGICIEL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Role;

@SpringBootTest
class GestionTachesTest {
	

	@Autowired
	GestionTaches gestionTaches; 

	@Test
	void ajouteTacheTest() {
		String titre = "titre";
		String description = "description";
		
		String resultAjouterTache = gestionTaches.ajouterTache(titre, description);
		assertEquals("Tache créer avec succès : " + titre, resultAjouterTache);
		
	}
	
	@Test
	void completerTacheTest() {
		String titre = "titre";
		String description = "description";
		
		gestionTaches.ajouterTache(titre, description);
		
		boolean result =  gestionTaches.completerTache(titre);
		assertTrue(result);
	}
	
	
	@Test
	void completerTacheNonExistanteTest() {

		assertThrows(NoSuchElementException.class, () -> { gestionTaches.completerTache("titreQuiNexistePas");});
	
	}
	
	@Test
	void verifierTacheCompleteTest() {
		String titre = "titre";
		String description = "description";
		
		gestionTaches.ajouterTache(titre, description);
		gestionTaches.completerTache(titre);
		assertTrue(gestionTaches.verifierTache(titre));
		
	}
	
	@Test
	void verifierTacheNonCompleteTest() {
		String titre = "titre";
		String description = "description";
		
		gestionTaches.ajouterTache(titre, description);
		assertFalse(gestionTaches.verifierTache(titre));
		
	}
	
	@Test 
	void verifierTacheNonExistanteTest() {
		
		assertThrows(NoSuchElementException.class, () -> { gestionTaches.verifierTache("titreQuiNexistePas");});

	}

}
