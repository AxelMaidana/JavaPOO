
package POOEjemplo;
public class MAIN {

    public static void main (String[] args){

        Alumno alumno1 = new Alumno ();
        Alumno alumno2 = new Alumno (2 , "Axel", "Maidana");

        System.out.println("--------SISTEMA DE APROBACION DE ALUMNOS--------");
        System.out.println("El nombre completo del alumno 2 es: " + alumno2.getNombre() + " " + alumno2.getApellido() + " con el ID: " + alumno2.getId());
    
        alumno1.setId(1);
        alumno1.setNombre("Xiomara");
        alumno1.setApellido("Valdez");

        System.out.println("--------------------------------------------------");
        System.out.println("El nombre completo del alumno 1 es: " + alumno1.getNombre() + " " + alumno1.getApellido() + " con el ID: " + alumno1.getId());
    
        System.out.println("--------------------------------------------------");
        alumno2.setId(44);

        System.out.println("El nombre completo del alumno 2 es: " + alumno2.getNombre() + " " + alumno2.getApellido() + " con el ID: " + alumno2.getId());
    }
}