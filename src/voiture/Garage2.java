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
	
	public void resetPartielAll() {
		Fonction<Vehicule> resetPartiel = new ResetPartiel();
		this.map(resetPartiel);
	}

	public void faireLePleinAll() {
		Fonction<Vehicule> faireLePlein = new FaireLePlein();
		this.map(faireLePlein);
    }

    public void map(Fonction<Vehicule> f) {
		for(Vehicule vehicule: vehicules){
			f.applyIt(vehicule);
		}
	}
}
