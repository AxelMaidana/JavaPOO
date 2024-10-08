package pokemon;

public class EjercicioIntegrador {
    
    public static void main(String[] args) {
        
        Squirtle Squirtle = new Squirtle();
        Charmander Charmander = new Charmander();
        Pikachu Pikachu = new Pikachu();
        Bulbasur Bulbasur = new Bulbasur();
        
        System.out.println("Ejercicio Integrador");
        System.out.println(".......................................................................................................");
        Squirtle.atacarPlacaje();
        Squirtle.atacarHidrobomba();
        Squirtle.atacarPistolaAgua();
        System.out.println(".......................................................................................................");
        Charmander.atacarPlacaje();
        Charmander.atacarAraniazo();
        Charmander.atacarMordisco();
        System.out.println(".......................................................................................................");
        Pikachu.atacarPlacaje();
        Pikachu.atacarAraniazo();
        Pikachu.atacarMordisco();
        System.out.println(".......................................................................................................");
        Bulbasur.atacarPlacaje();
        Bulbasur.atacarAraniazo();
        Bulbasur.atacarMordisco();
        System.out.println(".......................................................................................................");
    }

}
