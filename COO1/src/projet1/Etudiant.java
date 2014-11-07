package projet1;

public class Etudiant 
{
	private String chNom;
	private String chNumEtu;
	
	public Etudiant(String parNom, String parNumEtu)
	{
		this.chNom = parNom;
		this.chNumEtu = parNumEtu;
	}
	
	public String getNom()
	{
		return chNom;
	}
	
	public String getNumEtu()
	{
		return chNumEtu;
	}

	
}
