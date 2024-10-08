package colecciones.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEjemplo {  
    
    public static void main(String[] args) {
        
        // Uso del operador diamante <>
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "Juan", 30));
        lista.add(new Persona(2, "Axel", 9)); 
        lista.add(new Persona(3, "Marcos", 12));
        lista.add(new Persona(4, "Roly", 2));
        
        // Recorrer por índice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre() + " " + lista.get(i).getId() + " " + lista.get(i).getEdad());
        }

        // Recorrer por posición
        for (Persona persona : lista) {
            System.out.println("Prueba: " + persona.getNombre() + " " + persona.getId() + " " + persona.getEdad());
        }
    }

}
