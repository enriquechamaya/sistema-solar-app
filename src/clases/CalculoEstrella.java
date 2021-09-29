/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Saul
 */
public class CalculoEstrella {
    
    
    private String nombre;
    private String apellido;
    private int peso;
    private int estrella;
   
     
    
     public String Modelo(){
        String v[]={"","sol"};
        return v[estrella];
    }
    
    public double FuerzaG(){
        double f[]={0, 27.072};
        return f[estrella];
    }
    
    public double resultado(){
        return  Math.round(FuerzaG()*peso);
    }

    public CalculoEstrella() {
    }
    
 
    public CalculoEstrella(String nombre, String apellido, int peso, int estrella) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estrella = estrella;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

 

    
}
