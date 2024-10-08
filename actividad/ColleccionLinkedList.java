package actividad;

import java.util.LinkedList;
import java.util.Scanner;

public class ColleccionLinkedList {

    private LinkedList<Empleado> listaEmpleados;
    private Scanner sc;

    //constructor inicializando la lista y el scanner
    public ColleccionLinkedList() {
        listaEmpleados = new LinkedList<>();
        sc = new Scanner(System.in);
    }
    
    //metodo para agregar un empleado a la lista
    public void agregarEmpleado(){
        System.out.println("Introduzca el nombre del empleado");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el ID del empleado");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el departamento del empleado");
        String departamento = sc.nextLine();

        //creamos un nuevo objeto Empleado
        Empleado nuevoEmpleado = new Empleado(nombre, id, departamento);
        listaEmpleados.add(nuevoEmpleado);

        System.out.println("Empleado agregado con exito");
    }

    //metodo para buscar un empleado por ID y devolver el nombre en la lista
    public void buscarEmpleado(){
        System.out.println("Ingrese el ID del empleado que desea buscar");
        int idBuscar = sc.nextInt();

        for(Empleado empleado : listaEmpleados){ 
            if(empleado.getID() == idBuscar){ 
                System.out.println("Empleado encontrado" + empleado.getNombre());
                return;
            }
        }
        System.out.println("No se encontro el empleado");
    }

    //metodo para eliminar un empleado por ID
    public void eliminarEmpleado() {
        System.out.print("Ingrese el ID del empleado que desea eliminar: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        Empleado empleadoAEliminar = null;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getID() == id) {
                empleadoAEliminar = empleado;
                break;
            }
        }

        if (empleadoAEliminar != null) {
            listaEmpleados.remove(empleadoAEliminar);
            System.out.println("Empleado eliminado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    //metodo para mostrar toda la lista
    public void listarEmpleados(){
        if (listaEmpleados.isEmpty()){
            System.out.println("La lista esta vacia");
        } else {
            for (Empleado empleado : listaEmpleados){
                System.out.println(empleado);
            }
        }
    }

    //metodo para editar un empleado
    public void editarEmpleado(){
        System.out.println("Introduzca el ID del empleado que desea editar");
        int id = sc.nextInt();

        for(Empleado empleado : listaEmpleados){
            if(empleado.getID() == id){
                System.out.println("Introduzca el nuevo nombre del empleado");
                String nombre = sc.nextLine();
                sc.nextLine();

                System.out.println("Ingrese el nuevo departamento del empleado");
                String departamento = sc.nextLine();

                //actualizamos el objeto empleado
                empleado.setNombre(nombre);
                empleado.setDepartamento(departamento);

                System.out.println("Empleado editado con exito");
                return;
            } else {
                System.out.println("No se encontro el empleado");
            }
        }
        
    }

    //metodo para mostrar un menu de opciones
    public void mostrarMenu() {
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1- Agregar Empleado");
            System.out.println("2- Buscar empleado por ID");
            System.out.println("3- Eliminar empleado por ID");
            System.out.println("4- Listar empleados");
            System.out.println("5- Editar empleado por ID");
            System.out.println("6- Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después del entero

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    buscarEmpleado();
                    break;
                case 3:
                    eliminarEmpleado();
                    break;
                case 4:
                    listarEmpleados();
                    break;
                case 5:
                    editarEmpleado();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

}