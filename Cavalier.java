public class Cavalier extends Piece{
	
	public Cavalier(String couleur, Case destination) {
		super(couleur, destination);
	}
	
	public boolean deplacement(Case destination) {
		int new_x=destination.getPositionX();
		int new_y=destination.getPositionY();
		int x=this.getDestination().getPositionX();
		int y=this.getDestination().getPositionY();
		return ((new_x==x-2 && new_y==y-1) || (new_x==x-2 && new_y==y+1) || (new_x==x-1 && new_y==y-2) || (new_x==x+1 && new_y==y-2) || (new_x==x+2 && new_y==y-1) || (new_x==x+2 && new_y==y+1) || (new_x==x-1 && new_y==y+2) || (new_x==x+1 && new_y==y+2));
	}
	
}