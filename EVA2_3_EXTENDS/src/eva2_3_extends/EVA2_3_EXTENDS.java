

package eva2_3_extends;


public class EVA2_3_EXTENDS {

   
    public static void main(String[] args) {
        
        Estudiante estu = new Estudiante();
        estu.setNombre("Jardel");
        estu.setApellido("Contreras");
        
        estu.setNocontrol("22550327");
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNocontrol());
        
        Docentes doce = new Docentes();
           doce.settnombre("Ruben");
           doce.getapellido("Hernandez");
            
        
    }
    
}
