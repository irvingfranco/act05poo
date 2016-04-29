/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programgenerico;

/**
 *
 * @author casa
 */
public class persona {
    String nombre, sexo;
    int edad;
    public persona(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setsexo(String sexo){
      this.sexo = sexo;  
    }
    
    public void setedad(int edad){
        this.edad = edad;
    }
    
    public String getnombre(){
        return nombre;
    }
    public String getsexo(){
        return sexo;

    }
    public int getedad(){
        return edad;
    }
}
