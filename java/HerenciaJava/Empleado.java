package HerenciaJava;

public class Empleado extends Persona {
    
    int num_legajo;
    String cargo;
    Double sueldo;
    
    // Constructor vacio
    public Empleado() {
    }

    // Constructor con parametros
    public Empleado(int id, int dni, String nombre, String apellido, String direccion, String telefono, int num_legajo,
            String cargo, Double sueldo) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y setters
    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


    
}
