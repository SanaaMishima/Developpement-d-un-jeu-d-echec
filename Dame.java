public class Dame extends Piece{

    public Dame (String couleur, Case destination) {
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
            if(destination.getPositionX()==this.getDestination().getPositionX()+1 || destination.getPositionX()==this.getDestination().getPositionX()-1){
                return true;}
            if(destination.getPositionY()==this.getDestination().getPositionY()+1 || destination.getPositionY()==this.getDestination().getPositionY()-1){
                return true;}		
			}
    		return false;
		}
}