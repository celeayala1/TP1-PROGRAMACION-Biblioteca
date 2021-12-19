
package biblioteca;

public class Revistas extends Ejemplar {
    private int num;

    public Revistas(int num, int cod, int añop, String titulo) {
        super(cod, añop, titulo);
        this.num = num;
    }


    
    
    public void Pasar(int numero)
    {
    num=numero;
    }
    
    
    @Override
    public String toString() {
       // return   "numero de revista " + num;
        return super.toString()+ "y numero de revista " +num; 
    }
    
    
    
    
    
    
}
