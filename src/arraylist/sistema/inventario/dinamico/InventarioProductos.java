package arraylist.sistema.inventario.dinamico;

import java.util.Scanner;
import java.util.ArrayList;

public class InventarioProductos {

    public static Scanner sc;
    public static ArrayList<String> ListaProductos = new ArrayList<>();

    public static int opcion = 0;

    public static void main(String[] args) {

        // Ejercicio use ArrayList y solicite 5 cosas al ausuario para que ingrese 
        // debo usar los metodos de ArrayList para demostrar la funcionalidad 
        sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de registro del inventario: ");

        System.out.println("Ingrese 5 productos: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Producto #" + (i + 1) + " :");

            String nombreProducto = sc.nextLine();
            ListaProductos.add(nombreProducto);
            sc.nextLine();
        }
        do {

            System.out.println("Que desea hacer?");
            System.out.println("1. ver todos los productos ");
            System.out.println("2. Agreagar producto ");
            System.out.println("3. Editar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. salir ");
            System.out.println("Seleccione una opción del menu ");
            opcion = sc.nextInt();
            System.out.println("*********************");

            switch (opcion) {
                case 1:
                    verProductos();
                    break;
                case 2:
                    agregaProducto();
                    break;
                case 3:
                    agregaProducto();
                    break;
                case 4:
                    eliminarproducto();
                    break;

            }

        } while (opcion != 0);

        System.out.println("FIN DEL PROGRAMA, GRACIAS");

    }

    public static void verProductos() {
         System.out.println("*************");
            System.out.println("---Lista de productos---");
        for (int i = 0; i < ListaProductos.size(); i++) {
            System.out.println(ListaProductos.get(i));

        }

    }

    public static void agregaProducto() {
        System.out.println("Cuantos productos desea agregar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre Producto: ");
            String nuevoProducto = sc.nextLine();
            ListaProductos.add(nuevoProducto);

        }
    }

    public static void editarProducto() {
        System.out.println("De esta lista de productos cual desea modificsr");
        for(int i =0; i<ListaProductos.size(); i++) {
            System.out.println(""+i+"->"+ListaProductos.get(i));
            
            
        }
        System.out.println("Elija una de las opciones a editar: ");
        int opcionEditar =  sc.nextInt();
        System.out.println("Con que nombre desea reemplazarlo?");
        String nuevoNombre = sc.nextLine();
        ListaProductos.set(opcionEditar, nuevoNombre);
        sc.nextLine();
    }

    public static void eliminarproducto() {
        System.out.println("Qué producto desea eliminar:");
        
        for(int i=0; i <ListaProductos.size(); i++){
           
            System.out.println(i+"->"+ ListaProductos.get(i));    
        }
        System.out.println("Elija el producto que desea eliminar: ");
        int opcionEliminar = sc.nextInt();
        ListaProductos.remove(opcionEliminar);

    }

}
