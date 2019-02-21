package voiture;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Garage2 implements Iterable<Vehicule> {
	private Set<Vehicule> vehicules;

	@Override
	public Iterator<Vehicule> iterator() {
		// TODO Auto-generated method stub
		return vehicules.iterator();
	}
	
	public Garage2() {
		vehicules = new TreeSet<Vehicule>();
	}
	

	public boolean add(Vehicule vehicule) {
			return vehicules.add(vehicule);
	}

	@Override
	public String toString() {
		return vehicules.toString();
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
	
//	public void triCompteur() {
//		vehicules.sort();
//    }
//	
//	public void triNoImmatriculion(){
//        Collections.sort(vehicules);
//    }

 
}
