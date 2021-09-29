
package clases;

/**
 *
 * @author Saul
 */
public class CalculoSatelite {

    private String nombre;
    private String apellido;
    private int peso;
    private int satelite;
   
    //private double fuerzaG;

    
    public String Modelo(){
        String v[]={"","luna"};
        return v[satelite];
    }
    
    public double FuerzaG(){
        double f[]={0, .166};
        return f[satelite];
    }
    
    public double resultado(){
        return  Math.round(FuerzaG()*peso);
    }

    public CalculoSatelite() {
    }

    public CalculoSatelite(String nombre, String apellido, int peso, int satelite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.satelite = satelite;
    }

    
    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getSatelite() {
        return satelite;
    }

    public void setSatelite(int satelite) {
        this.satelite = satelite;
    }

 
    
}


