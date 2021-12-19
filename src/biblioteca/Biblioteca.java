
package biblioteca;


public class Biblioteca {

   
    public static void main(String[] args) {
       
        
        
      Ejemplar ej = new Ejemplar(127,5,"laaa");
       
       Revistas r = new Revistas(122,511,6,"Ciencia y Arte ");
       Libros l = new Libros(false,123,8,"Cien años de Soledad ");

      
       
       System.out.println("Revista:"+r.toString());
       System.out.println("Libro:"+l.toString());
       
      
    }
    
}
