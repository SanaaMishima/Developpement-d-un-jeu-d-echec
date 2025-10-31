public class Roi extends Piece{
	
	public Roi(String couleur, Case destination) {
		super(couleur, destination);
	}
	
	public boolean deplacement(Case destination) {
		int new_x=destination.getPositionX();
		int new_y=destination.getPositionY();
		int x=this.getDestination().getPositionX();
		int y=this.getDestination().getPositionY();
		return (new_x==x-1 || new_y==y-1 || new_x==x+1 || new_y==y+1);
	}
	
	public boolean echecEtMat(boolean echec) {
		if (echec){
			for(int i=0;i<8;i++){
				boolean test=(deplacement(destination.getPositionX()+1,destination.getPositionY())||deplacement(destination.getPositionX()-1,destination.getPositionY())||deplacement(destination.getPositionX(),destination.getPositionY()+1)||deplacement(destination.getPositionX()+1,destination.getPositionY()-1));
				if (test==false){
					return true;
				}
			}
		}
	}
}