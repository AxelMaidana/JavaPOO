package colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
    
    public static void main(String[] args) {

        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(3302, "Axel Maidana");
        mapaEmpleados.put(1234, "Ivan Brazanovic");
        mapaEmpleados.put(5678, "Gabriel Duprat");

       /*  boolean estaono = mapaEmpleados.containsKey(3303);

        if (estaono == true) {
            System.out.println("El valor esta en la lista");
        } else {
            System.out.println("El valor no esta en la lista");
        }
            
        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());                                                                                                                                                                                                                 
        
        */
        
        String nombre = mapaEmpleados.get(3302);
        System.out.println(" Nombre: " + nombre);

        mapaEmpleados.remove(1234);
        
        System.out.println(mapaEmpleados);
    }
}   
