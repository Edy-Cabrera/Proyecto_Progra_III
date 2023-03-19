/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Cristian Morales
 */
public class Principal {

    public static void main(String [ ] args) {
        Scanner ingreso = new Scanner(System.in);
        int opcion , opcion2 = 0, opcion3 = 0;
        
            System.out.println("MENU PILAS Y COLAS");
            System.out.println(" 1. Pilas");
            System.out.println(" 2. Colas");
            System.out.println(" 3. Salir");
            
            opcion = Integer.parseInt(ingreso.next());
            
            switch(opcion) {
                case 1:
                    Stack <String>pila = new Stack();
                        
                    do{
                    
                        System.out.println(" Digite una Opcion");
                        System.out.println(" 1. Agregar un dato");
                        System.out.println(" 2. Listar primer elemento de la Pila");
                        System.out.println(" 3. Eliminar el primer elemento");
                        System.out.println(" 4. Buscar un elemento");
                        System.out.println(" 5. Tamaño de la Pila");
                        System.out.println(" 6. Mostrar la Pila");
                        System.out.println(" 7. Salir");
                        opcion2 = Integer.parseInt(ingreso.next());
                     
                        switch(opcion2) {
                            case 1: 
                                System.out.println(" Digite el dato a agregar");
                                Scanner elemento = new Scanner(System.in);
                                String dato = elemento.nextLine();
                                pila.push(dato);
                                break;
                                
                            case 2:
                                System.out.println(pila.peek());
                                break;
                                
                            case 3:
                                System.out.println(pila.pop());
                                break;
                                
                            case 4:
                                System.out.println("Digite el dato a buscar");
                                Scanner elementob = new Scanner(System.in);
                                String datob = elementob.nextLine();
                                System.out.println(pila.search(datob));
                                break;
                                
                            case 5:
                                System.out.println(pila.size());
                                break;
                                
                            case 6:
                                System.out.println(pila);
                                break;
                        }
                        
                   }while(opcion2!=7);
                break;
                    
                case 2:
                    Queue<String>cola = new LinkedList();
                    
                    do{ 

                        System.out.println(" Digite una Opcion");
                        System.out.println(" 1. Agregar un dato");
                        System.out.println(" 2. Listar primer elemento de la Cola");
                        System.out.println(" 3. Eliminar el primer elemento");
                        System.out.println(" 4. Buscar un elemento");
                        System.out.println(" 5. Tamaño de la Cola");
                        System.out.println(" 6. Mostrar la Cola");
                        System.out.println(" 7. Salir");
                        opcion3 = Integer.parseInt(ingreso.next());
                        
                        switch(opcion3) {
                            case 1:
                                System.out.println("Digite el dato a agregar");
                                Scanner elementoc = new Scanner(System.in);
                                String datoc = elementoc.nextLine();
                                cola.add(datoc);
                                break;
                                
                            case 2:
                                System.out.println(cola.peek());
                                break;
                                
                            case 3:
                                System.out.println(cola.poll());
                                break;
                                
                            case 4:
                                System.out.println("Digite el dato a buscar");
                                Scanner elementoc1 = new Scanner(System.in);
                                String datoc1 = elementoc1.nextLine();
                                System.out.println(cola.contains(datoc1));
                                break;
                                
                            case 5:
                                System.out.println(cola.size());
                                break;
                                
                            case 6:
                                System.out.println(cola);
                                break;
                                
                        }
                        
                  }while(opcion3!=7);
                    
         break;           
         
         
                case 3:
                    System.out.println(" Programa finalizado");
                    break;
            }
     }
}
