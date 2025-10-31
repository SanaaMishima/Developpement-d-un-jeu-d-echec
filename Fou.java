public class Fou extends Piece{

    public Fou (String couleur, Case destination) {
		super(couleur, destination);
	}


    public boolean deplacement(Case destination){
    	for(int i=0; i < 8; i++){
    		if(destination.getPositionX()==this.getDestination().getPositionX()+i && destination.getPositionY()==this.getDestination().getPositionY()+i){
    			return true;}
			if(destination.getPositionX()==this.getDestination().getPositionX()+i && destination.getPositionY()==this.getDestination().getPositionY()-i){
				return true;}
			if(destination.getPositionX()==this.getDestination().getPositionX()-i && destination.getPositionY()==this.getDestination().getPositionY()+i){
				return true;}
			if(destination.getPositionX()==this.getDestination().getPositionX()-i && destination.getPositionY()==this.getDestination().getPositionY()-i){
				return true;} 		
			}
    		return false;
		}
}