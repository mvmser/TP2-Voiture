package voiture;

public class CapaciteDepasseeException extends Exception{

	private static final long serialVersionUID = 3455269160790106171L;

	public CapaciteDepasseeException(String message){
        //this.depassementJauge = depassementJauge;
        //System.out.printf("Il y a %.2f L d'essence en trop!!%n", depassementJauge);
        super(message);
    }
}