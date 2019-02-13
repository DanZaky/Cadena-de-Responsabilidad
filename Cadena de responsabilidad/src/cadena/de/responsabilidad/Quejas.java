package cadena.de.responsabilidad;

public interface Quejas {
    
    public void setNext(Quejas queja);
    public Quejas getNext();
    public void colocarQueja (int gravedad);
    
}
