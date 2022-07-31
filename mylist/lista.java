/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;

import mylist.Nodo;

/**
 *
 * @author ubuntu
 */
public class lista {
    private Nodo header;//siempre apuntara a la cabeza de la lista
    private Nodo aux;// no muy importa me va aservir en el insert
    
    public void insertar(int numero, int llave)
    {
        if(header==null)
        {
        header= new Nodo(numero, llave);//0
        
        }
        else
        {
        insertar_siguiente(numero,llave);//1
        }
    }
    private void insertar_siguiente(int numero, int llave)
    {
        System.out.println("metodo insertar ");
        if(this.header.get_siguiente()==null)//si ya inserte el 2ndo
        {
         //   Nodo temp= new Nodo(numero,llave);
         //   this.header.set_siguiente(temp);
            this.header.set_siguiente(new Nodo(numero,llave));
            
        }
        else
        {
            aux=this.header.get_siguiente();
            while(aux.get_siguiente()!=null)
            {
              //  if(aux.get_siguiente()!=null)
                
                System.out.println("en el while buscando el null");
                         aux=aux.get_siguiente();
            }
            
            aux.set_siguiente(new Nodo(numero,llave));
        }
    }
    
    public boolean buscar(int llave)//0,2,3,4--- buscando es el 3
    {
        System.out.println("Buscando a:"+llave);
            boolean encontrado=false;
            Nodo iterador=this.header;
            if(iterador!=null){ ///hay alguien en la lista
            
            while(iterador!=null && encontrado==false)
            {
                    if(iterador.get_llave()==llave)
                    {
                    encontrado=true;
                    System.out.println("Encontrado...");
                    return true;
                    }
                    iterador=iterador.get_siguiente();//preguntele a mi hermano
            }
            if(encontrado==false)
            {System.out.println("No Encontrado");}
            }
            
            return false;
            
    }
 public   void imprimir()
    {
        Nodo a=this.header;
        System.out.println("/**imprimiendo******/");
        int c=0;
    while(a!=null)
    {
        System.out.println("nodo:"+c);
        System.out.println("numero:"+a.get_numero());
        System.out.println("llave:"+a.get_llave());
    a=a.get_siguiente();
    c++;
    }
     System.out.println("*****fin*****");
    }
 
 public void eliminar(int l)
 {
boolean encontrado=false;
     if(buscar(l))
     {
         /*vemos si cabeza es null*/
         if(this.header!=null)
         {
             /*vemos si h es o no*/
             if(this.header.get_llave()==l)
             {
                 /*reiniciamos header*/
                 this.header=null;
                 encontrado=true;
             }
             else
             {
             Nodo anterior, presente, despues;
                presente=this.header.get_siguiente();
                /*es el hermano del encabezado*/
                    if(presente!=null && presente.get_llave()==l)
                    {
                         
                         this.header.set_siguiente(null);
                            encontrado=true;
                        
                    
                    }
                    else
                    { 
                        presente=this.header.get_siguiente();
                        anterior=this.header;
                        while(presente!=null && encontrado==false )
                        {
                            despues=presente.get_siguiente();
                            if(presente.get_llave()==l)
                            {
                                encontrado=true;
                                
                                anterior.set_siguiente(despues);
                                
                            }
                            else{
                            anterior=presente;
                            presente=presente.get_siguiente();
                            
                            }
                            
                        }
                    }
             }
         }
     }
     
 }
   
}
