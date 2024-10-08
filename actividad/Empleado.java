package actividad;

public class Empleado {

    private String Nombre;
    private int ID;
    private String Departamento;

    //constructor con parametros
    public Empleado(String nombre, int id, String departamento) {
        this.Nombre = nombre;
        this.ID = id;
        this.Departamento = departamento;
    }

    //getters de los tres atributos
    public String getNombre() {
        return Nombre;
    }

    public int getID() {
        return ID;
    }

    public String getDepartamento() {
        return Departamento;
    }

    //setters de Nombre y Departamento
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.Departamento = departamento;
    }

    //toString
    @Override
    public String toString() {
        return "Nombre: " + Nombre + " ID: " + ID + " Departamento: " + Departamento;
    }
}