package pokemon;

public class Charmander extends Pokemon implements  IFuego {

    //constructor vacio
    public Charmander() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque Placaje ");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Arañazo ");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque Mordisco ");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Puño Fuego ");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Ascuas ");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque Lanzallamas ");
    }
    

}
