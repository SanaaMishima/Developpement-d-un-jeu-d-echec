 import java.util.Scanner;
 
 public class Partie {

   Echiquier plateau = new Echiquier();
   //Roi roi = new Roi(null, null);
   String[] listeCoups;

   Scanner demandeNom = new Scanner(System.in);
   System.out.println("Entrer un premier nom de joueur");
   String nom = demandeNom.nextLine();
   Joueur joueur1 = new Joueur(nom,'blanc');

   Scanner demandeNom = new Scanner(System.in);
   System.out.println("Entrer un deuxième nom de joueur");
   String nom = demandeNom.nextLine();
   Joueur joueur2 = new Joueur(nom,'noir');

   Joueur joueurCourant=joueur1;
   boolean echec=false;

   public void afficheJeu(){
      System.out.println(plateau.getEchiquier());
   }

   public void afficheCoups(){
      for(int i=0;i<listeCoups.length;i++){
         System.out.println(listeCoups[i])
      }
   }

   public Joueur changementJoueur(Joueur joueurCourant){
      if(joueurCourant.getNom()==joueur1.getNom()){
         joueurCourant=joueur2;
      }
      if(joueurCourant.getNom()==joueur2.getNom()){
         joueurCourant=joueur1;
      }
   }

   public void tour(Joueur joueurCourant){
      while (Roi.echecEtMat(echec)==false){
         afficheJeu();
         afficheCoups();
         System.out.println('Entrez la case de la pièce que vous voulez bouger, puis sa nouvelle position');
         bougerPiece();
         changementJoueur(joueurCourant);
      }
   }

 }
