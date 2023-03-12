

package eva2_6_herencia_constructores;


public class EVA2_6_Herencia_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        System.out.println("Animales");
        Animal animal = new Animal();
        
        
        animal.comen();
        animal.respirar();
        
        Mamifero mamifero = new Mamifero();
        
        
        System.out.println("Mamiferos");
        mamifero.comen();
        mamifero.nacen();
        mamifero.pelo();
        mamifero.respirar();
        
    
    }
    
}
