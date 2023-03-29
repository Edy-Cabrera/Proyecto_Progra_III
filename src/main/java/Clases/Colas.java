
package Clases;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Colas {
    Queue<String> cola = new LinkedList();
    
    
     public void Agregar_cola() {
        Scanner elementoc = new Scanner(System.in);
                            String datoc = elementoc.nextLine();
                            cola.add(datoc);
    }
       
    public void Primer_elemento_cola() {
        System.out.println(cola.peek()); 
    }

    public void Eliminar_primer_elemento_cola() {
        System.out.println(cola.poll());
    }

    public void Buscar_elemento_Cola() {
         System.out.println("Digite el dato a buscar");
                            Scanner elementoc1 = new Scanner(System.in);
                            String datoc1 = elementoc1.nextLine();
                            System.out.println(cola.contains(datoc1));
    }

    public void Tamaño_cola(){
 System.out.println(cola.size());
    }
    
    public void Mostrar_cola(){
    System.out.println(cola);
    }
    
    
    
}
