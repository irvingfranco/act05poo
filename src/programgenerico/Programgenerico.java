/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programgenerico;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author casa
 */
public class Programgenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list<String> au = new list<String>();
        
        au.almacenarultimodisponible("hola");
        au.almacenarultimodisponible("achu");
        au.almacenarultimodisponible("tengohambre");
        System.out.println(au.devuelvealmacenados());
        System.out.println("");
        
        list<Integer> ad = new list<Integer>();
        
        ad.almacenarultimodisponible(34);
        ad.almacenarultimodisponible(45);
        ad.almacenarultimodisponible(76);
        System.out.println(ad.devuelvealmacenados());
        System.out.println("");
        
        list<Float> f = new list<Float>();
        
        f.almacenarultimodisponible(52.6f);
        f.almacenarultimodisponible(55.456f);
        f.almacenarultimodisponible(71.451f);
        System.out.println(f.devuelvealmacenados());
        System.out.println("");
        
        list<persona> p = new list<persona>();
        
        persona p1 = new persona("laura", "femenino", 25);
        persona p2 = new persona("panfilo", "masculino", 15);
        p.almacenarultimodisponible(p1);
        p.almacenarultimodisponible(p2);
        List<persona> t = new ArrayList();
        t = p.devuelvealmacenados();
        System.out.println("");
        
        Scanner escaner = new Scanner(System.in);
        persona p3 = new persona("", "", 0);
        System.out.print("el nombre es: "); 
        String n = escaner.next(); 
        p3.setnombre(n);
        System.out.print("el sexo es: "); 
        String s = escaner.next(); 
        p3.setsexo(s);
        System.out.print("la edad es: "); 
        int e = escaner.nextInt(); 
        p3.setedad(e);
        p.almacenarultimodisponible(p3);
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i).getnombre() + ", " + t.get(i).getsexo() + ", " + t.get(i).getedad());
        
        
    }
    }
}
