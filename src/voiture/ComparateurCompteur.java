package voiture;

import java.util.Comparator;

//Classe qui permet de comparer un compteur de chaque vehicule.

public class ComparateurCompteur implements Comparator<Vehicule>{
    //static final Comparator<Vehicule> COMPTEUR_ORDER = new Comparator<Vehicule
	
    @Override
    public int compare(Vehicule v1, Vehicule v2) {
        return (int) (v1.getCompteur().getTotalisateur() - v2.getCompteur().getTotalisateur());
    };
}
