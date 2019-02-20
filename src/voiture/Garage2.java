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
}
