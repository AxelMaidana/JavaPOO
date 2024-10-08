package sobreescrituraysobrecarga;

public class Animal {

    private int id_animal;
    private String descripcion;

    //constructor vacio
    public Animal() {
    }

    //constructor con parametros
    public Animal(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }

    //getters y setters
    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //otros metodos
    public void hacerSonido() {
        System.out.println("El animal esta haciendo sonido");
    }

    public void hacerSonido (String nombre_animal) {
        System.out.println("El animal llamado " + nombre_animal + " y estoy haciendo sonido");
    }

    public void hacerSonido (String nombreAnimal, String tipoSonido) {
    System.out.println("El animal llamado " + nombreAnimal + " y estoy haciendo este sonido: " + tipoSonido);
    }
}
