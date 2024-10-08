package pokemon;

public class Bulbasur extends Pokemon implements IPlanta {

    //constructor vacio
    public Bulbasur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Latigo Cepa");
    }

    
}
