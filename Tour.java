public class Tour extends Piece{

	public Tour(String couleur, Case destination) {
		super(couleur,destination);
	}
	
	public boolean deplacement(Case destination) {
		int new_x=destination.getPositionX();
		int new_y=destination.getPositionY();
		int x=this.getDestination().getPositionX();
		int y=this.getDestination().getPositionY();
		return ((new_x==x && new_y!=y) || (new_x!=x && new_y==y));
	}
	
}