
package biblioteca;


public class Libros extends Ejemplar implements InterfaceBiblioteca{
    
 private boolean prestado;
   //Constructor
    
    public Libros(boolean prestado,int cod,int anop,String titulo )
    {
    super(cod,anop,titulo);
    }

    

   
    public void  prestar()
    {
      prestado=true;
        
    }
    public void  devolver()
    {
        prestado=false;
    }
    
    
    
    
    
    
    //Metodo
    /*  public void Parametros(int codigo, int añopu, String tit) {
    cod=codigo;
    añop=añopu;
    titulo=tit;
    }
    public int getCod() {
    return cod;
    }
    public int getAñop() {
    return añop;
    }*/

    @Override
    public String toString() {
     //   return  "prestado " + prestado+ ""+ ;
        
     return super.toString()+ ",prestado "+prestado; 
                //NomE.getNomE();
    }
    
    }
    
    
    
    
    

