
/*
link GITHUB https://github.com/Edy-Cabrera/Proyecto_Progra_III.git
 */
package Clases;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion, opcion2 = 0, opcion3 = 0; int opcion4 = 0; 

        System.out.println("SELECIONA UNA OPCION");
        System.out.println(" 1. PILAS");
        System.out.println(" 2. COLAS");
        System.out.println(" 3. AVL ");
        System.out.println(" 4. TABLAS ASH ");
        System.out.println(" 5. Salir");

        opcion = Integer.parseInt(ingreso.next());
        Pilas pila = new Pilas();
         Colas cola = new Colas();
        switch (opcion) {
            case 1:

                do {
                    System.out.println(" ***PILAS***");
                    System.out.println(" Digite una Opcion");
                    System.out.println(" 1. Agregar un dato");
                    System.out.println(" 2. Listar primer elemento de la Pila");
                    System.out.println(" 3. Eliminar el primer elemento");
                    System.out.println(" 4. Buscar un elemento");
                    System.out.println(" 5. Tamaño de la Pila");
                    System.out.println(" 6. Mostrar la Pila");
                    System.out.println(" 7. Volver a Menu Principal");
                    opcion2 = Integer.parseInt(ingreso.next());

                    switch (opcion2) {
                        case 1:
                            System.out.println(" Digite el dato a agregar");
                            pila.Agregar_Pila();

                            break;

                        case 2:
                            pila.Primer_elemento_pila();
                            break;

                        case 3:
                            pila.Eliminar_primer_elemento_pila();
                            break;

                        case 4:
                            pila.Buscar_elemento_Pila();
                            break;

                        case 5:
                            pila.Tamaño_pila();
                            break;

                        case 6:
                            pila.Mostrar_pila();
                            break;
                    }

                } while (opcion2 != 7);
                break;

            case 2:
                

                do {
                    System.out.println(" ***COLAS***");
                    System.out.println(" Digite una Opcion");
                    System.out.println(" 1. Agregar un dato");
                    System.out.println(" 2. Listar primer elemento de la Cola");
                    System.out.println(" 3. Eliminar el primer elemento");
                    System.out.println(" 4. Buscar un elemento");
                    System.out.println(" 5. Tamaño de la Cola");
                    System.out.println(" 6. Mostrar la Cola");
                    System.out.println(" 7. Volver a Menu Principal");
                    opcion3 = Integer.parseInt(ingreso.next());

                    switch (opcion3) {
                        case 1:
                            System.out.println("Digite el dato a agregar");
                           cola.Agregar_cola();
                            break;

                        case 2:
                           cola.Primer_elemento_cola();
                            break;

                        case 3:
                           cola.Eliminar_primer_elemento_cola();
                            break;

                        case 4:
                          cola.Buscar_elemento_Cola();
                            break;

                        case 5:
                           cola.Tamaño_cola();
                            break;

                        case 6:
                           cola.Mostrar_cola();
                            break;

                    }

                } while (opcion3 != 7);

                break;

            case 3:

                do {
                    System.out.println(" ***ARBOL AVL***");
                    System.out.println(" Digite una Opcion");
                    System.out.println(" 1. Ingresar Nodo");
                    System.out.println(" 2. Eliminar Nodo");
                    System.out.println(" 3. Volver a Menu Principal");

                    opcion4 = Integer.parseInt(ingreso.next());

                    switch (opcion4) {
                        case 1:
                            System.out.println(" Ingrese el dato a agregar");

                            break;

                        case 2:
                            System.out.println("Elimine el dato a agregar");
                            break;

                    }

                } while (opcion4 != 3);
                break;

                
               
                
            case 4:
                System.out.println(" Programa finalizado");
                break;

        }

    }
}
