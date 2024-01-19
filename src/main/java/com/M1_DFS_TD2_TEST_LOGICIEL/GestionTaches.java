package com.M1_DFS_TD2_TEST_LOGICIEL;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

@Service
public class GestionTaches {
	
	Map<Tache, Tache> taches = new HashMap();
	
	public String ajouterTache(String titre, String description) {
		
		Tache nouvelleTache = new Tache(titre, description);
		taches.put(nouvelleTache, nouvelleTache);	
		return "Tache créer avec succès : " + nouvelleTache.getTitre();
	}
	
	
	public Map<Tache, Tache> getTaches() {
		return taches;
	}


	public boolean completerTache(String titre) throws NoSuchElementException {
		
		Tache tacheToFound = new Tache(titre,"");
		
		if(!taches.containsKey(tacheToFound)) {
			throw new NoSuchElementException();
		}
 
		Tache tacheToComplete = taches.get(tacheToFound);
		tacheToComplete.complete();
		return true; 
	}
	
	
	public boolean verifierTache(String titre)throws NoSuchElementException{
		
		
		Tache tacheToFound = new Tache(titre,"");
		
		if(!taches.containsKey(tacheToFound)) {
			throw new NoSuchElementException();
		}
		Tache tacheToCheck = taches.get(tacheToFound);
		
		return tacheToCheck.isCompleted();
	}

}
