
package biblioteca;

public class Ejemplar {
    
     protected int cod; 
     protected int anop;
     protected String titulo;

    public Ejemplar(int cod, int anop, String titulo) 
    {
        this.cod = cod;
        this.anop = anop;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "codigo " + cod + ",año de publicacion " + anop + " años,titulo " + titulo;
    }
    
    
    
    
    
    
    
    
}
