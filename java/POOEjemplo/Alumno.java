package POOEjemplo;

public class Alumno {

    int id;
    String nombre;
    String apellido;

    //Constructor vacio
    public Alumno() {
    }

    //Constructor con parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

/*------------------------------------------------------------------------------*/

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

/*------------------------------------------------------------------------------*/

    //Metodo para mostrar el nombre del alumno
    public void mostrarNombre(){
        System.out.println("Hola mi nombre es: " + nombre + "" + apellido);
    }

    //Metodo para saber si el alumno ha aprobado
    public void saberAprobado(double calificacion){

        if (calificacion >= 6){
            System.out.println("yeii aprobe!!");
        }
            System.out.println("no aprobe, pipipi");
    }
}
