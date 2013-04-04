class ColonneNonValideException extends Exception {

    public ColonneNonValideException() {
        super("Colonne non valide");
    }
    
    public ColonneNonValideException(String pMessage) {
        super(pMessage);
    }
    
}
