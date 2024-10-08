package HerenciaJava;

public class Jefe extends Persona {

    int id_jefe;
    String departamento_jefe;

    // Constructor vacio
    public Jefe() {
    }

    // Constructor con parametros
    public Jefe(int id, int dni, String nombre, String apellido, String direccion, String telefono, int id_jefe,
            String departamento_jefe) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    // Getters y setters
    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }
}
