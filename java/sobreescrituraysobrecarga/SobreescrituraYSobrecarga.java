package sobreescrituraysobrecarga;

public class SobreescrituraYSobrecarga {

    public static void main(String[] args) {
        
        System.out.println("Sobreescritura y Sobrecarga");
        System.out.println(".......................................................................................................");
        Animal Animal = new Animal(1, "Perro");
        Animal.hacerSonido();
        Animal.hacerSonido("Perrito");
        Animal.hacerSonido("Perrito", "ladra");
        System.out.println(".......................................................................................................");

        Animal Animal2 = new Animal(2, "Gato");
        Animal2.hacerSonido();
        Animal2.hacerSonido("Gatito");
        Animal2.hacerSonido("Gatito", "maulla");
        System.out.println(".......................................................................................................");

        Animal Animal3 = new Animal(3, "Elefante");
        Animal3.hacerSonido();
        Animal3.hacerSonido("Elefante");
        Animal3.hacerSonido("Elefante", "sonido por la trompa");
        System.out.println(".......................................................................................................");

        Perro perro = new Perro();
        perro.hacerSonido();

        Gato gato = new Gato();
        gato.hacerSonido();
    }
}
