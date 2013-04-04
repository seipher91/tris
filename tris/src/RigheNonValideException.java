class RigheNonValideException extends Exception {

    public RigheNonValideException() {
        super("Colonne non valide");
    }
    public RigheNonValideException(String pMessage) {
        super(pMessage);
    }
    
}
