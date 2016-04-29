/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programgenerico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casa
 */
public class list<T>{
 
    ArrayList<T> list = new ArrayList<T>(100);
    protected int i;
    
    public list(){      }
    public void almacenarultimodisponible( T dato){
        
        list.add(dato);
        System.out.println("Se ha guardado el dato");
        
    }
    
    public void almacenarenposicion(int pos, T dato){
        
        try {
            this.list.add(pos, dato);
            System.out.println("Se ha guardad el dato");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Fuera del limite de posiciones");
        }

    }
    
    public ArrayList<T> devuelvealmacenados(){
        
        return this.list;
    }
    
    public T devuelveprimero(){
        return list.get(0);
    }
    
    public T devuelveultimoexistente(){
        return this.list.get(this.list.size() - 1);
    }
    
}


