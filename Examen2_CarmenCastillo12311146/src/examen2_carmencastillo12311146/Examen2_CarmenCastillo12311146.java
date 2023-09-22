/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_carmencastillo12311146;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class Examen2_CarmenCastillo12311146 {

    static Scanner leer = new Scanner(System.in, "ISO-8859-1");
    static Scanner leerent = new Scanner(System.in);
    static Random rand = new Random();
    static Productos producto = new Productos();
    static ArrayList<Productos> productos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cont = 0;
        boolean seguirmenu = true;
        while (seguirmenu) {
            System.out.println(" ");
            System.out.println("--Menu Inventario--");
            System.out.println("1. Agregar Productos.");
            System.out.println("2. Buscar Producto.");
            System.out.println("3. Listar Productos.");
            System.out.println("4. Salir del Inventario.");
            System.out.print("Ingrese una opcion: ");
            int opcion = leerent.nextInt();

            switch (opcion) {
                case 1:

                    agregarProducto(productos);
                    cont++;

                    break;

                case 2:
                    boolean submenu = true;
                    while (submenu) {
                        System.out.println(" ");
                        System.out.println("--SubMenu Buscar--");
                        System.out.println("1. Buscar por Nombre.");
                        System.out.println("2. Buscar por ID.");
                        System.out.println("3. Salir");
                        System.out.print("Ingrese una opcion: ");
                        int opcionsub = leerent.nextInt();
                        
                        switch (opcionsub){
                            case 1:
                                System.out.print("Ingrese el nombre del producto: ");
                                String prod = leer.nextLine();
                                
                                buscarPorNombre(productos, prod);
                                
                                break;
                                
                                
                            case 2:
                                System.out.print("Ingrese el id del producto: ");
                                int codigo = leerent.nextInt();
                                
                                buscarPorID(productos, codigo);
                                
                                break;
                                
                                
                            default:
                                submenu = false;
                                break;
                            
                        }

                    }

                    break;

                case 3:
                    if (cont == 0){
                        System.out.println("Agregue un producto antes.");
                    }else{
                    
                    listarProd(productos);
                    
                    }
                    break;

                default:
                    System.out.println("Gracias por usar el inventario!");
                    seguirmenu = false;
                    break;

            }

        }

    }

    public static ArrayList<Productos> agregarProducto(ArrayList<Productos> nuevoProd) {
        Productos productoNuevo = new Productos();
        
        System.out.println("");
        System.out.println("Opción ingresada: Agregar Producto.");
        System.out.println("Por favor aporte la información solicitada.");
        System.out.print("Nombre del Producto: ");
        productoNuevo.setNombre(leer.nextLine());
        System.out.print("Cantidad: ");
        productoNuevo.setCantidad(leerent.nextInt());
        System.out.print("Precio: ");
        productoNuevo.setPrecio(leerent.nextDouble());

        //generar el id
        int idAleatorio = rand.nextInt(10000);
        productoNuevo.setIdProd(idAleatorio);

        nuevoProd.add(productoNuevo);
        System.out.println("Producto agregado exitosamente!");
        System.out.println("");

        return nuevoProd;

    }

    public static void listarProd(ArrayList<Productos> producto) {
        System.out.println("");
        System.out.println("Opción ingresada: Listar Productos.");
        for (int i = 0; i < producto.size(); i++) {
            System.out.println("");
            System.out.println("Producto " + (i + 1));
            System.out.println("ID: " + producto.get(i).getIdProd());
            System.out.println("Nombre: " + producto.get(i).getNombre());
            System.out.println("Cantidad: " + producto.get(i).getCantidad());
            System.out.println("Precio: " + producto.get(i).getPrecio());
            System.out.println("Estado: " + producto.get(i).getEstado());
            System.out.println("");

        }

    }
    
    private static void buscarPorID(ArrayList<Productos> producto, int codigo) {
        boolean encontrado = false;
        System.out.println("");
        for (int i = 0; i < producto.size(); i++) {
            if (codigo == productos.get(i).getIdProd()) {
                System.out.println("Producto encontrado!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado. :( ");
        }
        
    }
    
    private static void buscarPorNombre(ArrayList<Productos> producto, String nombre) {
        boolean encontrado = false;
        System.out.println("");
        for (int i = 0; i < producto.size(); i++) {
            if (nombre.equalsIgnoreCase(producto.get(i).getNombre())) {
                System.out.println("Producto encontrado! :)");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado. :( ");
        }
    }

}
