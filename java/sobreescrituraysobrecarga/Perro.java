package sobreescrituraysobrecarga;

public class Perro extends Animal {

    private String nombre;
    private double peso;
    private String raza;
    private String sexo;

    //constructor vacio
    public Perro() {
    }

    //constructor con parametros
    public Perro(int id_animal, String descripcion, String nombre, double peso, String raza, String sexo) {
        super(id_animal, descripcion);
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El animal es un Perro y estoy haciendo sonido");
    }
}
