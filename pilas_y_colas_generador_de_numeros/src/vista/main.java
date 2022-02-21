/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author david
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frm_pilas_y_colas principal=new frm_pilas_y_colas();
         principal.show();
        /*Random aleatorio = new Random();
        ArrayList<Integer> arreglo = new ArrayList<>();
        for (int i=1; i<=1000000; i++){
            int value = aleatorio.nextInt(10000000-(-10000000)+1)+(-10000000);
            arreglo.add(value);
        }
        System.out.println(arreglo);*/
        
        //Estructuras
        /*Queue<Integer> cola = new LinkedList<Integer>(); 
        Stack<Integer> pila = new Stack<Integer>();
        Random aleatorio = new Random();
        ArrayList<Integer> arreglo = new ArrayList<>();*/
        
        //Cola :D
        /*for (int i=1; i<=1000000; i++){
            int value = aleatorio.nextInt(10000000-(-10000000)+1)+(-10000000);
            //arreglo.add(value);
            cola.add(value);
        }
        //System.out.println(arreglo+"\n");
        System.out.println("Size: " + cola.size());
        System.out.println(cola);
        for (int i=1; i<=1000000; i++){
            cola.remove();
        }
        System.out.println("Size: " + cola.size());
        if(cola.isEmpty()){
            System.out.println("La cola ha sido llenada y vaciada correctamente");
        }*/
        //Pila :D
        /*for (int i=1; i<=1000000; i++){
            int value = aleatorio.nextInt(10000000-(-10000000)+1)+(-10000000);
            //arreglo.add(value);
            pila.push(value);
        }
        System.out.println("Size: " +pila.size());
        System.out.println(pila);
        for (int i=1; i<=1000000; i++){
            pila.pop();
        }
        System.out.println("Size: " +pila.size());
        //System.out.println(pila);
        if(pila.isEmpty()){
            System.out.println("La pila ha sido llenada y vaciada correctamente");
        }*/
        
        //Generar Numeros
        /*for (int i=1; i<=1000000; i++){
            int value = aleatorio.nextInt(10000000-(-10000000)+1)+(-10000000);
            arreglo.add(value);
            //cola.add(value);
        }*/
        //Cola_mejorado :D
        /*Iterator<Integer> itr = arreglo.iterator(); 
        while(itr.hasNext()){
            cola.add(itr.next());
        }
        //System.out.println(arreglo+"\n");
        System.out.println("Size: " + cola.size());
        System.out.println(cola);
        for (int i=1; i<=1000000; i++){
            cola.remove();
        }
        System.out.println("Size: " + cola.size());
        if(cola.isEmpty()){
            System.out.println("La cola ha sido llenada y vaciada correctamente");
        }*/
        
        //Pila_mejorado :D
        /*Iterator<Integer> itrp = arreglo.iterator(); 
        while(itrp.hasNext()){
            pila.push(itrp.next());
        }
        System.out.println("Size: " +pila.size());
        System.out.println(pila);
        for (int i=1; i<=1000000; i++){
            pila.pop();
        }
        System.out.println("Size: " +pila.size());
        //System.out.println(pila);
        if(pila.isEmpty()){
            System.out.println("La pila ha sido llenada y vaciada correctamente");
        }*/
    }
    
}
