package claseabstracta;

public class Circulo extends Figura {

    private double radio;

    //Constructor vacio
    public Circulo() {
    }

    //Constructor con parametros
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = Math.PI * radio * radio;
        return resultado;
    }

}
