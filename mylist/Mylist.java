/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author ubuntu
 */
public class Mylist extends form1 {

    /**
     * @param args the command line arguments
     */
    //
    public static void main(String[] args) {
        // TODO code application logic here
        form1 formulario = new form1();
        formulario.setVisible(true);
        
        lista a = new lista();
        a.insertar(0, 0);
        a.imprimir();
        a.insertar(1, 1);//insertar( int, int)
        a.imprimir();
        a.insertar(2, 2);//insertar( int, int)
        a.imprimir();
        a.insertar(3, 3);//insertar( int, int)
        a.imprimir();
        a.insertar(4, 4);
        a.insertar(5, 5);
        a.imprimir();
        //Metodo donde adapto el buscar e elimina de la clase lista
        //Actualmente pues elimina de la lista de nodos el numero que ingrese por consola
        //Si ingreso el nodo cero [0] me elimina toda la cola del arbol por este ser el primer nodo.
        //Intente adaptarlo al jframe esta misma logica pero no me fue exitoso, quisiera aclarar algunas dudas en clase Ing.
        System.out.println("Ingrese  codigo");
        Scanner sc = new Scanner (System.in);
        int codigo = sc.nextInt();
        boolean leer = false;
        leer = a.buscar(codigo);
        if(leer == true){
            System.out.println("Voy a eliminar esto =  " + "   llave  "+codigo + "   nodo   "+codigo+ "  numero  " + codigo);
            a.eliminar(codigo);
        }else{
            System.out.println("el valor me devuelve false, no puedo eliminarlo...");
            a.imprimir();
        }
        a.imprimir();
    }
}
