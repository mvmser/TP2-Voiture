package voiture;


public class Compteur {
	
	//VARIABLE D'INSTANCE
	private double totalisateur;
	private double partiel;
	
	//CONSTANTE
	final int CONST = 1000;
	
	//CONSTRUCTEUR
	public Compteur() {
		this.totalisateur = 0.0;
		this.partiel = 0.0;
	}
	
	//GETTER : accesseur (retourner les attributs prives)
	public double getTotalisateur() {
		return this.totalisateur;
	}
	public double getPartiel() {
		return this.partiel;
	}
	
	//SETTER : mutateur (modifier les attributs prives)
	public void setPartiel(double partiel) {
		this.partiel = partiel;
	}
	
	//Remise a  0 du partiel
	public void resetPartiel() {
		this.partiel = 0.0;
	}
	
	//ajouter des km au compteur
	public void add(double km) {
		this.totalisateur += km;
		this.partiel += km;
		//remise a 0 du compteur tous les 1000km
		this.partiel %= CONST;
	}

	//Retourne le compteur avec 2 chiffres après la virgule et centré à gauche
	@Override
	public String toString(){
		String compteurString = 
		String.format("Compteur = [Totalisateur =  %-10.2f | Partiel = %-10.2f]", this.totalisateur, this.partiel );
		return compteurString;
	}
	
	
	
	
	

}
