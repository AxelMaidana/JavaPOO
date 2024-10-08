package interfaces;

public class ClaseAbstracta {
    
    public static void main(String[] args) {
        
        // implementar las interfaces rotable y dibujable
        //Figura es una clase abstracta NO SE INSTANCIA

        Rotable rotable = new Circulo(10);
        rotable.rotar();
        Dibujable dibujableCirculo = new Circulo(10);
        dibujableCirculo.dibujar();

        Dibujable dibujableCuadrado = new Cuadrado(10);
        dibujableCuadrado.dibujar();    


    }

}
