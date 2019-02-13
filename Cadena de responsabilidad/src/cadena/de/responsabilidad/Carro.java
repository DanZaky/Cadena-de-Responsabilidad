package cadena.de.responsabilidad;

public class Carro implements Quejas{
    private Quejas next;
    
    public Quejas getNext(){
        return next;
    }
    
    public void colocarQueja(int gravedad){
        
        
        Mecanico mecanico = new Mecanico();
        this.setNext(mecanico);
        
        TallerEspecializado taller = new TallerEspecializado();
        mecanico.setNext(taller);
        
        Dueño dueño = new Dueño();
        taller.setNext(dueño);
        
        next.colocarQueja(gravedad);
    }
    
    public void setNext(Quejas queja){
        next = queja;
    }
}
