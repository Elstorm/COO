package projet1;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.*;

public class IUT 
{
	
	private String chNom;
	private String chAdresse;
	private String chNumero;
	private HashSet <Etudiant> chEtudiants;
	private HashSet <Departement> chDepartement;
	
	public String getNom()
	{
		return chNom;
	}
	 
	
	
	public String getAdresse()
	{
		return chAdresse;
	}
	
	public String getNumero()
	{
		return chNumero;
	}

	public void addEtu(Etudiant parEtudiant)
	{
		chEtudiants.add(parEtudiant);
	}
	
	
	public void supprEtu (Etudiant parEtudiant)
	{
		chEtudiants.remove(parEtudiant);
		
	}
		

	public void addDpt(Departement parDepartement)
	{
		chDepartement.add(parDepartement);
	}
	
	
	
	
	
}
