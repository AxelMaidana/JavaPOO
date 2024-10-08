package claseabstracta;

public abstract class Figura {

    protected double x;
    protected double y;

    //Metodos abstractos
    public abstract double calcularArea();
        
    //Constructor vacio
    public Figura() {
    }

    //Constructor con parametros
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
