import java.util.*;

public class Echiquier {

    private Case[][] echiquier;

    public Echiquier () {
        for (int i = 0; i< 8; i++){
            for (int y = 0; y < 8; y++) {
                echiquier[i][y] = new Case(i,y);
            }
            echiquier[0][0].setPiece(new Tour("Noir", echiquier[0][0]));
            echiquier[0][1].setPiece(new Cavalier("Noir", echiquier[0][1]));
            echiquier[0][2].setPiece(new Fou("Noir", echiquier[0][2]));
            echiquier[0][3].setPiece(new Dame("Noir", echiquier[0][3]));
            echiquier[0][4].setPiece(new Roi("Noir", echiquier[0][4]));
            echiquier[0][5].setPiece(new Fou("Noir", echiquier[0][5]));
            echiquier[0][6].setPiece(new Cavalier("Noir", echiquier[0][6]));
            echiquier[0][7].setPiece(new Tour("Noir", echiquier[0][7]));
            for (int z = 0; z < 8; z++) {
                echiquier[1][z].setPiece(new Pion("Noir", echiquier[1][z]));
            }
            echiquier[7][0].setPiece(new Tour("Blanc", echiquier[7][0]));
            echiquier[7][1].setPiece(new Cavalier("Blanc", echiquier[7][1]));
            echiquier[7][2].setPiece(new Fou("Blanc", echiquier[7][2]));
            echiquier[7][3].setPiece(new Roi("Blanc", echiquier[7][3]));
            echiquier[7][4].setPiece(new Dame("Blanc", echiquier[7][4]));
            echiquier[7][5].setPiece(new Fou("Blanc", echiquier[7][5]));
            echiquier[7][6].setPiece(new Cavalier("Blanc", echiquier[7][6]));
            echiquier[7][7].setPiece(new Tour("Blanc", echiquier[7][7]));
            for (int z = 0; z < 8; z++) {
                echiquier[6][z].setPiece(new Pion("Blanc", echiquier[6][z]));
            }
        }
    }

    public String demandeCase(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Veuiller mettre une case");
        String nomCase = sc.nextLine();
        sc.close();
        return nomCase;
    }

    public int traduitCaseColonne(String scan){
        int indexColonneInt;
        char indexColonneChar = scan.charAt(0);
        if (indexColonneChar == 'a' || indexColonneChar == 'A'){
            indexColonneInt = 0;}
        if (indexColonneChar == 'b' || indexColonneChar == 'B'){
            indexColonneInt = 1;}
        if (indexColonneChar == 'c' || indexColonneChar == 'C'){
            indexColonneInt = 2;}
        if (indexColonneChar == 'd' || indexColonneChar == 'D'){
            indexColonneInt = 3;}
        if (indexColonneChar == 'e' || indexColonneChar == 'E'){
            indexColonneInt = 4;}
        if (indexColonneChar == 'f' || indexColonneChar == 'F'){
            indexColonneInt = 5;}
        if (indexColonneChar == 'g' || indexColonneChar == 'G'){
            indexColonneInt = 6;}
        if (indexColonneChar == 'h' || indexColonneChar == 'H'){
            indexColonneInt = 7;}
        else {indexColonneInt = -1;}
        return indexColonneInt;
    }
        

    public int traduitCaseLigne(String scan){
        int indexLigneInt;
        char indexLigneChar = scan.charAt(1);
        if (indexLigneChar == '8'){
            indexLigneInt = 0;}
        if (indexLigneChar == '7'){
            indexLigneInt = 1;}
        if (indexLigneChar == '6'){
            indexLigneInt = 2;}
        if (indexLigneChar == '5'){
            indexLigneInt = 3;}
        if (indexLigneChar == '4'){
            indexLigneInt = 4;}
        if (indexLigneChar == '3'){
            indexLigneInt = 5;}
        if (indexLigneChar == '2'){
            indexLigneInt = 6;}
        if (indexLigneChar == '1'){
            indexLigneInt = 7;}
        else {indexLigneInt = -1;}
        return indexLigneInt;
    }

    public void bougerPiece(){
        String scan1 = demandeCase();
        String scan2 = demandeCase();
        Case positionDefault = echiquier[traduitCaseLigne(scan1)][traduitCaseColonne(scan1)];
        Case positionVoulue = echiquier[traduitCaseLigne(scan2)][traduitCaseColonne(scan2)];
        if (traduitCaseColonne(scan1) == -1 || traduitCaseLigne(scan1) == -1 || traduitCaseColonne(scan2) == -1 || traduitCaseLigne(scan2) == -1){
            System.out.println("La ligne ou la colonne choisie est invalide, veuillez réessayer");
        } 
        else{
            positionVoulue.setPiece(positionDefault.getPiece());
            positionDefault.deletePiece();
        }
    }

    public Case[][] getEchiquier(){
        return echiquier;
    }	
}



    
