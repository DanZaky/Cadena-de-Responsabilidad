package cadena.de.responsabilidad;

import javax.swing.JOptionPane;

public class Dueño implements Quejas{
    private Quejas next;
    
    public Quejas getNext(){
        return next;
    }
    
    public void colocarQueja( int gravedad){
        if (gravedad <= 3 ){
            JOptionPane.showMessageDialog(null, "El problema lo manejo yo, el Dueño.");
        } 
    }

    @Override
    public void setNext(Quejas queja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

