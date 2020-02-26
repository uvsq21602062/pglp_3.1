
public class Employe {
	private final String nom;
	private final String adresse;
	private double salaire;
	
	Employe(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
	public void calculSalaire() { this.salaire = 1000.0; }
	public double getSalaire() { return this.salaire; }
	public String getNom() { return this.nom; }
	public String getAdresse() { return this.adresse; }
}
