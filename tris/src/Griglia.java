public class Griglia {
    
    public static final int OK = 0;
    public static final int ERRORE = -1;
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
    
    public int setSimbolo(int pRiga, int pColonna, Simbolo pSimbolo) throws RigheNonValideException, ColonneNonValideException {
        this.checkindex(pRiga,pColonna);
        if (isEmply(pRiga,pColonna)==true) {
            this.table[pRiga][pColonna] = pSimbolo;
            return OK;
        } else {
            return ERRORE;
        }
    }
    
    public boolean isEmply(int pRiga, int pColonna) throws RigheNonValideException, ColonneNonValideException {
        this.checkindex(pRiga,pColonna);
        if(this.table[pRiga][pColonna] == null)
            return true;
        else
            return false;
    }
    
    private void checkindex(int pRiga, int pColonna) throws RigheNonValideException, ColonneNonValideException {
        if ((pRiga < 0) || (pRiga >= this.righe))
            throw new RigheNonValideException("Indice colonna non valido");
        if ((pColonna < 0) || (pColonna >= this.colonne))
            throw new ColonneNonValideException("Indice colonna non valido");
    }
}
