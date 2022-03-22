package com.isaac.clases;

import com.isaac.exceptions.LlibreException;

public class Llibre {
	private int idLlibre;
	private String titol;
	
	public Llibre(int idLlibre, String titol) throws LlibreException {
		setIdLlibre(idLlibre);
		setTitol(titol);
	}
	public String getTitol() {
		return titol;
	}
	public void setTitol(String titol) throws LlibreException{
		if (titol==null) {
			throw new LlibreException("El titol del llibre no pot ser null");
		}
		if (titol.isEmpty()) {
			throw new LlibreException("El titol del llibre no pot estar buit");
		}
		if (titol.trim() == "") {
			throw new LlibreException("El titol del llibre no pot ser espais en blanc");
		}
		this.titol = titol;
	}
	public int getIdLlibre() {
		return idLlibre;
	}
	public void setIdLlibre(int idLlibre) throws LlibreException{
		if (idLlibre <= 0) {
			throw new LlibreException("El codi del llibre no pot ser 0 o negatiu.");
		}
		this.idLlibre = idLlibre;
	}
	@Override
    public String toString() {
        return "Llibre{" + "codi=" + idLlibre + " " + "titol=" + titol + '}';
    }    
}
