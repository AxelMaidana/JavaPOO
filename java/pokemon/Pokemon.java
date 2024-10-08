package pokemon;

public abstract class Pokemon {
    
    //atributos
    protected int numPokedex;
    protected String nombre;
    protected String peso;
    protected String sexo;
    protected String tipo;
    protected int temporada;


    //metodos abstractos
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
