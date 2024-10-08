package interfaces;

public class Circulo implements Figura, Rotable, Dibujable {

    private double radio;

    //Constructor vacio
    public Circulo() {
    }

    //Constructor con parametros
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = Math.PI * radio * radio;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando UN CIRCULO");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando UN CIRCULO");
    }

}
