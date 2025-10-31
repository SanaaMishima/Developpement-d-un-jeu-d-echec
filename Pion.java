public class Pion extends Piece{
    
  public Pion (String couleur, Case destination) {
    super(couleur, destination);
  }

  public boolean deplacement(Case destination){
    if (this.getCouleur().equals("Noir")) {
      if ((this.getDestination().getPositionX()==1 && destination.getPositionX()==this.getDestination().getPositionX()+2) || (destination.getPositionX()==this.getDestination().getPositionX()+1)){
        return true;}
      if (destination.getPositionX()==this.getDestination().getPositionX()+1){
        return true;}
    }
    if (this.getCouleur().equals("Blanc")) {
      if ((this.getDestination().getPositionX()==6 && destination.getPositionX()==this.getDestination().getPositionX()-2) || (destination.getPositionX()==this.getDestination().getPositionX()-1)){
        return true;}
      if (destination.getPositionX()==this.getDestination().getPositionX()-1){
        return true;} 
    }
    return false;
  }
}

