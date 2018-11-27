package entites;

public class Entreprise extends Contact {
	private int numSiret;

	public Entreprise(String nom, String prenom, String email, int id, int siret) {
		super(id, nom, prenom, email);
		this.numSiret = siret;
	}
	
	public int getNumSiret() { return this.numSiret; }
	public void setNumSiret(int numSiret) { this.numSiret = numSiret; }
}
