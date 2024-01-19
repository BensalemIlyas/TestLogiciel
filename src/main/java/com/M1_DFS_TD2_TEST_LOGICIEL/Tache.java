package com.M1_DFS_TD2_TEST_LOGICIEL;

import java.util.Objects;

public class Tache {
	
	private String titre;
	private String description;
	private boolean completed = false; 
	
	public Tache(String titre, String description) {
		super();
		this.titre = titre;
		this.description = description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(titre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tache other = (Tache) obj;
		return Objects.equals(titre, other.titre);
	}
	public String getTitre() {
		return titre;
	}
	public void complete() {
		completed = true; 
		
	}
	public boolean isCompleted() {
		return completed;
	}
	
	
	
	

}
