/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

/**
 *
 * @author ubuntu
 */
public class Nodo {
  private  int numero ;
  private  int llave;
    
 private   Nodo siguiente;
 //siguiente= new Nodo();
 
 
 
    Nodo( int n, int l){ //constructor
    this.numero=n;
    
   
    this.llave=l;
    System.out.println("creando nodo ");
    System.out.println("numero:"+this.numero);
        System.out.println("llave:"+this.llave);
    }
    
    
    public void set_siguiente(Nodo s)
    {
    this.siguiente=s;
    }
    public Nodo get_siguiente()
    {
    return this.siguiente;
    }
    
    public int get_numero(){
    return this.numero;
    }
    
    public void set_numero(int n)
    {
      //  if(this.llave==llave)
    this.numero=n;
    }
    
    public int get_llave()
    {
        return this.llave; 
    }
    
    public void set_llave(int l)
    {
        this.llave=l;
    }
    
}
