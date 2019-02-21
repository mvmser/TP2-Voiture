package voiture;

//Exception en cas de d�pacement du r�servoir lorsqu'on met de l'essence
public class CapaciteDepasseeException extends Exception{
	/**
	 * 
	 * Ajout du serialVersionUID pour la s�rialisation et des�rialisation de l'objet.
	 */
	private static final long serialVersionUID = 3455269160790106171L; 

	public CapaciteDepasseeException(String message){
        //this.depassementJauge = depassementJauge;
        //System.out.printf("Il y a %.2f L d'essence en trop!!%n", depassementJauge);
        super(message);
    }
}