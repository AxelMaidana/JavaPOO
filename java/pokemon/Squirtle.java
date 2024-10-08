package pokemon;

public class Squirtle extends Pokemon implements  IAgua {

    //constructor vacio
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Placaje ");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Arañazo ");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Mordisco ");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Hidrobomba ");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Pistola Agua ");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Burbuja ");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy es Squirtle y este es mi ataque Hidropulso ");
    }

  
}
