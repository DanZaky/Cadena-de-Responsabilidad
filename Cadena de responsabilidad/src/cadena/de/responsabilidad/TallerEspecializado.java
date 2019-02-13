package cadena.de.responsabilidad;

import javax.swing.JOptionPane;

public class TallerEspecializado implements Quejas{
    private Quejas next;
    
    public Quejas getNext(){
        return next;
    }
    
    public void colocarQueja( int gravedad){
        if (gravedad > 7 ){
            JOptionPane.showMessageDialog(null, "El problema lo manejo yo, el Taller Especializado.");
        } else {
           next.colocarQueja(gravedad);
        }
    }
    
    public void setNext(Quejas queja){
        next = queja;
    }
}
