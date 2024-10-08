package claseabstracta;

public class ClaseAbstracta {
    
    public static void main(String[] args) {
        
        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado(0, 0, 3);
        Cuadrado cuadrado3 = new Cuadrado(3, 4, 5);
        
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(1, 2, 3);
        Circulo circulo3 = new Circulo(3, 4, 5);        
        
        System.out.println("Area: " + cuadrado1.calcularArea());
        System.out.println("Area: " + cuadrado2.calcularArea());
        System.out.println("Area: " + cuadrado3.calcularArea());
        
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Area: " + circulo2.calcularArea());
        System.out.println("Area: " + circulo3.calcularArea());
    }

}
