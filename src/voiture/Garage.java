package voiture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class Garage implements Iterable<Vehicule> {
	//Liste contenant plusieurs vehicules
    private List<Vehicule> vehicules;

    //Constructeur
    public Garage(){
    	//vehicules est une ArrayList
        vehicules = new ArrayList<Vehicule>();
    }

    //Retourne un iterator de la collection vehicule (qui est une liste)
    @Override
    public Iterator<Vehicule> iterator(){
        return vehicules.iterator();
    }

    public void add(Vehicule vehicule){
    	//On ajoute un vehicule a l'arrayList grace a la methode add
        vehicules.add(vehicule);
    }

    //Retourne le garage entier sous forme de string
    @Override
    public String toString(){
        return vehicules.toString();
    }

    //Trier le garage selon le num d'immatriculation grace a la fonction sort
    public void triNoImmatriculion(){
        Collections.sort(vehicules);
    }

    //Trier le garage selon le compteur, on specifie notre classe ComparateurCompeur 
    //qui redefini compare pour comparer deux totalisateur
    public void triCompteur() {
		Collections.sort(vehicules, new ComparateurCompteur());
    }

    //On remet a 0 tous les compteur partiels
    public void resetPartielAll() {
    	for(Vehicule vehicule : this) {
			vehicule.getCompteur().resetPartiel();
		}
	}

    //On fait le plein de tous les vehicules du garage
	public void faireLePleinAll() {
		for(Vehicule vehicule : this) {
			vehicule.faireLePlein();
		}
    }

	
 
    

}
