package HerenciaJava;   

public class Consultor extends Persona {

    String nombre_consultora;
    int num_consultora;

    // Constructor vacio
    public Consultor() {
    }

    // Constructor con parametros
    public Consultor(int id, int dni, String nombre, String apellido, String direccion, String telefono, String nombre_consultora,
            int num_consultora) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultora = num_consultora;
    }

    // Getters y setters
    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(int num_consultora) {
        this.num_consultora = num_consultora;
    }
}
