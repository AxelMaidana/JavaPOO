package colecciones.linkedlist;


import java.util.LinkedList;
import java.util.List;

public class LinkedListEjemplo {  
    
    public static void main(String[] args) {
        
        // Uso del operador diamante <>
        List<Persona> lista = new LinkedList<>();

        //agregar personas al final de la lista
        lista.add(new Persona(1, "Juan", 30));
        lista.add(new Persona(2, "Axel", 9)); 
        lista.add(new Persona(3, "Marcos", 12));
        lista.add(new Persona(4, "Roly", 2));

        //agregar personas al principio de la lista
        lista.add(0, new Persona(5, "primero", 30));
        lista.add(0, new Persona(6, "segundo", 9)); 
        lista.add(0, new Persona(7, "tercero", 12));
        lista.add(0, new Persona(8, "cuarto", 2));

        // remover personas
        lista.remove(0);
        
        //remove en LinkedList
        String nombreBorrar = "primero";
        for (Persona personaRemovida : lista) {
            if (personaRemovida.getNombre().equals(nombreBorrar)) {
                lista.remove(personaRemovida);
                break;
            }
        }

        System.out.println("----------------FOREACH-----------------");
        // Recorrer por posición
        for (Persona persona : lista) {
            System.out.println("Prueba: " + persona.getNombre() + " " + persona.getId() + " " + persona.getEdad());
        }

        System.out.println("---------------toString-----------------");
        System.out.println("Primero en la lista: " + lista.getFirst().toString());
        System.out.println("Último en la lista: " + lista.getLast().toString());
    }

    

}
