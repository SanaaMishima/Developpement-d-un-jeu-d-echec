public class Case {

    //Atributs
    private int positionX;
    private int positionY;
    private Piece piece;

    //Constructeur
    public Case (int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.piece = null;
    }

    //Methodes

    public void afficherCaseActuelle(){
        System.out.println(this.getPiece());
    }
    
    public void deletePiece(){
        this.piece = null;
    }

    //Setter
    public void setPositionX (int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY (int positionY) {
        this.positionY = positionY;
    }

    public void setPiece(Piece piece){
		this.piece = piece;
	}

    //Getter
    public int getPositionX () {
        return positionX;
    }

    public int getPositionY () {
        return positionY;
    }

    public Piece getPiece () {
        return piece;
    }
}