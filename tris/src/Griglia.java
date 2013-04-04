public class Griglia {
    
    private int righe;
    private int colonne;
    
    private  Simbolo [][] table;
    
    public Griglia(int pRighe, int pColonne) throws RigheNonValideException, ColonneNonValideException {
        if (pRighe <= 0)
            throw new RigheNonValideException();
        if (pColonne <= 0)
            throw new ColonneNonValideException();
        
        this.righe = pRighe;
        this.colonne = pColonne;
        this.table = new Simbolo [this.righe][this.colonne];
    }
    
    
    
}
